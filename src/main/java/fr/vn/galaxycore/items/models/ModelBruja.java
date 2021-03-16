package fr.vn.galaxycore.items.models;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import JinRyuu.JRMCore.entity.ModelBipedBody;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBruja extends ModelBipedBody {
private final ModelRenderer bone;

public ModelBruja() {
        textureWidth = 16;
        textureHeight = 16;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(7.0F, 24.0F, -9.0F);
        bone.cubeList.add(new ModelBox(bone, 2, 2, -13.0F, -2.0F, 4.0F, 10, 2, 10, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 5, -12.0F, -5.0F, 5.0F, 8, 1, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 16, -12.0F, -4.0F, 5.0F, 8, 1, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 5, -12.0F, -3.0F, 5.0F, 8, 1, 8, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 1, 2, -11.0F, -8.0F, 6.0F, 6, 5, 6, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -10.0F, -11.0F, 7.0F, 4, 3, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -10.0F, -12.25F, 8.0F, 2, 3, 2, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 2, 2, -12.0F, -13.25F, 8.0F, 4, 1, 2, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 6, 4, -13.0F, -14.25F, 8.0F, 4, 1, 2, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 2, 2, -8.2991F, -11.7132F, 7.995F, 1, 2, 2, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 1, 14, -4.0F, -5.0F, 7.0F, 1, 3, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 1, 14, -4.0F, -5.0F, 10.0F, 1, 3, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 1, 14, -4.0F, -5.0F, 8.0F, 1, 1, 2, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 1, 14, -4.0F, -3.0F, 8.0F, 1, 1, 2, 0.0F));
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