// 
// Decompiled by Procyon v0.5.36
// 

package fr.vn.galaxycore;

import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.vn.galaxycore.items.MixedOre;
import fr.vn.galaxycore.items.MixedIngot;
import fr.vn.galaxycore.items.GalaxyOre;
import net.minecraft.block.material.Material;
import fr.vn.galaxycore.items.GalaxyIngot;
import fr.vn.galaxycore.items.AllPlainItems;
import fr.vn.galaxycore.items.SwordStuff;
import fr.vn.galaxycore.items.SteelStuff;
import fr.vn.galaxycore.items.ZombieAndRaiderStuff;
import fr.vn.galaxycore.items.ItemDragonslayerBoots;
import fr.vn.galaxycore.items.ItemProtectorBoots;
import fr.vn.galaxycore.items.ItemMagmaBoots;
import fr.vn.galaxycore.items.ItemCrystalBoots;
import fr.vn.galaxycore.items.ItemSlayerBoots;
import fr.vn.galaxycore.items.ItemBlazeBoots;
import net.minecraft.creativetab.CreativeTabs;
import fr.vn.galaxycore.items.ItemTestBoots;
import fr.vn.galaxycore.items.ItemToppoBoots;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.ItemArmor;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;

@Mod(modid = "galaxycore", version = "1.1")
public class GalaxyCore
{
    public static Item blazeChest;
    public static Item blazeLegs;
    public static Item blazeBoots;
    public static Item crystalChest;
    public static Item crystalLegs;
    public static Item crystalBoots;
    public static Item crystalHelmet;
    public static Item magmaChest;
    public static Item magmaLegs;
    public static Item magmaBoots;
    public static Item magmaHelmet;
    public static Item protectorChest;
    public static Item protectorLegs;
    public static Item protectorBoots;
    public static Item protectorHelmet;
    public static Item dragonslayerChest;
    public static Item dragonslayerLegs;
    public static Item dragonslayerBoots;
    public static Item zombiePickaxe;
    public static Item steelPickaxe;
    public static Item raiderAxe;
    public static Item steelAxe;
    public static Item jungleAxe;
    public static Item emeraldBlade;
    public static Item earthShard;
    public static Item galaxySword;
    public static Item allXP;
    public static Item combatXP;
    public static Item colossalXP;
    public static Item grandBottle;
    public static Item yellowRock;
    public static Item capsula1;
    public static Item capsula2;
    public static Item capsula3;
    public static Item capsula4;
    public static Item whissSword;
    public static Item galaxyIngot;
    public static Block galaxyOre;
    
    public static Item brokenChip;
    public static Item armorFragment;
    public static Item blueFragment;
    public static Item blueClothingFragment;
    public static Item redClothingFragment;
    public static Item swordFragment;
    public static Item brokenProcessor;
    ;
    public static Item mixedIngot;
    public static Block mixedOre;
    public static final String MODID = "galaxycore";
    public static final String VERSION = "1.0";
    public static final ItemArmor.ArmorMaterial testArmorMaterial;
    public static final Item.ToolMaterial testToolMaterial;
    
    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        GalaxyCore.blazeBoots = new ItemBlazeBoots(GalaxyCore.testArmorMaterial, 0, 3).setTextureName("galaxycore:blaze_boots").setUnlocalizedName("BlazeBoots").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.blazeChest = new ItemBlazeBoots(GalaxyCore.testArmorMaterial, 0, 1).setTextureName("galaxycore:blaze_chestplate").setUnlocalizedName("BlazeChest").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.blazeLegs = new ItemBlazeBoots(GalaxyCore.testArmorMaterial, 0, 2).setTextureName("galaxycore:blaze_leggings").setUnlocalizedName("BlazeLegs").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.crystalBoots = new ItemCrystalBoots(GalaxyCore.testArmorMaterial, 0, 3).setTextureName("galaxycore:crystal_boots").setUnlocalizedName("CrystalBoots").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.crystalChest = new ItemCrystalBoots(GalaxyCore.testArmorMaterial, 0, 1).setTextureName("galaxycore:crystal_chestplate").setUnlocalizedName("CrystalChest").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.crystalLegs = new ItemCrystalBoots(GalaxyCore.testArmorMaterial, 0, 2).setTextureName("galaxycore:crystal_leggings").setUnlocalizedName("CrystalLegs").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.crystalHelmet = new ItemCrystalBoots(GalaxyCore.testArmorMaterial, 0, 0).setTextureName("galaxycore:crystal_helm").setUnlocalizedName("CrystalHelm").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.magmaBoots = new ItemMagmaBoots(GalaxyCore.testArmorMaterial, 0, 3).setTextureName("galaxycore:magma_boots").setUnlocalizedName("MagmaBoots").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.magmaChest = new ItemMagmaBoots(GalaxyCore.testArmorMaterial, 0, 1).setTextureName("galaxycore:magma_chestplate").setUnlocalizedName("MagmaChest").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.magmaLegs = new ItemMagmaBoots(GalaxyCore.testArmorMaterial, 0, 2).setTextureName("galaxycore:magma_leggings").setUnlocalizedName("MagmaLegs").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.magmaHelmet = new ItemMagmaBoots(GalaxyCore.testArmorMaterial, 0, 0).setTextureName("galaxycore:magma_helmet").setUnlocalizedName("MagmaHelm").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.protectorBoots = new ItemProtectorBoots(GalaxyCore.testArmorMaterial, 0, 3).setTextureName("galaxycore:protector_boots").setUnlocalizedName("ProtectorBoots").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.protectorChest = new ItemProtectorBoots(GalaxyCore.testArmorMaterial, 0, 1).setTextureName("galaxycore:protector_chestplate").setUnlocalizedName("ProtectorChest").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.protectorLegs = new ItemProtectorBoots(GalaxyCore.testArmorMaterial, 0, 2).setTextureName("galaxycore:protector_leggings").setUnlocalizedName("ProtectorLegs").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.protectorHelmet = new ItemProtectorBoots(GalaxyCore.testArmorMaterial, 0, 0).setTextureName("galaxycore:protector_helmet").setUnlocalizedName("ProtectorHelm").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.dragonslayerBoots = new ItemDragonslayerBoots(GalaxyCore.testArmorMaterial, 0, 3).setTextureName("galaxycore:dragon2_boots").setUnlocalizedName("DragonslayerBoots").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.dragonslayerChest = new ItemDragonslayerBoots(GalaxyCore.testArmorMaterial, 0, 1).setTextureName("galaxycore:dragon2_chestplate").setUnlocalizedName("DragonslayerChest").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.dragonslayerLegs = new ItemDragonslayerBoots(GalaxyCore.testArmorMaterial, 0, 2).setTextureName("galaxycore:dragon2_leggins").setUnlocalizedName("DragonslayerLegs").setMaxDamage(0).setCreativeTab(CreativeTabs.tabCombat);
        GalaxyCore.zombiePickaxe = new ZombieAndRaiderStuff(GalaxyCore.testToolMaterial).setTextureName("galaxycore:zombie_pick").setUnlocalizedName("ZombiePickaxe").setCreativeTab(CreativeTabs.tabTools).setMaxDamage(0);
        GalaxyCore.steelPickaxe = new ZombieAndRaiderStuff(GalaxyCore.testToolMaterial).setTextureName("galaxycore:steel_pickaxe").setUnlocalizedName("SteelPickaxe").setCreativeTab(CreativeTabs.tabTools).setMaxDamage(0);
        GalaxyCore.raiderAxe = new SteelStuff(GalaxyCore.testToolMaterial).setTextureName("galaxycore:raider_axe").setUnlocalizedName("RaiderAxe").setCreativeTab(CreativeTabs.tabTools).setMaxDamage(0);
        GalaxyCore.steelAxe = new SteelStuff(GalaxyCore.testToolMaterial).setTextureName("galaxycore:steel_axe").setUnlocalizedName("SteelAxe").setCreativeTab(CreativeTabs.tabTools).setMaxDamage(0);
        GalaxyCore.jungleAxe = new SteelStuff(GalaxyCore.testToolMaterial).setTextureName("galaxycore:jungleaxe").setUnlocalizedName("JungleAxe").setCreativeTab(CreativeTabs.tabTools).setMaxDamage(0);
        GalaxyCore.emeraldBlade = new SwordStuff(GalaxyCore.testToolMaterial).setTextureName("galaxycore:emerald_blade").setUnlocalizedName("EmeraldBlade").setCreativeTab(CreativeTabs.tabCombat).setMaxDamage(0);
        GalaxyCore.earthShard = new SwordStuff(GalaxyCore.testToolMaterial).setTextureName("galaxycore:earth_shard").setUnlocalizedName("EarthShard").setCreativeTab(CreativeTabs.tabCombat).setMaxDamage(0);
        GalaxyCore.galaxySword = new SwordStuff(GalaxyCore.testToolMaterial).setTextureName("galaxycore:galaxy_sword").setUnlocalizedName("GalaxySword").setCreativeTab(CreativeTabs.tabCombat).setMaxDamage(0);
        GalaxyCore.whissSword = new SwordStuff(GalaxyCore.testToolMaterial).setTextureName("galaxycore:whiss_sword").setUnlocalizedName("WhissSword").setCreativeTab(CreativeTabs.tabCombat).setMaxDamage(0);
        GalaxyCore.allXP = new AllPlainItems().setTextureName("galaxycore:allxp").setUnlocalizedName("AllXP");
        GalaxyCore.combatXP = new AllPlainItems().setTextureName("galaxycore:combat_xp").setUnlocalizedName("CombatXP");
        GalaxyCore.colossalXP = new AllPlainItems().setTextureName("galaxycore:colossal_xp").setUnlocalizedName("ColossalXP");
        GalaxyCore.grandBottle = new AllPlainItems().setTextureName("galaxycore:grand_bottle").setUnlocalizedName("GrandBottle");
        GalaxyCore.yellowRock = new AllPlainItems().setTextureName("galaxycore:yellow_rock").setUnlocalizedName("YellowRock");
        GalaxyCore.capsula1 = new AllPlainItems().setTextureName("galaxycore:capasula1").setUnlocalizedName("Capsula1");
        GalaxyCore.capsula2 = new AllPlainItems().setTextureName("galaxycore:capsula2").setUnlocalizedName("Capsula2");
        GalaxyCore.capsula3 = new AllPlainItems().setTextureName("galaxycore:capsula3").setUnlocalizedName("Capsula3");
        GalaxyCore.capsula4 = new AllPlainItems().setTextureName("galaxycore:capsula4").setUnlocalizedName("Capsula4");
        
        GalaxyCore.brokenChip = new AllPlainItems().setTextureName("galaxycore:chip_break").setUnlocalizedName("BrokenChip");
        GalaxyCore.armorFragment = new AllPlainItems().setTextureName("galaxycore:fragment_armor").setUnlocalizedName("ArmorFragment");
        GalaxyCore.blueFragment = new AllPlainItems().setTextureName("galaxycore:fragment_blue").setUnlocalizedName("BlueFragment");
        GalaxyCore.blueClothingFragment = new AllPlainItems().setTextureName("galaxycore:fragment_blue_cloth").setUnlocalizedName("BlueClothingFragment");
        GalaxyCore.redClothingFragment = new AllPlainItems().setTextureName("galaxycore:fragment_red_cloth").setUnlocalizedName("RedClothingFragment");
        GalaxyCore.swordFragment = new AllPlainItems().setTextureName("galaxycore:fragment_sword").setUnlocalizedName("SwordFragment");
        GalaxyCore.brokenProcessor = new AllPlainItems().setTextureName("galaxycore:proccesor_reak").setUnlocalizedName("BrokenProcessor");
        
        
        GalaxyCore.galaxyIngot = new GalaxyIngot().setTextureName("galaxycore:mineral").setUnlocalizedName("GalaxyIngot").setCreativeTab(CreativeTabs.tabMaterials);
        GalaxyCore.galaxyOre = new GalaxyOre(Material.rock);
        GalaxyCore.mixedIngot = new MixedIngot().setTextureName("galaxycore:mineral_4").setUnlocalizedName("MixedIngot").setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerBlock(GalaxyCore.mixedOre = new MixedOre(Material.rock), "mixedOre");
        GameRegistry.registerItem(GalaxyCore.mixedIngot, "mixedIngot");
        GameRegistry.registerBlock(GalaxyCore.galaxyOre, "galaxyOre");
        GameRegistry.registerItem(GalaxyCore.allXP, "allXP");
        GameRegistry.registerItem(GalaxyCore.whissSword, "whissSword");
        GameRegistry.registerItem(GalaxyCore.galaxyIngot, "galaxyIngot");
        GameRegistry.registerItem(GalaxyCore.combatXP, "combatXP");
        GameRegistry.registerItem(GalaxyCore.colossalXP, "colossalXP");
        GameRegistry.registerItem(GalaxyCore.yellowRock, "yellowRock");
        GameRegistry.registerItem(GalaxyCore.grandBottle, "grandBottle");
        
        GameRegistry.registerItem(GalaxyCore.brokenChip, "brokenChip");
        GameRegistry.registerItem(GalaxyCore.armorFragment, "armorFragment");
        GameRegistry.registerItem(GalaxyCore.blueFragment, "blueFragment");
        GameRegistry.registerItem(GalaxyCore.blueClothingFragment, "blueClothingFragment");
        GameRegistry.registerItem(GalaxyCore.redClothingFragment, "redClothingFragment");
        GameRegistry.registerItem(GalaxyCore.swordFragment, "swordFragment");
        GameRegistry.registerItem(GalaxyCore.brokenProcessor, "brokenProcessor");
        
        GameRegistry.registerItem(GalaxyCore.capsula1, "capsula1");
        GameRegistry.registerItem(GalaxyCore.capsula2, "capsula2");
        GameRegistry.registerItem(GalaxyCore.capsula3, "capsula3");
        GameRegistry.registerItem(GalaxyCore.capsula4, "capsula4");
        GameRegistry.registerItem(GalaxyCore.zombiePickaxe, "zombiePickaxe");
        GameRegistry.registerItem(GalaxyCore.steelPickaxe, "steelPickaxe");
        GameRegistry.registerItem(GalaxyCore.steelAxe, "steelAxe");
        GameRegistry.registerItem(GalaxyCore.raiderAxe, "raiderAxe");
        GameRegistry.registerItem(GalaxyCore.jungleAxe, "jungleAxe");
        GameRegistry.registerItem(GalaxyCore.blazeBoots, "blazeBoots");
        GameRegistry.registerItem(GalaxyCore.blazeLegs, "blazeLegs");
        GameRegistry.registerItem(GalaxyCore.blazeChest, "blazeChest");
        GameRegistry.registerItem(GalaxyCore.emeraldBlade, "emeraldBlade");
        GameRegistry.registerItem(GalaxyCore.earthShard, "earthShard");
        GameRegistry.registerItem(GalaxyCore.galaxySword, "galaxySword");
        GameRegistry.registerItem(GalaxyCore.crystalHelmet, "crystalHelmet");
        GameRegistry.registerItem(GalaxyCore.crystalBoots, "crystalBoots");
        GameRegistry.registerItem(GalaxyCore.crystalLegs, "crystalLegs");
        GameRegistry.registerItem(GalaxyCore.crystalChest, "crystalChest");
        GameRegistry.registerItem(GalaxyCore.magmaHelmet, "magmaHelmet");
        GameRegistry.registerItem(GalaxyCore.magmaBoots, "magmaBoots");
        GameRegistry.registerItem(GalaxyCore.magmaLegs, "magmaLegs");
        GameRegistry.registerItem(GalaxyCore.magmaChest, "magmaChest");
        GameRegistry.registerItem(GalaxyCore.dragonslayerBoots, "dragonslayerBoots");
        GameRegistry.registerItem(GalaxyCore.dragonslayerLegs, "dragonslayerLegs");
        GameRegistry.registerItem(GalaxyCore.dragonslayerChest, "dragonslayerChest");
        GameRegistry.registerItem(GalaxyCore.protectorHelmet, "protectorHelmet");
        GameRegistry.registerItem(GalaxyCore.protectorBoots, "protectorBoots");
        GameRegistry.registerItem(GalaxyCore.protectorLegs, "protectorLegs");
        GameRegistry.registerItem(GalaxyCore.protectorChest, "protectorChest");
    }
    
    static {
        testArmorMaterial = EnumHelper.addArmorMaterial("testArmorMaterial", Integer.MAX_VALUE, new int[] { 3, 8, 6, 3 }, 30);
        testToolMaterial = EnumHelper.addToolMaterial("testToolMaterial", 3, Integer.MAX_VALUE, 8.0f, 3.0f, 30);
    }
}
