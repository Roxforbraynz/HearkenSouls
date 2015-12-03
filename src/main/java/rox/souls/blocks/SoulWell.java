package rox.souls.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rox.souls.SoulsCore;
import rox.souls.items.Scythes;
import rox.souls.items.Soul;

public class SoulWell extends Block{
	public SoulWell(Material material, String unlocName){
		super(material);
		this.setUnlocalizedName(unlocName);
		this.setHarvestLevel("pickaxe", 0);
		this.setHardness(5F);
		this.setCreativeTab(SoulsCore.tabHearkenSouls);
	}
	
	private int souls = 0;
	public static Block soul_well = new SoulWell(Material.rock, "soul_well");
	
	public static void init(){
		GameRegistry.registerBlock(soul_well, soul_well.getUnlocalizedName().substring(5));
	}
	
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ){
		if(player.getCurrentEquippedItem().isItemEqual(new ItemStack(Soul.normalSoul)) && !world.isRemote){
			souls = souls + 1;
			player.getCurrentEquippedItem().stackSize = player.getCurrentEquippedItem().stackSize - 1;
			return true;
		}
		else if(player.getCurrentEquippedItem().isItemEqual(new ItemStack(Scythes.scytheWood)) ||
		   player.getCurrentEquippedItem().isItemEqual(new ItemStack(Scythes.scytheStone)) ||
		   player.getCurrentEquippedItem().isItemEqual(new ItemStack(Scythes.scytheIron)) ||
		   player.getCurrentEquippedItem().isItemEqual(new ItemStack(Scythes.scytheGold)) ||
		   player.getCurrentEquippedItem().isItemEqual(new ItemStack(Scythes.scytheDiamond))){
				if(!world.isRemote){
					player.addChatMessage(new ChatComponentText(EnumChatFormatting.AQUA + "Current Souls stored: " + EnumChatFormatting.RESET + souls));
					return true;
				}
		}
		return false;
	}

}
