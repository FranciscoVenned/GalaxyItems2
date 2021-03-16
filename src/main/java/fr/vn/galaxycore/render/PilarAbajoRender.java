package fr.vn.galaxycore.render;

import org.lwjgl.opengl.GL11;
import fr.vn.galaxycore.LoaderItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class PilarAbajoRender extends TileEntitySpecialRenderer {
    public ModelBase MODEL;
    public String TEXTUREMAP;
    public Minecraft MC = Minecraft.getMinecraft();

    public PilarAbajoRender(ModelBase MODEL, String TEXTUREMAP) {
        this.MODEL = MODEL;
        this.TEXTUREMAP = "textures/blocks/" + TEXTUREMAP + ".png";
    }

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double var2, double var4, double var6, float var8) {
        int id = tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord);
        GL11.glPushMatrix();
        GL11.glTranslatef((float) var2 + 0.5F, (float) var4 + 1.62F, (float) var6 + 0.5F);
        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef((90 * id), 0.0F, 1.0F, 0.0F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glAlphaFunc(516, 0.003921569F);
        GL11.glEnable(2896);
        MC.getTextureManager().bindTexture(new ResourceLocation(LoaderItems.MODID, TEXTUREMAP));
        MODEL.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
    }
}