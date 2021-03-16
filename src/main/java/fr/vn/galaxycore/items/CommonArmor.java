package fr.vn.galaxycore.items;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHJBRA;
import JinRyuu.JRMCore.JRMCoreHJFC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.vn.galaxycore.LoaderItems;
import fr.vn.galaxycore.client.SkinPortModelPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CommonArmor extends ItemArmor {

    public CommonArmor(final ItemArmor.ArmorMaterial mat, final int render, final int type) {
        super(mat, render, type);
    }

    public String getArmorTexture(final ItemStack stack, final Entity entity, final int slot, final String type) {
        if (stack.getItem() == LoaderItems.calabazaChest || stack.getItem() == LoaderItems.calabazaLegs || stack.getItem() == LoaderItems.calabazaHelmet || stack.getItem() == LoaderItems.calabazaBoots) {
                return "galaxycore:textures/models/armor/calabaza_layer_1.png";
        } else if (stack.getItem() == LoaderItems.skeletonChest || stack.getItem() == LoaderItems.skeletonLegs || stack.getItem() == LoaderItems.skeletonHelmet || stack.getItem() == LoaderItems.skeletonBoots) {
            return "galaxycore:textures/models/armor/skeleton_layer_1.png";
        } else if (stack.getItem() == LoaderItems.trunksBoots || stack.getItem() == LoaderItems.trunksChest || stack.getItem() == LoaderItems.trunksLegs) {
            if (this.armorType == 2) {
                return "galaxycore:textures/models/armor/trunks_layer_1.png";
            } else {
                return "galaxycore:textures/models/armor/trunks_layer_2.png";
            }
        } else if (stack.getItem() == LoaderItems.scaryBoots || stack.getItem() == LoaderItems.scaryHelmet || stack.getItem() == LoaderItems.scaryChest || stack.getItem() == LoaderItems.scaryLegs) {
            return "galaxycore:textures/models/armor/layer_scary_1.png";
        } else if (stack.getItem() == LoaderItems.itBoots || stack.getItem() == LoaderItems.itHelmet || stack.getItem() == LoaderItems.itChest || stack.getItem() == LoaderItems.itLegs) {
            return "galaxycore:textures/models/armor/layer_it_1.png";
        }  else if (stack.getItem() == LoaderItems.covidBoots || stack.getItem() == LoaderItems.covidHelmet || stack.getItem() == LoaderItems.covidChest || stack.getItem() == LoaderItems.covidLegs)  {
            if (this.armorType == 2) {
                return "galaxycore:textures/models/armor/covid_layer_2.png";
            } else {
                return "galaxycore:textures/models/armor/covid_layer_1.png";
            }
        } else if (stack.getItem() == LoaderItems.tropaBoots || stack.getItem() == LoaderItems.tropaHelmet || stack.getItem() == LoaderItems.tropaChest || stack.getItem() == LoaderItems.tropaLegs) {
            if (this.armorType == 2) {
                return "galaxycore:textures/models/armor/toppo_layer_1.png";
            } else {
                return "galaxycore:textures/models/armor/toppo_layer_2.png";
            }
        } else if (stack.getItem() == LoaderItems.zenoSamaBoots || stack.getItem() == LoaderItems.zenoSamaChest || stack.getItem() == LoaderItems.zenoSamaLegs){
            return "galaxycore:textures/models/armor/zenosama_1.png";
        } else if (stack.getItem() == LoaderItems.yardratBoots || stack.getItem() == LoaderItems.yardratChest || stack.getItem() == LoaderItems.yardratLegs){
            return "galaxycore:textures/models/armor/yardratgoku_1.png";
        } else if (stack.getItem() == LoaderItems.trunksCBoots || stack.getItem() == LoaderItems.trunksCChest || stack.getItem() == LoaderItems.trunksCLegs){
            return "galaxycore:textures/models/armor/trunks_c_1.png";
        } else if (stack.getItem() == LoaderItems.trunksBBoots || stack.getItem() == LoaderItems.trunksBChest || stack.getItem() == LoaderItems.trunksBLegs){
            return "galaxycore:textures/models/armor/trunks_b_1.png";
        } else if (stack.getItem() == LoaderItems.trunksABoots || stack.getItem() == LoaderItems.trunksAChest || stack.getItem() == LoaderItems.trunksALegs){
            return "galaxycore:textures/models/armor/trunks_a_1.png";
        } else if (stack.getItem() == LoaderItems.shallotChest || stack.getItem() == LoaderItems.shallotChest || stack.getItem() == LoaderItems.shallotLegs){
            return "galaxycore:textures/models/armor/shallot_1.png";
        } else if (stack.getItem() == LoaderItems.kambaBoots || stack.getItem() == LoaderItems.kambaChest || stack.getItem() == LoaderItems.shallotLegs){
            return "galaxycore:textures/models/armor/kamba_1.png";
        } else if (stack.getItem() == LoaderItems.gogetaBoots || stack.getItem() == LoaderItems.gogetaChest || stack.getItem() == LoaderItems.gogetaLegs){
            return "galaxycore:textures/models/armor/gogeta_1.png";
        } else if (stack.getItem() == LoaderItems.fuBoots || stack.getItem() == LoaderItems.fuChest || stack.getItem() == LoaderItems.fuLegs){
            return "galaxycore:textures/models/armor/fu_1.png";
        } else if (stack.getItem() == LoaderItems.daishinkanBoots || stack.getItem() == LoaderItems.daishinkanChest || stack.getItem() == LoaderItems.daishinkanLegs){
            return "galaxycore:textures/models/armor/daishinkan_1.png";
        } else if (stack.getItem() == LoaderItems.chiraiBoots || stack.getItem() == LoaderItems.chiraiChest || stack.getItem() == LoaderItems.chiraiLegs){
            if (this.armorType == 2){
                return "galaxycore:textures/models/armor/chirai_1.png";
            } else {
                return "galaxycore:textures/models/armor/chirai_2.png";
            }
        } else if (stack.getItem() == LoaderItems.champaBoots || stack.getItem() == LoaderItems.champaChest || stack.getItem() == LoaderItems.champaLegs){
            return "galaxycore:textures/models/armor/champa_1.png";
        } else if (stack.getItem() == LoaderItems.babyVegetaBoots || stack.getItem() == LoaderItems.babyVegetaChest || stack.getItem() == LoaderItems.babyVegetaLegs){
            return "galaxycore:textures/models/armor/babyvegeta_1.png";
        } else if (stack.getItem() == LoaderItems.arakBoots || stack.getItem() == LoaderItems.arakChest || stack.getItem() == LoaderItems.arakLegs){
            return "galaxycore:textures/models/armor/arak_1.png";
        }


        return "galaxycore:textures/models/armor/nothing_layer_2.png";
    }

    @SideOnly(value=Side.CLIENT)
    public ModelBiped giMdl(int slt, EntityLivingBase e) {
        SkinPortModelPlayer GiTurtleMdl4 = new SkinPortModelPlayer(0.198f);
        return GiTurtleMdl4;
    }

    public boolean wear(EntityLivingBase e) {
        return JRMCoreH.JBRA() && (e instanceof EntityPlayer || JRMCoreH.JFC() && JRMCoreHJFC.isChildNPC((Entity)e));
    }

    @SideOnly(value=Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int par3) {
        ItemStack var11 = ((EntityPlayer)entityLiving).getItemInUse();
        ModelBiped modelbiped = this.giMdl(par3, entityLiving);
        modelbiped = JRMCoreHJBRA.showModel(modelbiped, entityLiving, itemStack, par3);
        if (var11 != null && entityLiving instanceof EntityPlayer && ((EntityPlayer)entityLiving).getItemInUseCount() > 0) {
            EnumAction var12 = var11.getItemUseAction();
            if (var12 == EnumAction.block) {
                modelbiped.heldItemRight = 3;
            } else if (var12 == EnumAction.bow) {
                modelbiped.aimedBow = true;
            }
        }
        modelbiped.onGround = entityLiving.onGround ? 1 : 0;
        modelbiped.isRiding = entityLiving.isRiding();
        modelbiped.isChild = entityLiving.isChild();
        modelbiped.heldItemRight = entityLiving.getHeldItem() != null ? 1 : 0;
        modelbiped.isSneak = entityLiving.isSneaking();
        modelbiped.bipedHead.textureHeight += 0.2;
        modelbiped.bipedHeadwear.textureWidth += 0.2;
        modelbiped.bipedHead.textureHeight += 0.2;
        modelbiped.bipedHeadwear.textureWidth += 0.2;
        modelbiped.bipedHead.showModel = par3 == 0;
        modelbiped.bipedHeadwear.showModel = par3 == 0;
        modelbiped.bipedBody.showModel = par3 == 1;
        modelbiped.bipedRightArm.showModel = par3 == 1;
        modelbiped.bipedLeftArm.showModel = par3 == 1;
        modelbiped.bipedRightLeg.showModel = par3 == 3;
        modelbiped.bipedLeftLeg.showModel = par3 == 3;
        boolean bl = modelbiped.bipedLeftLeg.showModel = par3 == 3;
        if (entityLiving instanceof EntityMob) {
            modelbiped.bipedRightArm.showModel = false;
            modelbiped.bipedLeftArm.showModel = false;
        }
        int n = modelbiped.heldItemRight = (var11 = entityLiving.getHeldItem()) != null ? 1 : 0;
        return modelbiped;

    }

}
