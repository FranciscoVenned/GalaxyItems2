package fr.vn.galaxycore.items.registerblockmodels;

import fr.vn.galaxycore.render.renderblocks.TileEntityPilarA;
import fr.vn.galaxycore.render.renderblocks.TileEntityPilarB;
import fr.vn.galaxycore.render.renderblocks.TileEntityTable;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockPilarC extends BlockContainer {
    public BlockPilarC() {
        super(Material.wood);
        setBlockName("PilarC");
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean isNormalCube() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int id) {
        return new TileEntityPilarB();
    }
}