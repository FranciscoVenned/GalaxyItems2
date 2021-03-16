// 
// Decompiled by Procyon v0.5.36
// 

package fr.vn.galaxycore.items;

import fr.vn.galaxycore.GalaxyCore;
import fr.vn.galaxycore.LoaderItems;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

public class MixedOre extends Block
{
    public MixedOre(final Material mat) {
        super(mat);
        this.setBlockName("MixedOre").setHardness(1.2f).setResistance(30.0f);
        this.setStepSound(Block.soundTypeStone).setHarvestLevel("pickaxe", 2);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockTextureName("galaxycore:multi_ore");
    }
    
    public Item getItemDropped(final int meta, final Random random, final int fortune) {
        return LoaderItems.mixedIngot;
    }
    
    public int damageDropped(final int metadata) {
        return 0;
    }
    
    public int quantityDropped(final int meta, final int fortune, final Random random) {
        return 1;
    }
}
