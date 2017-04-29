package com.Mrbysco.PandarieCraft.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ModItems {
	
	//public static Item itemname;
		
	public static void init()
	{
		//itemname = new ItemClass();

	}
	
	public static void register()
	{
		//GameRegistry.register(itemname);

	}
	
	public static void registerRenders()
	{
		//registerRender(itemname);

	}
	
	public static void registerRender(Item item)
	{		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
