package fr.vn.galaxycore.model;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TableModel extends ModelBase {
private final ModelRenderer bone;

public TableModel() {
        textureWidth = 16;
        textureHeight = 16;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 6, -11.0F, -1.0F, 4.0F, 6, 1, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 6, -11.0F, -16.0F, 4.0F, 6, 1, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 9, 6, -11.0F, -15.0F, 12.0F, 6, 1, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 9, 6, -11.0F, -15.0F, 0.0F, 6, 1, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 9, 6, -11.0F, -2.0F, 12.0F, 6, 1, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 9, 6, -11.0F, -3.0F, 13.4F, 6, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 7, 6, -11.0F, -3.0F, 1.6F, 6, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 9, 6, -11.0F, -14.0F, 13.4F, 6, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 7, 6, -11.0F, -14.0F, 1.6F, 6, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 9, 6, -13.0F, -5.0F, 13.4F, 10, 2, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 7, 6, -13.0F, -5.0F, 1.6F, 10, 2, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 9, 6, -13.0F, -13.0F, 13.4F, 10, 2, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 7, 6, -13.0F, -13.0F, 1.6F, 10, 2, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 9, 6, -14.0F, -11.0F, 13.4F, 12, 6, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 7, 6, -14.0F, -11.0F, 1.6F, 12, 6, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 9, 6, -11.0F, -2.0F, 0.0F, 6, 1, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -5.0F, -15.0F, 4.0F, 2, 1, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -13.0F, -15.0F, 4.0F, 2, 1, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -5.0F, -2.0F, 4.0F, 2, 1, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 4, 2, -5.0F, -3.0F, 12.0F, 2, 1, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 4, 2, -5.0F, -3.0F, 0.0F, 2, 1, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 4, 2, -13.0F, -3.0F, 12.0F, 2, 1, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 4, 2, -13.0F, -3.0F, 0.0F, 2, 1, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -5.0F, -14.0F, 12.0F, 2, 1, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -5.0F, -14.0F, 0.0F, 2, 1, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -13.0F, -14.0F, 12.0F, 2, 1, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -13.0F, -14.0F, 0.0F, 2, 1, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -13.0F, -2.0F, 4.0F, 2, 1, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 1, -3.0F, -14.0F, 4.0F, 1, 1, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -14.0F, -14.0F, 4.0F, 1, 1, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -3.0F, -3.0F, 4.0F, 1, 1, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 1, -14.0F, -3.0F, 4.0F, 1, 1, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -2.0F, -13.0F, 4.0F, 1, 2, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 1, -15.0F, -13.0F, 4.0F, 1, 2, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 1, -2.0F, -5.0F, 4.0F, 1, 2, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 3, 1, -3.0F, -13.0F, 12.0F, 1, 2, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 3, 1, -3.0F, -13.0F, 0.0F, 1, 2, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 3, 1, -14.0F, -13.0F, 12.0F, 1, 2, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 3, 1, -14.0F, -13.0F, 0.0F, 1, 2, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 3, 1, -3.0F, -5.0F, 12.0F, 1, 2, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 3, 1, -3.0F, -5.0F, 0.0F, 1, 2, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 3, 1, -14.0F, -5.0F, 12.0F, 1, 2, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 3, 1, -14.0F, -5.0F, 0.0F, 1, 2, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -15.0F, -5.0F, 4.0F, 1, 2, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 1, -1.0F, -11.0F, 4.0F, 1, 6, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 1, -2.0F, -11.0F, 12.0F, 1, 6, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 1, -2.0F, -11.0F, 0.0F, 1, 6, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 1, -15.0F, -11.0F, 12.0F, 1, 6, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 1, -15.0F, -11.0F, 0.0F, 1, 6, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -16.0F, -11.0F, 4.0F, 1, 6, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 15, 15, -8.5F, -6.0F, -0.5F, 1, 1, 2, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 15, 15, -8.5F, -5.0F, -1.5F, 1, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 15, 15, -8.49F, -5.7929F, -1.0F, 0, 1, 0, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 13, -16.0F, -6.0F, 3.0F, 16, 6, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 13, -16.0F, -6.0F, 12.0F, 16, 6, 1, 0.0F));
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
