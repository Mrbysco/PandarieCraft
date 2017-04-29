package com.Mrbysco.PandarieCraft;

public class Reference {
	public static final String MOD_ID = "pandariecraft";
	public static final String MOD_NAME = "PandarieCraft";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
			
	public static final String CLIENT_PROXY_CLASS = "com.Mrbysco.PandarieCraft.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.Mrbysco.PandarieCraft.proxy.ServerProxy";
	
	public static enum ModItems {
		ITEM("itemname", "itemitemname");
		
		private String unlocalisedName;
		private String registryName;
		
		ModItems(String unlocalisedName, String registryName) {
			this.unlocalisedName = unlocalisedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalisedName() {
			return unlocalisedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum ModBlocks {
		BLOCK("blockname", "blockblockname");
		
		private String unlocalisedName;
		private String registryName;
		
		ModBlocks(String unlocalisedName, String registryName) {
			this.unlocalisedName = unlocalisedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalisedName() {
			return unlocalisedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
