package rox.souls;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import rox.souls.items.Scythes;
import rox.souls.items.Soul;

public class SoulsEvents {
	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent event){
		if(event.source.getDamageType() == "hearkenSoul.scythe.reap" && Math.random() >= 0.80){
			event.entity.dropItem(Soul.normalSoul, 1);
		}
	}
}
