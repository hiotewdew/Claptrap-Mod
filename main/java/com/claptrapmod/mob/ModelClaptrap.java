package com.claptrapmod.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelClaptrap extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Wheel;
    ModelRenderer Antenna;
    ModelRenderer EyeballBottom;
    ModelRenderer EyeballLeft;
    ModelRenderer EyeballTop;
    ModelRenderer EyeballRight;
    ModelRenderer ArmLeftTop;
    ModelRenderer ArmLeftBottom;
    ModelRenderer ArmRightTop;
    ModelRenderer ArmRightBottom;
  
  public ModelClaptrap()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 24, 0);
      Body.addBox(0F, 0F, 0F, 10, 14, 10);
      Body.setRotationPoint(-5F, 6F, -6F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Wheel = new ModelRenderer(this, 0, 24);
      Wheel.addBox(0F, 0F, 0F, 2, 4, 4);
      Wheel.setRotationPoint(-1F, 20F, -3F);
      Wheel.setTextureSize(64, 32);
      Wheel.mirror = true;
      setRotation(Wheel, 0F, 0F, 0F);
      Antenna = new ModelRenderer(this, 0, 10);
      Antenna.addBox(0F, 0F, 0F, 1, 9, 1);
      Antenna.setRotationPoint(3F, -3F, -4F);
      Antenna.setTextureSize(64, 32);
      Antenna.mirror = true;
      setRotation(Antenna, 0F, 0F, 0F);
      EyeballBottom = new ModelRenderer(this, 7, 0);
      EyeballBottom.addBox(0F, 0F, 0F, 2, 1, 1);
      EyeballBottom.setRotationPoint(-1F, 11F, -7F);
      EyeballBottom.setTextureSize(64, 32);
      EyeballBottom.mirror = true;
      setRotation(EyeballBottom, 0F, 0F, 0F);
      EyeballLeft = new ModelRenderer(this, 7, 0);
      EyeballLeft.addBox(0F, 0F, 0F, 1, 4, 1);
      EyeballLeft.setRotationPoint(-2F, 8F, -7F);
      EyeballLeft.setTextureSize(64, 32);
      EyeballLeft.mirror = true;
      setRotation(EyeballLeft, 0F, 0F, 0F);
      EyeballTop = new ModelRenderer(this, 9, 0);
      EyeballTop.addBox(0F, 0F, 0F, 2, 1, 1);
      EyeballTop.setRotationPoint(-1F, 8F, -7F);
      EyeballTop.setTextureSize(64, 32);
      EyeballTop.mirror = true;
      setRotation(EyeballTop, 0F, 0F, 0F);
      EyeballRight = new ModelRenderer(this, 11, 0);
      EyeballRight.addBox(0F, 0F, 0F, 1, 4, 1);
      EyeballRight.setRotationPoint(1F, 8F, -7F);
      EyeballRight.setTextureSize(64, 32);
      EyeballRight.mirror = true;
      setRotation(EyeballRight, 0F, 0F, 0F);
      ArmLeftTop = new ModelRenderer(this, 7, 0);
      ArmLeftTop.addBox(0F, 0F, 0F, 1, 3, 1);
      ArmLeftTop.setRotationPoint(-6F, 9F, -1F);
      ArmLeftTop.setTextureSize(64, 32);
      ArmLeftTop.mirror = true;
      setRotation(ArmLeftTop, 0F, 0F, 0.5585054F);
      ArmLeftBottom = new ModelRenderer(this, 7, 0);
      ArmLeftBottom.addBox(0F, 0F, 0F, 1, 6, 1);
      ArmLeftBottom.setRotationPoint(-8F, 12F, -1F);
      ArmLeftBottom.setTextureSize(64, 32);
      ArmLeftBottom.mirror = true;
      setRotation(ArmLeftBottom, 0F, 0F, -0.2617994F);
      ArmRightTop = new ModelRenderer(this, 7, 0);
      ArmRightTop.addBox(0F, 0F, 0F, 1, 3, 1);
      ArmRightTop.setRotationPoint(5F, 9F, -1F);
      ArmRightTop.setTextureSize(64, 32);
      ArmRightTop.mirror = true;
      setRotation(ArmRightTop, 0F, 0F, -0.5585054F);
      ArmRightBottom = new ModelRenderer(this, 7, 0);
      ArmRightBottom.addBox(0F, 0F, 0F, 1, 7, 1);
      ArmRightBottom.setRotationPoint(7F, 11F, -1F);
      ArmRightBottom.setTextureSize(64, 32);
      ArmRightBottom.mirror = true;
      setRotation(ArmRightBottom, 0F, 0F, 0.2617994F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    Wheel.render(f5);
    Antenna.render(f5);
    EyeballBottom.render(f5);
    EyeballLeft.render(f5);
    EyeballTop.render(f5);
    EyeballRight.render(f5);
    ArmLeftTop.render(f5);
    ArmLeftBottom.render(f5);
    ArmRightTop.render(f5);
    ArmRightBottom.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
  }

}
