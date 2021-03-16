//package fr.vn.galaxycore.client;
//
//import cpw.mods.fml.common.eventhandler.EventPriority;
//import cpw.mods.fml.common.eventhandler.SubscribeEvent;
//import fr.vn.galaxycore.client.gui.*;
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.gui.GuiIngameMenu;
//import net.minecraft.client.gui.GuiMainMenu;
//import net.minecraft.client.gui.GuiOptions;
//import net.minecraftforge.client.event.GuiOpenEvent;
//import scala.collection.parallel.ParIterableLike;
//
//public class GuiEvents {
//    @SubscribeEvent(priority = EventPriority.HIGHEST)
//    public void onOpenGui(GuiOpenEvent event) {
//        if (event.gui instanceof GuiMainMenu)
//            if (OptifineLoaded())
//                event.gui = new GuiMenuMinecraft(Minecraft.getMinecraft());
//            else
//                event.gui = new GuiMenu(Minecraft.getMinecraft());
//
//        if (event.gui instanceof GuiOptions)
//            event.gui = new GuiOptionsB(Minecraft.getMinecraft().currentScreen, Minecraft.getMinecraft().gameSettings);
//
//        if (event.gui instanceof GuiIngameMenu)
//            event.gui = new GuiPause(Minecraft.getMinecraft());
//
//        if (event.gui instanceof net.minecraft.client.gui.GuiDisconnected)
//            event.gui = new GuiDisconnected(Minecraft.getMinecraft().currentScreen, Minecraft.getMinecraft().gameSettings);
//    }
//
//    public boolean OptifineLoaded() {
//        if (doesClassExist("optifine.OptiFineForgeTweaker"))
//            return true;
//
//        return false;
//    }
//
//    public boolean doesClassExist(String name) {
//        Class clazz = getClass(name);
//        return (clazz != null);
//    }
//
//    public Class getClass(String name) {
//        try {
//            return Class.forName(name);
//        } catch (ClassNotFoundException e) {
//            return null;
//        }
//    }
//}