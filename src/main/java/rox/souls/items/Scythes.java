package rox.souls.items;

import java.util.List;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rox.souls.SoulsCore;

public class Scythes extends ItemSword{
	public Scythes(ToolMaterial material, String unlocName) {
		super(material);
		this.setUnlocalizedName(unlocName);
		this.setCreativeTab(SoulsCore.tabHearkenSouls);
	}
	
	public DamageSource scytheReapDamage = new DamageSource("hearkenSoul.scythe.reap");
	
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
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack){
		return EnumAction.BOW;
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack stack){
        return 60;
    }
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World world, EntityPlayer player){
		List<EntityLiving> e = player.worldObj.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.fromBounds(player.posX - 4, player.posY - 3, player.posZ - 4, player.posX + 4, player.posY + 2, player.posZ + 4));
		
		if(e.isEmpty()){
			if(!player.worldObj.isRemote){
				player.addChatMessage(new ChatComponentText("Your swing missed."));
			}
		} else for(EntityLiving mob : e){
			float damage = (this.getDamageVsEntity() + 4.0F);
			mob.attackEntityFrom(this.scytheReapDamage, damage);
			stack.damageItem(1, player);
		}
		
		return stack;
	}
}
