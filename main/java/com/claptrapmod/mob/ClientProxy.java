package com.claptrapmod.mob;


import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends ServerProxy {

	public void registerRenderThings(){
	
		RenderingRegistry.registerEntityRenderingHandler(EntityClaptrapMob.class, new RenderClaptrapMob(new ModelClaptrap(), 0));
		
	}

}