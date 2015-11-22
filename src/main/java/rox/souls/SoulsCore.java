package rox.souls;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import rox.souls.items.ScytheBase;
import rox.souls.items.ScytheWood;
import rox.souls.proxy.CommonProxy;

@Mod(modid = SoulsInfo.id,
	 name = SoulsInfo.name,
	 version = SoulsInfo.vers)

public class SoulsCore {
	@SidedProxy(clientSide = SoulsInfo.client,
				serverSide = SoulsInfo.server)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ScytheWood.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.setRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
