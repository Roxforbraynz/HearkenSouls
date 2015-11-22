package rox.souls.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import rox.souls.SoulsInfo;
import rox.souls.items.ScytheBase;
import rox.souls.items.ScytheWood;

public class ClientProxy extends CommonProxy{
	public void setRenders(){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
				ScytheWood.scytheWood, 
				0, 
				new ModelResourceLocation(
						SoulsInfo.id + 
						":" + 
						ScytheWood.scytheWood
						.getUnlocalizedName()
						.substring(5), 
						"inventory"));
	}
}
