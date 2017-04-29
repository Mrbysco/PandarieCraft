package com.Mrbysco.PandarieCraft;

import com.Mrbysco.PandarieCraft.init.ModBlocks;
import com.Mrbysco.PandarieCraft.init.ModItems;
import com.Mrbysco.PandarieCraft.init.ModRecipes;
import com.Mrbysco.PandarieCraft.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, 
	name = Reference.MOD_NAME, 
	version = Reference.VERSION, 
	acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)

public class PandarieCraft {

	@Instance(Reference.MOD_ID)
	public static PandarieCraft instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static CreativeTabs tabStatues = new CreativeTabs("tabPandarieCraft") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Blocks.DEADBUSH);
		}
	};
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event)
	{
		ModBlocks.init();
		ModBlocks.register();
		ModItems.init();
		ModItems.register();
		ModRecipes.register();

		proxy.Preinit();
	}
	
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		proxy.init();
    }
	
	@EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		
    }
}
