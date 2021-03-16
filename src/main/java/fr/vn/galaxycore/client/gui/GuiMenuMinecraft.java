//package fr.vn.galaxycore.client.gui;
//
//import JinRyuu.JRMCore.JRMCoreConfig;
//import cpw.mods.fml.client.FMLClientHandler;
//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;
//import fr.vn.galaxycore.client.gui.bottons.GuiButtonPause;
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.gui.GuiButton;
//import net.minecraft.client.gui.GuiMainMenu;
//import net.minecraft.client.gui.GuiOptions;
//import net.minecraft.client.multiplayer.ServerData;
//import net.minecraft.client.multiplayer.ServerData.ServerResourceMode;
//import net.minecraft.client.resources.I18n;
//
//@SideOnly(Side.CLIENT)
//public class GuiMenuMinecraft extends GuiMainMenu {
//    public FMLClientHandler fmlClientHandler = FMLClientHandler.instance();
//    public int x, y;
//    public Minecraft mc;
//
//    public GuiMenuMinecraft(Minecraft mc) {
//        this.mc = mc;
//    }
//
//    public void initGui() {
//        this.x = this.width / 2;
//        this.y = this.height / 2;
//        int value = 40;
//        super.initGui();
//        this.buttonList.clear();
//        if (mc.getSession().getUsername().equalsIgnoreCase("PanchoCpYT"))
//            this.buttonList.add(new GuiButtonPause(3, this.x - 100, this.y - 90 + value,
//                I18n.format("galaxymenu.desarrollador", new Object())));
//        this.buttonList.add(new GuiButtonPause(0, this.x - 100, this.y - 50 + value,
//                I18n.format("galaxymenu.joinsv", new Object())));
//        this.buttonList.add(new GuiButtonPause(1, this.x - 100, this.y - 20 + value,
//                I18n.format("galaxymenu.options", new Object())));
//        this.buttonList.add(new GuiButtonPause(2, this.x - 100, this.y + 10 + value,
//                I18n.format("galaxymenu.leave", new Object())));
//    }
//
//    public void drawScreen(int x, int y, float f) {
//        super.drawScreen(y, y, f);
//    }
//
//    public void actionPerformed(GuiButton guiButton) {
//        switch (guiButton.id) {
//            case 0:
//                ConnectServer("172.106.163.197:25664");
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