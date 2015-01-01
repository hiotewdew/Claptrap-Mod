package com.claptrapmod.mob;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityClaptrapMob extends EntityAnimal {

	public EntityClaptrapMob(World parlWorld) {
		super(parlWorld);
		this.setSize(1F, 1.35F);
		getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAITempt(this, 1.9D, Items.redstone, false));
		this.tasks.addTask(1, new EntityAITempt(this, 1.9D, Items.repeater, false));
		this.tasks.addTask(2, new EntityAITempt(this, 1.9D, Items.iron_ingot, false));
		this.tasks.addTask(3, new EntityAIWander(this, 1.7D));
		this.tasks.addTask(5, new EntityAIPanic(this, 2.2D));
	}
	public boolean isAIEnabled(){
		return true;
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.7D);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityClaptrapMob(worldObj);
	}

}
