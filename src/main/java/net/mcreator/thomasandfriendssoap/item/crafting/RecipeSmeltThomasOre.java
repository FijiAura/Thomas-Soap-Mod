
package net.mcreator.thomasandfriendssoap.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.thomasandfriendssoap.item.ItemSmeltedThomas;
import net.mcreator.thomasandfriendssoap.block.BlockThomas;
import net.mcreator.thomasandfriendssoap.ElementsThomasAndFriendsSoapMod;

@ElementsThomasAndFriendsSoapMod.ModElement.Tag
public class RecipeSmeltThomasOre extends ElementsThomasAndFriendsSoapMod.ModElement {
	public RecipeSmeltThomasOre(ElementsThomasAndFriendsSoapMod instance) {
		super(instance, 4);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockThomas.block, (int) (1)), new ItemStack(ItemSmeltedThomas.block, (int) (1)), 1F);
	}
}
