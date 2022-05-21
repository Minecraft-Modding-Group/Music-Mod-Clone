
package net.mcreator.randommod.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.randommod.init.RandomModModTabs;

public class EightnoteItem extends Item {
	public EightnoteItem() {
		super(new Item.Properties().tab(RandomModModTabs.TAB_MUSIC_MOD).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
