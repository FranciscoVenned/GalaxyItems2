package fr.vn.galaxycore.model;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class StormBreaker extends ModelBase {
    private final ModelRenderer group;
    private final ModelRenderer cabeza;
    private final ModelRenderer cuerdas;

    public StormBreaker() {
        textureWidth = 64;
        textureHeight = 64;

        group = new ModelRenderer(this);
        group.setRotationPoint(-16.0F, 16.0F, 16.0F);
        group.cubeList.add(new ModelBox(group, 0, 1, 6.5F, -10.0F, -8.5F, 1, 32, 1, 0.0F));
        group.cubeList.add(new ModelBox(group, 0, 1, 7.0F, -10.0F, -8.0F, 1, 32, 1, 0.0F));
        group.cubeList.add(new ModelBox(group, 0, 1, 6.5F, -10.0F, -7.5F, 1, 32, 1, 0.0F));
        group.cubeList.add(new ModelBox(group, 0, 1, 7.5F, -10.0F, -8.5F, 1, 32, 1, 0.0F));
        group.cubeList.add(new ModelBox(group, 0, 1, 7.5F, -10.0F, -7.5F, 1, 32, 1, 0.0F));
        group.cubeList.add(new ModelBox(group, 0, 1, 7.0F, -10.0F, -9.0F, 1, 32, 1, 0.0F));
        group.cubeList.add(new ModelBox(group, 0, 1, 7.0F, -10.0F, -7.0F, 1, 32, 1, 0.0F));
        group.cubeList.add(new ModelBox(group, 0, 1, 8.0F, -10.0F, -8.0F, 1, 32, 1, 0.0F));
        group.cubeList.add(new ModelBox(group, 0, 1, 6.0F, -10.0F, -8.0F, 1, 32, 1, 0.0F));

        cabeza = new ModelRenderer(this);
        cabeza.setRotationPoint(-8.0F, 16.0F, 8.0F);
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 5, 4.25F, -13.0F, -2.0F, 9, 1, 5, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 5, -1.5F, -14.0F, -2.0F, 8, 1, 5, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 1, -1.5F, -15.75F, 0.25F, 8, 4, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 1, 4.5F, -15.8125F, -1.5F, 8, 4, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 5, 1.0F, -15.75F, -2.0F, 1, 4, 5, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 5, 9.0F, -19.0F, -2.0F, 1, 11, 5, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 11, 9.0F, -15.8125F, -5.25F, 1, 4, 11, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 0, 3.0F, -16.25F, -2.5F, 0, 0, 0, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 1, 1, 3.0F, -11.0F, 3.0F, 0, 0, 0, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 2, 3, 3.0F, -11.0F, -2.5F, 0, 0, 0, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 1, 3.0F, -16.25F, 3.0F, 0, 0, 0, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 0, 3.75F, -16.5F, -2.75F, 0, 0, 0, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 2, 2, 3.75F, -11.0F, 3.0F, 0, 0, 0, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 3, 4, 3.75F, -11.0F, -2.75F, 0, 0, 0, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 1, 3.75F, -16.5F, 3.0F, 0, 0, 0, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 1, 4.5F, -16.75F, -3.0F, 0, 1, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 3, 3, 4.5F, -11.0F, 3.0F, 0, 1, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 1, 2, 4.5F, -16.75F, 3.0F, 0, 1, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 4, 6, 4.5F, -11.0F, -3.0F, 0, 1, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 1, 5.25F, -17.0F, -3.25F, 0, 1, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 5, 7, 5.25F, -11.0F, -3.25F, 0, 1, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 3, 3, 5.25F, -11.0F, 3.0F, 0, 1, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 1, 2, 5.25F, -17.0F, 3.0F, 0, 1, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 1, 6.75F, -17.5F, -3.75F, 0, 1, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 5, 5, 6.75F, -11.0F, 3.0F, 0, 1, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 1, 3, 6.75F, -17.5F, 3.0F, 0, 1, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 7, 10, 6.75F, -11.0F, -3.75F, 0, 1, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 2, 7.5F, -17.75F, -4.0F, 0, 2, 2, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 6, 6, 7.5F, -11.0F, 3.0F, 0, 2, 2, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 8, 12, 7.5F, -11.0F, -4.0F, 0, 2, 2, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 2, 4, 7.5F, -17.75F, 3.0F, 0, 2, 2, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 2, 8.25F, -18.0F, -4.25F, 0, 2, 2, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 6, 6, 8.25F, -11.0F, 3.0F, 0, 2, 2, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 9, 13, 8.25F, -11.0F, -4.25F, 0, 2, 2, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 2, 4, 8.25F, -18.0F, 3.0F, 0, 2, 2, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 2, 9.0F, -18.25F, -4.5F, 1, 2, 2, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 7, 7, 9.0F, -11.0F, 3.0F, 1, 2, 2, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 10, 15, 9.0F, -11.0F, -4.5F, 1, 2, 2, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 2, 5, 9.0F, -18.25F, 3.0F, 1, 2, 2, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 1, 6.0F, -17.25F, -3.5F, 0, 1, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 4, 4, 6.0F, -11.0F, 3.0F, 0, 1, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 6, 9, 6.0F, -11.25F, -3.5F, 0, 1, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 1, 3, 6.0F, -17.25F, 3.0F, 0, 1, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 8, 10.0F, -17.25F, -3.5F, 1, 8, 8, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 4, -5.0F, -17.0F, -1.5F, 3, 7, 4, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 4, -6.0F, -17.0F, -1.5F, 1, 7, 4, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 3, -7.0F, -18.0F, -1.25F, 1, 9, 3, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 3, -8.0F, -19.0F, -1.0F, 1, 11, 3, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 2, -9.0F, -19.75F, -0.75F, 1, 12, 2, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 2, -10.0F, -20.75F, -0.5F, 1, 14, 2, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 1, -11.0F, -21.5F, -0.25F, 1, 16, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 1, -12.0F, -22.25F, 0.0F, 1, 17, 1, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 0, -13.0F, -23.0F, 0.25F, 1, 19, 0, 0.0F));
        cabeza.cubeList.add(new ModelBox(cabeza, 0, 3, -2.0F, -19.25F, -1.25F, 3, 10, 3, 0.0F));

        cuerdas = new ModelRenderer(this);
        cuerdas.setRotationPoint(-7.0F, -18.0F, 8.0F);
        cabeza.addChild(cuerdas);
        cuerdas.cubeList.add(new ModelBox(cuerdas, 0, 3, 5.75F, 10.75F, -9.25F, 0, 0, 3, 0.0F));
        cuerdas.cubeList.add(new ModelBox(cuerdas, 0, 3, 5.75F, 3.75F, -9.25F, 0, 0, 3, 0.0F));
        cuerdas.cubeList.add(new ModelBox(cuerdas, 0, 3, 2.25F, 3.25F, -9.25F, 0, 0, 3, 0.0F));
        cuerdas.cubeList.add(new ModelBox(cuerdas, 0, 3, 2.0F, 12.0F, -9.25F, 0, 0, 3, 0.0F));
        cuerdas.cubeList.add(new ModelBox(cuerdas, 0, 0, 4.5F, 8.25F, -9.75F, 0, 0, 0, 0.0F));
        cuerdas.cubeList.add(new ModelBox(cuerdas, 0, 0, 1.5F, 2.0F, -9.75F, 0, 9, 0, 0.0F));
        cuerdas.cubeList.add(new ModelBox(cuerdas, 0, 0, 11.25F, 1.25F, -9.75F, 0, 9, 0, 0.0F));
        cuerdas.cubeList.add(new ModelBox(cuerdas, 0, 0, 11.25F, 1.25F, -5.75F, 0, 9, 0, 0.0F));
        cuerdas.cubeList.add(new ModelBox(cuerdas, 0, 0, 1.5F, 2.0F, -5.75F, 0, 9, 0, 0.0F));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        group.render(f5);
        cabeza.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
