//package fr.vn.galaxycore.client.gui;
//
//import JinRyuu.JRMCore.JRMCoreConfig;
//import JinRyuu.JRMCore.JRMCoreGuiScreen;
//import cpw.mods.fml.client.FMLClientHandler;
//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;
//import fr.vn.galaxycore.client.gui.bottons.GuiButtonPause;
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.gui.*;
//import net.minecraft.client.multiplayer.ServerData;
//import net.minecraft.client.multiplayer.ServerData.ServerResourceMode;
//import net.minecraft.client.renderer.Tessellator;
//import net.minecraft.client.resources.I18n;
//import net.minecraft.util.ResourceLocation;
//
//import java.awt.*;
//import java.io.IOException;
//import java.net.URI;
//import java.net.URISyntaxException;
//
//public class GuiMenu extends GuiScreen {
//    public FMLClientHandler fmlClientHandler = FMLClientHandler.instance();
//    public int x, y;
//    public Minecraft mc;
//
//    public GuiMenu(Minecraft mc) {
//        this.mc = mc;
//    }
//
//    public void initGui() {
//        this.x = this.width / 2;
//        this.y = this.height / 2;
//        int value = 40;
//        int value2 = 20;
//        if (mc.getSession().getUsername().equalsIgnoreCase("PanchoCpYT"))
//            this.buttonList.add(new GuiButtonPause(3, this.x - 260 + value2, this.y - 80 + value,
//                    I18n.format("galaxymenu.desarrollador", new Object())));
//        this.buttonList.add(new GuiButtonPause(0, this.x - 220 + value2, this.y - 50 + value,
//                I18n.format("galaxymenu.joinsv", new Object())));
//        this.buttonList.add(new GuiButtonPause(1, this.x - 180 + value2, this.y - 20 + value,
//                I18n.format("galaxymenu.options", new Object())));
//        this.buttonList.add(new GuiButtonPause(2, this.x - 140 + value2, this.y + 10 + value,
//                I18n.format("galaxymenu.leave", new Object())));
//        super.initGui();
//
//    }
//
//    public void drawScreen(int x, int y, float f) {
//        mc.renderEngine.bindTexture(new ResourceLocation("galaxycore", "textures/gui/darkage.png"));
//        Tessellator tessellator = Tessellator.instance;
//        tessellator.startDrawingQuads();
//        tessellator.addVertexWithUV(0.0D, this.height, -100.0D, 0.0D, 1.0D);
//        tessellator.addVertexWithUV(this.width, this.height, -100.0D, 1.0D, 1.0D);
//        tessellator.addVertexWithUV(this.width, 0.0D, -100.0D, 1.0D, 0.0D);
//        tessellator.addVertexWithUV(0.0D, 0.0D, -100.0D, 0.0D, 0.0D);
//        tessellator.draw();
//        super.drawScreen(x, y, f);
//    }
//
//    @SideOnly(Side.CLIENT)
//    public void openLink(final String url) {
//        if (Desktop.isDesktopSupported()) {
//            try {
//                Desktop.getDesktop().browse(new URI(url));
//            }
//            catch (IOException e) {
//                e.printStackTrace();
//            }
//            catch (URISyntaxException e2) {
//                e2.printStackTrace();
//            }
//        }
//    }
//
//    public void actionPerformed(GuiButton guiButton) {
//        switch (guiButton.id) {
//            case 0:
//                ConnectServer("mc.galaxydbc.com");
//                break;
//            case 1:
//                this.mc.displayGuiScreen(new GuiOptions(this, this.mc.gameSettings));
//                break;
//            case 2:
//                try {
//                    JRMCoreConfig.BensConfig_JRMCore.save();
//                    this.mc.gameSettings.saveOptions();
//                    this.mc.shutdown();
//                } catch (Exception e) {
//                    return;
//                }
//                break;
//            case 3:
//                ConnectServer("localhost");
//                break;
//            case 4:
//                this.openLink("galaxydbc.com");
//        }
//    }
//
//    public void ConnectServer(String ip) {
//        ServerData SERVER = new ServerData("", ip, true);
//        ServerResourceMode.valueOf(ServerResourceMode.ENABLED.toString());
//        fmlClientHandler.setupServerList();
//        fmlClientHandler.connectToServer(this.mc.currentScreen, SERVER);
//    }
//}