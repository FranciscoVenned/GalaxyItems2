package fr.vn.galaxycore.render;

import fr.vn.galaxycore.model.ColmilloModel;
import fr.vn.galaxycore.model.EspadaModel;
import fr.vn.galaxycore.model.LanzaModel;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ColmilloRender implements IItemRenderer {
    private final ColmilloModel model;

    public ColmilloRender() {
        this.model = new ColmilloModel();
    }

    public boolean handleRenderType(final ItemStack item, final IItemRenderer.ItemRenderType type) {
        return type != IItemRenderer.ItemRenderType.FIRST_PERSON_MAP;
    }

    public boolean shouldUseRenderHelper(final IItemRenderer.ItemRenderType type, final ItemStack item,
                                         final IItemRenderer.ItemRendererHelper helper) {
        return false;
    }

    public void renderItem(final IItemRenderer.ItemRenderType type, final ItemStack item, final Object... data) {
        Minecraft.getMinecraft().getTextureManager()
                .bindTexture(new ResourceLocation("galaxycore", "textures/items/colmillomodel.png"));

        switch (type) {
            case EQUIPPED:
                GL11.glPushMatrix();
                GL11.glRotatef(-140.0F, 0.0F, 0.0F, 90.0F);
                GL11.glTranslatef(-0.8F, -1.25F, 0.0F);
                GL11.glScalef(1.0F, 1.2F, 1.0F);
                this.model.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                GL11.glPopMatrix();
                break;
            case EQUIPPED_FIRST_PERSON:
                GL11.glPushMatrix();
                GL11.glRotatef(-165.0F, 0.0F, -0.5F, 20.0F);
                GL11.glTranslatef(-1.2F, -1.15F, 0.3F);
                GL11.glScalef(1.3F, 1.5F, 1.3F);
                this.model.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                GL11.glPopMatrix();
                break;
            case ENTITY:
                GL11.glRotatef(170.0F, 70.0F, 20.0F, 1.0F);
                GL11.glTranslatef(-0.3F, -1.9F, 0.0F);
                GL11.glScalef(1.1F, 1.1F, 1.1F);
                this.model.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                break;
            case INVENTORY:
                GL11.glTranslatef(8.0F, -1.0F, 0.0F);
                GL11.glRotatef(0.0F, 30.0F, 0.0F, 0.0F);
                GL11.glScalef(9.0F, 5.0F, 9.0F);
                this.model.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                break;
            default:
                break;
        }
    }
}