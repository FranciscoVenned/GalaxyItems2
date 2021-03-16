package fr.vn.galaxycore.items;

import fr.vn.galaxycore.items.registerblockmodels.BlockPilarA;
import fr.vn.galaxycore.items.registerblockmodels.BlockPilarB;
import fr.vn.galaxycore.items.registerblockmodels.BlockPilarC;
import fr.vn.galaxycore.items.registerblockmodels.BlockTable;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static Block Table;
    public static Block PilarA;
    public static Block PilarB;
    public static Block PilarC;
    public static List<Block>blockList= new ArrayList<Block>();


    public static void registerBlocks(){
        blockList.add(Table =new BlockTable().setCreativeTab(CreativeTabs.tabMaterials));
        blockList.add(PilarA = new BlockPilarA().setCreativeTab(CreativeTabs.tabMaterials));
        blockList.add(PilarB = new BlockPilarB().setCreativeTab(CreativeTabs.tabMaterials));
        blockList.add(PilarC = new BlockPilarC().setCreativeTab(CreativeTabs.tabMaterials));
    }
}
