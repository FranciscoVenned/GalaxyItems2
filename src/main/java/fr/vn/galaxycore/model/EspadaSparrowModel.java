package fr.vn.galaxycore.model;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * EspadaSparrow - Frosty
 * Created using Tabula 4.1.1
 */
public class EspadaSparrowModel extends ModelBase {
    public ModelRenderer shape6;
    public ModelRenderer shape6_1;
    public ModelRenderer shape6_2;
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer shape5;

    public EspadaSparrowModel() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.shape4 = new ModelRenderer(this, 0, 0);
        this.shape4.setRotationPoint(-0.6000000000000001F, 16.0F, -1.0F);
        this.shape4.addBox(0.0F, 0.0F, 0.9999999999999999F, 4, 1, 3, 0.0F);
        this.shape5 = new ModelRenderer(this, 0, 0);
        this.shape5.setRotationPoint(-1.0F, 17.0F, -1.5F);
        this.shape5.addBox(0.0F, 0.0F, 0.9999999999999999F, 5, 1, 4, 0.0F);
        this.shape3 = new ModelRenderer(this, 0, 0);
        this.shape3.setRotationPoint(0.4F, 15.0F, 0.0F);
        this.shape3.addBox(0.0F, 0.0F, 0.9999999999999999F, 2, 1, 1, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.shape6_1 = new ModelRenderer(this, 0, 0);
        this.shape6_1.setRotationPoint(1.0F, -3.1F, 1.0F);
        this.shape6_1.addBox(0.0F, 0.0F, 0.0F, 1, 19, 1, 0.0F);
        this.shape6 = new ModelRenderer(this, 0, 0);
        this.shape6.setRotationPoint(0.4F, -4.0F, 1.0F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 1, 19, 1, 0.0F);
        this.shape2 = new ModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(1.0F, 18.0F, 1.0F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.shape6_2 = new ModelRenderer(this, 0, 0);
        this.shape6_2.setRotationPoint(1.5F, -2.4F, 1.0F);
        this.shape6_2.addBox(0.0F, 0.0F, 0.0F, 1, 19, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.shape4.render(f5);
        this.shape5.render(f5);
        this.shape3.render(f5);
        this.shape1.render(f5);
        this.shape6_1.render(f5);
        this.shape6.render(f5);
        this.shape2.render(f5);
        this.shape6_2.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

