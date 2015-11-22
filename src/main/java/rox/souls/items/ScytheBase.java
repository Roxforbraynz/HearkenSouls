package rox.souls.items;

import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rox.souls.SoulsInfo;

public class ScytheBase extends ItemSword{
	public ScytheBase(ToolMaterial material, String unlocName) {
		super(material);
		this.setUnlocalizedName(unlocName);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
}
