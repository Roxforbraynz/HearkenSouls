package rox.souls.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rox.souls.SoulsCore;

public class Soul extends Item{
	public Soul(String unlocName){
		this.setUnlocalizedName(unlocName);
		this.setMaxStackSize(64);
		this.setCreativeTab(SoulsCore.tabHearkenSouls);
	}
	
	public static Item normalSoul = new Soul("normal_soul");
	
	public static void init(){
		GameRegistry.registerItem(normalSoul, normalSoul.getUnlocalizedName().substring(5));
	}
}
