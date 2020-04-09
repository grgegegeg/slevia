package net.mcreator.sleviapack.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.sleviapack.gui.GuiAfa;
import net.mcreator.sleviapack.Sleviapack;
import net.mcreator.sleviapack.ElementsSleviapack;

@ElementsSleviapack.ModElement.Tag
public class ProcedureMoneyprinterOnBlockRightClicked extends ElementsSleviapack.ModElement {
	public ProcedureMoneyprinterOnBlockRightClicked(ElementsSleviapack instance) {
		super(instance, 17);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MoneyprinterOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MoneyprinterOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MoneyprinterOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MoneyprinterOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MoneyprinterOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(Sleviapack.instance, GuiAfa.GUIID, world, x, y, z);
	}
}
