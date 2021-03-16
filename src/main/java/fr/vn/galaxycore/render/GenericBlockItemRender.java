package fr.vn.galaxycore.render;

import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class GenericBlockItemRender implements IItemRenderer {

    private TileEntity tile;
    private TileEntitySpecialRenderer renderer;

    public GenericBlockItemRender(TileEntity tile, TileEntitySpecialRenderer renderer){
        this.tile = tile;
        this.renderer = renderer;
    }

    public boolean handleRenderType(ItemStack item, IItemRenderer.ItemRenderType type){
        return false;
    }

    public boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType type, ItemStack item, IItemRenderer.ItemRendererHelper helper){
        return true;
    }

    public void renderItem(IItemRenderer.ItemRenderType type, ItemStack item, Object... data){
        GL11.glPushMatrix();
        GL11.glPopMatrix();
    }
}
