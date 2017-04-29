package com.Mrbysco.PandarieCraft.proxy;

import com.Mrbysco.PandarieCraft.init.ModBlocks;
import com.Mrbysco.PandarieCraft.init.ModItems;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void init() {
	}
	
	
	@Override
	public void Preinit() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
