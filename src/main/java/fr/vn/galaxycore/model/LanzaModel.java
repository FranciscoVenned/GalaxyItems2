package fr.vn.galaxycore.model;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * StormBreaker - Frost
 * Created using Tabula 4.1.1
 */
public class LanzaModel extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer shape5;
    public ModelRenderer shape6;
    public ModelRenderer shape15;
    public ModelRenderer shape15_1;
    public ModelRenderer shape15_2;
    public ModelRenderer shape15_3;
    public ModelRenderer shape15_4;
    public ModelRenderer shape15_5;
    public ModelRenderer shape15_6;
    public ModelRenderer shape15_7;
    public ModelRenderer shape15_8;
    public ModelRenderer shape15_9;
    public ModelRenderer shape15_10;
    public ModelRenderer shape15_11;
    public ModelRenderer shape27;
    public ModelRenderer shape27_1;
    public ModelRenderer shape27_2;
    public ModelRenderer shape27_3;
    public ModelRenderer shape27_4;
    public ModelRenderer shape32;
    public ModelRenderer shape33;
    public ModelRenderer shape34;
    public ModelRenderer shape35;
    public ModelRenderer shape36;

    public LanzaModel() {
        this.textureWidth = 16;
        this.textureHeight = 16;
        this.shape15_4 = new ModelRenderer(this, 0, -3);
        this.shape15_4.setRotationPoint(-1.3F, -27.8F, 0.0F);
        this.shape15_4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape15_7 = new ModelRenderer(this, 0, -3);
        this.shape15_7.setRotationPoint(1.0F, -26.8F, -1.0F);
        this.shape15_7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape32 = new ModelRenderer(this, 0, -3);
        this.shape32.setRotationPoint(1.0F, -33.0F, 0.0F);
        this.shape32.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape15_10 = new ModelRenderer(this, 0, -3);
        this.shape15_10.setRotationPoint(1.0F, -28.8F, -3.0F);
        this.shape15_10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape35 = new ModelRenderer(this, 0, -3);
        this.shape35.setRotationPoint(5.3F, -27.8F, 0.0F);
        this.shape35.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape27 = new ModelRenderer(this, 0, -3);
        this.shape27.setRotationPoint(1.0F, -32.0F, 0.0F);
        this.shape27.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.shape33 = new ModelRenderer(this, 0, -3);
        this.shape33.setRotationPoint(1.0F, -27.8F, -4.0F);
        this.shape33.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 6);
        this.shape1.setRotationPoint(0.0F, -25.8F, 0.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 3, 50, 1, 0.0F);
        this.shape4 = new ModelRenderer(this, 0, 0);
        this.shape4.setRotationPoint(1.5F, -25.8F, -0.5F);
        this.shape4.addBox(0.0F, 0.0F, 0.0F, 1, 50, 1, 0.0F);
        this.shape15_11 = new ModelRenderer(this, 0, -3);
        this.shape15_11.setRotationPoint(1.0F, -28.8F, 3.0F);
        this.shape15_11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape15_5 = new ModelRenderer(this, 0, -3);
        this.shape15_5.setRotationPoint(-2.3F, -28.8F, 0.0F);
        this.shape15_5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape3 = new ModelRenderer(this, 0, 0);
        this.shape3.setRotationPoint(0.5F, -25.8F, -0.5F);
        this.shape3.addBox(0.0F, 0.0F, 0.0F, 1, 50, 1, 0.0F);
        this.shape36 = new ModelRenderer(this, 0, -3);
        this.shape36.setRotationPoint(-3.3F, -27.8F, 0.0F);
        this.shape36.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape27_3 = new ModelRenderer(this, 0, -3);
        this.shape27_3.setRotationPoint(1.0F, -31.5F, 1.0F);
        this.shape27_3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.shape2 = new ModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(1.0F, -25.8F, -1.0F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 1, 50, 3, 0.0F);
        this.shape27_4 = new ModelRenderer(this, 0, -3);
        this.shape27_4.setRotationPoint(1.0F, -31.5F, -1.0F);
        this.shape27_4.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.shape15_2 = new ModelRenderer(this, 0, -3);
        this.shape15_2.setRotationPoint(4.3F, -28.8F, 0.0F);
        this.shape15_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape34 = new ModelRenderer(this, 0, -3);
        this.shape34.setRotationPoint(1.0F, -27.8F, 4.0F);
        this.shape34.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape6 = new ModelRenderer(this, 0, 0);
        this.shape6.setRotationPoint(0.5F, -25.8F, 0.5F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 1, 50, 1, 0.0F);
        this.shape27_2 = new ModelRenderer(this, 0, -3);
        this.shape27_2.setRotationPoint(0.0F, -31.5F, 0.0F);
        this.shape27_2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.shape15 = new ModelRenderer(this, 0, -3);
        this.shape15.setRotationPoint(2.3F, -26.8F, 0.0F);
        this.shape15.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape15_6 = new ModelRenderer(this, 0, -3);
        this.shape15_6.setRotationPoint(1.0F, -26.8F, 1.0F);
        this.shape15_6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape15_3 = new ModelRenderer(this, 0, -3);
        this.shape15_3.setRotationPoint(-0.3F, -26.8F, 0.0F);
        this.shape15_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape15_8 = new ModelRenderer(this, 0, -3);
        this.shape15_8.setRotationPoint(1.0F, -27.8F, -2.0F);
        this.shape15_8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape27_1 = new ModelRenderer(this, 0, -3);
        this.shape27_1.setRotationPoint(2.0F, -31.5F, 0.0F);
        this.shape27_1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.shape15_9 = new ModelRenderer(this, 0, -3);
        this.shape15_9.setRotationPoint(1.0F, -27.8F, 2.0F);
        this.shape15_9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape15_1 = new ModelRenderer(this, 0, -3);
        this.shape15_1.setRotationPoint(3.3F, -27.8F, 0.0F);
        this.shape15_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape5 = new ModelRenderer(this, 0, 0);
        this.shape5.setRotationPoint(1.5F, -25.8F, 0.5F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 1, 50, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.shape15_4.render(f5);
        this.shape15_7.render(f5);
        this.shape32.render(f5);
        this.shape15_10.render(f5);
        this.shape35.render(f5);
        this.shape27.render(f5);
        this.shape33.render(f5);
        this.shape1.render(f5);
        this.shape4.render(f5);
        this.shape15_11.render(f5);
        this.shape15_5.render(f5);
        this.shape3.render(f5);
        this.shape36.render(f5);
        this.shape27_3.render(f5);
        this.shape2.render(f5);
        this.shape27_4.render(f5);
        this.shape15_2.render(f5);
        this.shape34.render(f5);
        this.shape6.render(f5);
        this.shape27_2.render(f5);
        this.shape15.render(f5);
        this.shape15_6.render(f5);
        this.shape15_3.render(f5);
        this.shape15_8.render(f5);
        this.shape27_1.render(f5);
        this.shape15_9.render(f5);
        this.shape15_1.render(f5);
        this.shape5.render(f5);
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

