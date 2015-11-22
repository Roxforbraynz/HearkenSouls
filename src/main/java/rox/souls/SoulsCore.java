package rox.souls;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import rox.souls.items.Scythes;
import rox.souls.items.Soul;
import rox.souls.proxy.CommonProxy;

@Mod(modid = SoulsInfo.id,
	 name = SoulsInfo.name,
	 version = SoulsInfo.vers)

public class SoulsCore {
	@SidedProxy(clientSide = SoulsInfo.client,
				serverSide = SoulsInfo.server)
	public static CommonProxy proxy;
	
	public static final CreativeTabs tabHearkenSouls = new CreativeTabs("HearkenSouls"){
		@Override
		public Item getTabIconItem(){
			return Scythes.scytheIron;
		}
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		Scythes.init();
		Soul.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.setRenders();
		SoulsCrafting.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		proxy.initEvents();
	}
}
