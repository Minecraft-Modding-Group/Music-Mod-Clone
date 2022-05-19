
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randommod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.randommod.item.UkelllelItem;
import net.mcreator.randommod.item.SymphonybarItem;
import net.mcreator.randommod.item.SpeedBringerMagicScrollItem;
import net.mcreator.randommod.item.MusicblockonheadItem;
import net.mcreator.randommod.item.MusicalSwordItem;
import net.mcreator.randommod.item.MusicalShovelItem;
import net.mcreator.randommod.item.MusicalPickaxeItem;
import net.mcreator.randommod.item.MusicalItem;
import net.mcreator.randommod.item.MusicalHoeItem;
import net.mcreator.randommod.item.MusicalAxeItem;
import net.mcreator.randommod.item.MusicalArmorItem;
import net.mcreator.randommod.item.LightningSongMagicScrollItem;
import net.mcreator.randommod.item.FureliseItem;
import net.mcreator.randommod.item.EightnoteItem;
import net.mcreator.randommod.RandomModMod;

public class RandomModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RandomModMod.MODID);
	public static final RegistryObject<Item> FURELISE = REGISTRY.register("furelise", () -> new FureliseItem());
	public static final RegistryObject<Item> LIGHTNING_SONG_MAGIC_SCROLL = REGISTRY.register("lightning_song_magic_scroll",
			() -> new LightningSongMagicScrollItem());
	public static final RegistryObject<Item> SPEED_BRINGER_MAGIC_SCROLL = REGISTRY.register("speed_bringer_magic_scroll",
			() -> new SpeedBringerMagicScrollItem());
	public static final RegistryObject<Item> MUSICBLOCKONHEAD = REGISTRY.register("musicblockonhead", () -> new MusicblockonheadItem());
	public static final RegistryObject<Item> SYMPHONYBAR = REGISTRY.register("symphonybar", () -> new SymphonybarItem());
	public static final RegistryObject<Item> EIGHTNOTE = REGISTRY.register("eightnote", () -> new EightnoteItem());
	public static final RegistryObject<Item> UKELLLEL = REGISTRY.register("ukelllel", () -> new UkelllelItem());
	public static final RegistryObject<Item> MUSICAL = REGISTRY.register("musical", () -> new MusicalItem());
	public static final RegistryObject<Item> MUSICAL_ORE = block(RandomModModBlocks.MUSICAL_ORE, RandomModModTabs.TAB_MUSIC_MOD);
	public static final RegistryObject<Item> MUSICAL_BLOCK = block(RandomModModBlocks.MUSICAL_BLOCK, RandomModModTabs.TAB_MUSIC_MOD);
	public static final RegistryObject<Item> MUSICAL_PICKAXE = REGISTRY.register("musical_pickaxe", () -> new MusicalPickaxeItem());
	public static final RegistryObject<Item> MUSICAL_AXE = REGISTRY.register("musical_axe", () -> new MusicalAxeItem());
	public static final RegistryObject<Item> MUSICAL_SWORD = REGISTRY.register("musical_sword", () -> new MusicalSwordItem());
	public static final RegistryObject<Item> MUSICAL_SHOVEL = REGISTRY.register("musical_shovel", () -> new MusicalShovelItem());
	public static final RegistryObject<Item> MUSICAL_HOE = REGISTRY.register("musical_hoe", () -> new MusicalHoeItem());
	public static final RegistryObject<Item> MUSICAL_ARMOR_HELMET = REGISTRY.register("musical_armor_helmet", () -> new MusicalArmorItem.Helmet());
	public static final RegistryObject<Item> MUSICAL_ARMOR_CHESTPLATE = REGISTRY.register("musical_armor_chestplate",
			() -> new MusicalArmorItem.Chestplate());
	public static final RegistryObject<Item> MUSICAL_ARMOR_LEGGINGS = REGISTRY.register("musical_armor_leggings",
			() -> new MusicalArmorItem.Leggings());
	public static final RegistryObject<Item> MUSICAL_ARMOR_BOOTS = REGISTRY.register("musical_armor_boots", () -> new MusicalArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
