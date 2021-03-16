package fr.vn.galaxycore.items.register;

import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHJFC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.vn.galaxycore.items.ModelRegister;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

public class BrujaRender extends BaseArmor {
    public BrujaRender(ArmorMaterial armorMaterial, int renderType, String itemname, String armorname) {
        super(armorMaterial, renderType, itemname, armorname);
    }

    @SideOnly(Side.CLIENT)
    public ModelBiped giMdl(int slt, EntityLivingBase e) {
        switch (slt) {
            case 0:
                return wear(e) ? ModelRegister.MODEL_ARMOR1 : JRMCoreClient.armor1;
            case 1:
                return wear(e) ? ModelRegister.MODEL_ARMOR1 : JRMCoreClient.armor1;
            case 3:
                return wear(e) ? ModelRegister.MODEL_ARMOR1 : JRMCoreClient.armor1;
            case 5:
                return wear(e) ? ModelRegister.MODEL_ARMOR1 : JRMCoreClient.armor1;
        }
        return wear(e) ? ModelRegister.MODEL_ARMOR1 : JRMCoreClient.armor2;
    }


    public boolean wear(EntityLivingBase var1) {
        return (JRMCoreH.JBRA() && (var1 instanceof EntityPlayer || (JRMCoreH.JFC() && JRMCoreHJFC.isChildNPC(var1))));
    }
}