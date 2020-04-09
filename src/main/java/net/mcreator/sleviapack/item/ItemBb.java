
package net.mcreator.sleviapack.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.sleviapack.creativetab.TabSlevia;
import net.mcreator.sleviapack.ElementsSleviapack;

import java.util.List;

@ElementsSleviapack.ModElement.Tag
public class ItemBb extends ElementsSleviapack.ModElement {
	@GameRegistry.ObjectHolder("sleviapack:bb")
	public static final Item block = null;
	public ItemBb(ElementsSleviapack instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("sleviapack:bb", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 50;
			setUnlocalizedName("bb");
			setRegistryName("bb");
			setCreativeTab(TabSlevia.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("\u0412\u0430\u043B\u044E\u0442\u0430 \u0432 \u0421\u043B\u0435\u0432\u0438\u0438");
		}
	}
}
