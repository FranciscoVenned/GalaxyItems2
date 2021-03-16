package fr.vn.galaxycore.render;

import fr.vn.galaxycore.model.PiruletaHalloween;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class PiruletaHalloweenRender implements IItemRenderer {
    private final PiruletaHalloween model;

    public PiruletaHalloweenRender() {
        this.model = new PiruletaHalloween();
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
                .bindTexture(new ResourceLocation("galaxycore", "textures/items/piruleta_halloween.png"));

        switch (type) {
            case EQUIPPED:
                GL11.glPushMatrix();
                GL11.glRotatef(25.0F, 0.0F, 30.0F, 10.0F);
                GL11.glTranslatef(0.35F, -1.8F, 0.0F);
                GL11.glScalef(1.25F, 1.35F, 1.25F);
                this.model.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                GL11.glPopMatrix();
                break;
            case EQUIPPED_FIRST_PERSON:
                GL11.glPushMatrix();
                GL11.glRotatef(0.0F, 0.0F, 0.0F, 20.0F);
                GL11.glTranslatef(0.7F, -1.9F, 0.3F);
                GL11.glScalef(1.3F, 1.5F, 1.3F);
                this.model.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                GL11.glPopMatrix();
                break;
            case ENTITY:
                GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
                GL11.glTranslatef(-0.3F, -1.9F, 0.0F);
                GL11.glScalef(1.1F, 1.1F, 1.1F);
                this.model.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                break;
            case INVENTORY:
                GL11.glTranslatef(8.0F, -4.0F, 0.0F);
                GL11.glRotatef(0.0F, 90.0F, 0.0F, 0.0F);
                GL11.glScalef(13.0F, 13.0F, 13.0F);
                this.model.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                break;
            default:
                break;
        }
    }
}