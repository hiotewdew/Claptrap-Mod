package com.claptrapmod.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderClaptrapMob extends RenderLiving {

	private static final ResourceLocation mobTextures = new ResourceLocation("claptrapmod" + ":textures/claptrap.png");
	
	public RenderClaptrapMob(ModelBase parlModelBase, float par2) {
		super(parlModelBase, par2);
	}
	
	protected ResourceLocation getEntityTexture(EntityClaptrapMob entity) {
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityClaptrapMob)entity);
	}
}

