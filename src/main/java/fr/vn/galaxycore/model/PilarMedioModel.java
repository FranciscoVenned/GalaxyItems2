package fr.vn.galaxycore.model;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class PilarMedioModel extends ModelBase {
    private final ModelRenderer bb_main;

    public PilarMedioModel() {
        textureWidth = 64;
        textureHeight = 64;

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.0F, -16.0F, -5.0F, 12, 16, 10, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -8.0F, -16.0F, -2.0F, 16, 16, 4, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -2.0F, -16.0F, -8.0F, 4, 16, 16, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -4.0F, -16.0F, -7.0F, 8, 16, 14, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -7.0F, -16.0F, -4.0F, 14, 16, 8, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -4.0F, -16.0F, -6.0F, 8, 16, 12, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.0F, -16.0F, -4.0F, 12, 16, 8, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 4.0F, -16.0F, -6.0F, 1, 16, 12, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -5.0F, -16.0F, -6.0F, 1, 16, 12, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -3.5F, -16.0F, 6.5F, 2, 16, 1, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -4.5F, -16.0F, 5.5F, 1, 16, 1, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -5.5F, -16.0F, 4.5F, 1, 16, 1, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.5F, -16.0F, 3.5F, 1, 16, 1, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.5F, -16.0F, -4.5F, 1, 16, 1, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -5.5F, -16.0F, -5.5F, 1, 16, 1, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -4.5F, -16.0F, -6.5F, 1, 16, 1, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -3.5F, -16.0F, -7.5F, 2, 16, 1, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 1.5F, -16.0F, -7.5F, 2, 16, 1, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 3.5F, -16.0F, -6.5F, 1, 16, 1, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 4.5F, -16.0F, -5.5F, 1, 16, 1, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 5.5F, -16.0F, -4.5F, 1, 16, 1, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 5.5F, -16.0F, 3.5F, 1, 16, 1, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -7.5F, -16.0F, -3.5F, 1, 16, 2, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 6.5F, -16.0F, -3.5F, 1, 16, 2, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 6.5F, -16.0F, 1.5F, 1, 16, 2, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 4.5F, -16.0F, 4.5F, 1, 16, 1, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 3.5F, -16.0F, 5.5F, 1, 16, 1, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 1.5F, -16.0F, 6.5F, 2, 16, 1, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -7.5F, -16.0F, 1.5F, 1, 16, 2, 0.0F));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bb_main.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
