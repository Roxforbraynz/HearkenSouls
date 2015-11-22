package rox.souls;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rox.souls.items.Scythes;

public class SoulsCrafting {
	public static void init(){
		GameRegistry.addRecipe(new ItemStack(Scythes.scytheWood), "MMS", " SM", "S  ", 'M', Blocks.planks, 'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Scythes.scytheStone), "MMS", " SM", "S  ", 'M', Blocks.cobblestone, 'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Scythes.scytheIron), "MMS", " SM", "S  ", 'M', Items.iron_ingot, 'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Scythes.scytheGold), "MMS", " SM", "S  ", 'M', Items.gold_ingot, 'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Scythes.scytheDiamond), "MMS", " SM", "S  ", 'M', Items.diamond, 'S', Items.stick);
	}
}
