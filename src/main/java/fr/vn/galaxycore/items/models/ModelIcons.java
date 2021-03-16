package fr.vn.galaxycore.items.models;

import org.lwjgl.opengl.GL11;
import JinRyuu.JRMCore.entity.ModelBipedBody;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelIcons extends ModelBipedBody {
    public ModelRenderer iconBase;

    public ModelIcons(float s) {
        super(s, 0, 128, 64);
        this.iconBase = new ModelRenderer(this, 0, 47);
        this.iconBase.setRotationPoint(-5.5F, -25.0F, 0.0F);
        this.iconBase.addBox(0.0F, 0.0F, 0.0F, 11, 15, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
        GL11.glScalef(1.3F, 1.4F, 1.3F);
        this.iconBase.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
