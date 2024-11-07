package net.mcreator.thomasandfriendssoap.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;

import net.mcreator.thomasandfriendssoap.ElementsThomasAndFriendsSoapMod;

import java.util.Map;

@ElementsThomasAndFriendsSoapMod.ModElement.Tag
public class ProcedureThomasSoapFoodEaten extends ElementsThomasAndFriendsSoapMod.ModElement {
	public ProcedureThomasSoapFoodEaten(ElementsThomasAndFriendsSoapMod instance) {
		super(instance, 3);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ThomasSoapFoodEaten!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ThomasSoapFoodEaten!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ThomasSoapFoodEaten!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ThomasSoapFoodEaten!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
				.getObject(new ResourceLocation("thomas_and_friends_soap:soapisveryyummy")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
	}
}
