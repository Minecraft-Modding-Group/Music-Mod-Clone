
package net.mcreator.randommod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.randommod.procedures.MusicblockonheadItemInInventoryTickProcedure;
import net.mcreator.randommod.init.RandomModModTabs;

public class MusicblockonheadItem extends Item {
	public MusicblockonheadItem() {
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

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		MusicblockonheadItemInInventoryTickProcedure.execute(entity);
	}
}
