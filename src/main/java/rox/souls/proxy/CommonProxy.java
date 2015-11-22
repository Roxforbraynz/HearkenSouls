package rox.souls.proxy;

import net.minecraftforge.common.MinecraftForge;
import rox.souls.SoulsEvents;

public class CommonProxy {
	public void setRenders(){
		
	}
	
	public void initEvents(){
		MinecraftForge.EVENT_BUS.register(new SoulsEvents());
	}
}
