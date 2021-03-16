package fr.vn.galaxycore.ores;


import fr.vn.galaxycore.LoaderItems;
import fr.vn.galaxycore.items.registerblockmodels.BlockPilarB;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


import java.util.Random;

public class CreeperOre extends Block {
    public CreeperOre(final Material mat) {
        super(mat);
        this.setBlockName("CreeperOre").setHardness(1.2f).setResistance(30.0f);
        this.setStepSound(Block.soundTypeStone).setHarvestLevel("pickaxe", 2);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockTextureName("galaxycore:creeper_ore");
    }

    public Item getItemDropped(final int meta, final Random random, final int fortune) {
        return LoaderItems.CreeperIngot;
    }

    public int damageDropped(final int metadata) {
        return 0;
    }

    public int quantityDropped(final int meta, final int fortune, final Random random) {
        return 1;
    }
}

