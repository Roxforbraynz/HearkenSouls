package rox.souls.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Scythes extends ItemSword{
	public Scythes(ToolMaterial material, String unlocName) {
		super(material);
		this.setUnlocalizedName(unlocName);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	public static Item scytheWood = new Scythes(ToolMaterial.WOOD, "wooden_scythe");
	
	public static void init(){
		GameRegistry.registerItem(scytheWood, scytheWood.getUnlocalizedName().substring(5));
	}
}
