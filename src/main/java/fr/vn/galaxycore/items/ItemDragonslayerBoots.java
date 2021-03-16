// 
// Decompiled by Procyon v0.5.36
// 

package fr.vn.galaxycore.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;

public class ItemDragonslayerBoots extends ItemArmor
{
    public ItemDragonslayerBoots(final ItemArmor.ArmorMaterial mat, final int render, final int type) {
        super(mat, render, type);
    }
    
    public String getArmorTexture(final ItemStack stack, final Entity entity, final int slot, final String type) {
        if (this.armorType == 2) {
            return "galaxycore:textures/models/armor/dragon2_slayer_2.png";
        }
        return "galaxycore:textures/models/armor/dragon2_slayer.png";
    }
}
