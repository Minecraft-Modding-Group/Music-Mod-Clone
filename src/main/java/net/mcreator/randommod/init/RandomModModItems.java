
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randommod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.randommod.item.SpeedBringerMagicScrollItem;
import net.mcreator.randommod.item.MusicblockonheadItem;
import net.mcreator.randommod.item.LightningSongMagicScrollItem;
import net.mcreator.randommod.item.FureliseItem;
import net.mcreator.randommod.RandomModMod;

public class RandomModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RandomModMod.MODID);
	public static final RegistryObject<Item> FURELISE = REGISTRY.register("furelise", () -> new FureliseItem());
	public static final RegistryObject<Item> LIGHTNING_SONG_MAGIC_SCROLL = REGISTRY.register("lightning_song_magic_scroll",
			() -> new LightningSongMagicScrollItem());
	public static final RegistryObject<Item> SPEED_BRINGER_MAGIC_SCROLL = REGISTRY.register("speed_bringer_magic_scroll",
			() -> new SpeedBringerMagicScrollItem());
	public static final RegistryObject<Item> MUSICBLOCKONHEAD = REGISTRY.register("musicblockonhead", () -> new MusicblockonheadItem());
}
