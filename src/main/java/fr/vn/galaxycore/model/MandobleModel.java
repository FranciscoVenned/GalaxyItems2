package fr.vn.galaxycore.model;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class MandobleModel extends ModelBase {
    private final ModelRenderer bone;

    public MandobleModel() {
        textureWidth = 64;
        textureHeight = 64;
        bone = new ModelRenderer(this);
        bone.setRotationPoint(7.0F, 24.0F, -7.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 1, -8.0F, -4.0F, 6.4375F, 1, 4, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 1, -8.25F, -1.0F, 6.75F, 1, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 1, -8.25F, -1.0F, 6.125F, 1, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 1, -7.75F, -1.0F, 6.75F, 1, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 1, -7.75F, -1.0F, 6.125F, 1, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 1, -9.0F, -4.4375F, 6.4375F, 3, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -26.1875F, 6.4375F, 1, 21, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -26.4375F, 6.4375F, 1, 21, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.5F, -25.4375F, 6.4375F, 1, 21, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.25F, -25.875F, 6.4375F, 1, 21, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -7.5F, -25.4375F, 6.4375F, 1, 21, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -7.75F, -25.875F, 6.4375F, 1, 21, 1, 0.0F));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bone.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
