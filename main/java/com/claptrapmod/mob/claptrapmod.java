
package com.claptrapmod.mob;


import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "claptrapmod", name = "Claptrap Mod", version = "1.0")
public class claptrapmod

{
@SidedProxy(clientSide = "com.claptrapmod.mob.ClientProxy", serverSide = "com.claptrapmod.mob.ServerProxy")
public static ServerProxy proxy;
@Metadata
public static ModMetadata meta;
@Instance("claptrapmod")
public static claptrapmod modInstance;
@EventHandler
public void PreLoad(FMLPreInitializationEvent PreEvent)

{
	proxy.registerRenderThings();
	EntityClaptrap.mainRegistry();
}

@EventHandler
public void load(FMLInitializationEvent event)
{
	
}

@EventHandler
public void PostLoad(FMLPostInitializationEvent PostEvent)
{
	
}
}