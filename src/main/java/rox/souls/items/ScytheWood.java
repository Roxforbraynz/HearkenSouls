package rox.souls.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ScytheWood{
	public static Item scytheWood = new ScytheBase(ToolMaterial.WOOD, "wooden_scythe");
	
	public static void init(){
		GameRegistry.registerItem(scytheWood, scytheWood.getUnlocalizedName().substring(5));
	}
}
