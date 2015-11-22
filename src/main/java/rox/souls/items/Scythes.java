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
	public static Item scytheStone = new Scythes(ToolMaterial.STONE, "stone_scythe");
	public static Item scytheIron = new Scythes(ToolMaterial.IRON, "iron_scythe");
	public static Item scytheGold = new Scythes(ToolMaterial.GOLD, "golden_scythe");
	public static Item scytheDiamond = new Scythes(ToolMaterial.EMERALD, "diamond_scythe");
	
	public static void init(){
		GameRegistry.registerItem(scytheWood, scytheWood.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(scytheStone, scytheStone.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(scytheIron, scytheIron.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(scytheGold, scytheGold.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(scytheDiamond, scytheDiamond.getUnlocalizedName().substring(5));
	}
}
