package com.claptrapmod.mob;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityClaptrap {

	public static void mainRegistry(){
		registerEntity();
		
	}
	
	public static void registerEntity(){

		createEntity(EntityClaptrapMob.class, "Claptrap", 0xFFF700, 0x525252);
	}
		
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, claptrapmod.modInstance, 15, 1, true);
		EntityRegistry.addSpawn(entityClass, 10, 1, 2, EnumCreatureType.creature, BiomeGenBase.forest);
		
		createEgg(randomId, solidColor, spotColor);
		
	}

	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}
	
}
	
