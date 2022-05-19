
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randommod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.randommod.block.MusicalOreBlock;
import net.mcreator.randommod.block.MusicalBlockBlock;
import net.mcreator.randommod.RandomModMod;

public class RandomModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RandomModMod.MODID);
	public static final RegistryObject<Block> MUSICAL_ORE = REGISTRY.register("musical_ore", () -> new MusicalOreBlock());
	public static final RegistryObject<Block> MUSICAL_BLOCK = REGISTRY.register("musical_block", () -> new MusicalBlockBlock());
}
