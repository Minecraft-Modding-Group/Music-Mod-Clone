
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randommod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RandomModModTabs {
	public static CreativeModeTab TAB_MUSIC_MOD;

	public static void load() {
		TAB_MUSIC_MOD = new CreativeModeTab("tabmusic_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.NOTE_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
