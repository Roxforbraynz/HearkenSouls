package rox.souls.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import rox.souls.SoulsInfo;
import rox.souls.items.Scythes;

public class ClientProxy extends CommonProxy{
	public void setRenders(){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Scythes.scytheWood, 0, new ModelResourceLocation(SoulsInfo.id + ":" + Scythes.scytheWood.getUnlocalizedName().substring(5), "inventory"));
	}
}
