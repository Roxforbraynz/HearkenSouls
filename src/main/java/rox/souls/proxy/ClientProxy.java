package rox.souls.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import rox.souls.SoulsInfo;
import rox.souls.items.Scythes;
import rox.souls.items.Soul;

public class ClientProxy extends CommonProxy{
	@Override
	public void setRenders(){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Scythes.scytheWood, 0, new ModelResourceLocation(SoulsInfo.id + ":" + Scythes.scytheWood.getUnlocalizedName().substring(5), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Scythes.scytheStone, 0, new ModelResourceLocation(SoulsInfo.id + ":" + Scythes.scytheStone.getUnlocalizedName().substring(5), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Scythes.scytheIron, 0, new ModelResourceLocation(SoulsInfo.id + ":" + Scythes.scytheIron.getUnlocalizedName().substring(5), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Scythes.scytheDiamond, 0, new ModelResourceLocation(SoulsInfo.id + ":" + Scythes.scytheDiamond.getUnlocalizedName().substring(5), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Scythes.scytheGold, 0, new ModelResourceLocation(SoulsInfo.id + ":" + Scythes.scytheGold.getUnlocalizedName().substring(5), "inventory"));
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Soul.normalSoul, 0, new ModelResourceLocation(SoulsInfo.id + ":" + Soul.normalSoul.getUnlocalizedName().substring(5), "inventory"));
	}
}
