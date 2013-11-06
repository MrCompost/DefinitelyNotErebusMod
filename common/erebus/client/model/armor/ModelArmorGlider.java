package erebus.client.model.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelArmorGlider extends ModelBiped {
	//fields
	ModelRenderer Body;
	ModelRenderer RArm;
	ModelRenderer LArm;
	ModelRenderer RWingbase;
	ModelRenderer LWingbase;
	ModelRenderer RWing;
	ModelRenderer LWing;

	public boolean isGliding;

	public ModelArmorGlider()
	{
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this, 19, 12);
		Body.addBox(-4F, 0F, -2F, 8, 11, 4);
		Body.setRotationPoint(0F, 0F, 0F);
		Body.setTextureSize(64, 64);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		RArm = new ModelRenderer(this, 42, 0);
		RArm.addBox(-3F, -2F, -2F, 4, 5, 4);
		RArm.setRotationPoint(-5F, 2F, 0F);
		RArm.setTextureSize(64, 64);
		RArm.mirror = true;
		setRotation(RArm, 0F, 0F, 0F);
		LArm = new ModelRenderer(this, 0, 0);
		LArm.addBox(-1F, -2F, -2F, 4, 5, 4);
		LArm.setRotationPoint(5F, 2F, 0F);
		LArm.setTextureSize(64, 64);
		LArm.mirror = true;
		setRotation(LArm, 0F, 0F, 0F);
		RWingbase = new ModelRenderer(this, 52, 16);
		RWingbase.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		RWingbase.setRotationPoint(-2F, 2F, 3.5F);
		RWingbase.setTextureSize(64, 64);
		RWingbase.mirror = true;
		setRotation(RWingbase, 0F, 0F, 0F);
		LWingbase = new ModelRenderer(this, 0, 16);
		LWingbase.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		LWingbase.setRotationPoint(2F, 2F, 3.5F);
		LWingbase.setTextureSize(64, 64);
		LWingbase.mirror = true;
		setRotation(LWingbase, 0F, 0F, 0F);
		RWing = new ModelRenderer(this, 44, 33);
		RWing.addBox(-4.5F, 0F, -0.51F, 9, 14, 1);
		RWing.setRotationPoint(-2F, 3F, 3.5F);
		RWing.setTextureSize(64, 64);
		RWing.mirror = true;
		setRotation(RWing, 0F, 0F, 1.570796F);
		LWing = new ModelRenderer(this, 0, 33);
		LWing.addBox(-4.5F, 0F, -0.5F, 9, 14, 1);
		LWing.setRotationPoint(2F, 3F, 3.5F);
		LWing.setTextureSize(64, 64);
		LWing.mirror = true;
		setRotation(LWing, 0F, 0F, -1.570796F);
	}

	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		GL11.glPushMatrix();
		GL11.glTranslatef(0.0F, -0.05F, 0.0F);
		GL11.glScalef(1.1F, 1.2F, 1.3F);
		Body.render(par7);
		RArm.render(par7);
		LArm.render(par7);
		GL11.glPopMatrix();
		RWingbase.render(par7);
		LWingbase.render(par7);
		RWing.render(par7);
		LWing.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);

		if (!isGliding) {
			RWing.rotateAngleZ = 0F;
			LWing.rotateAngleZ = 0F;
		} else {
			RWing.rotateAngleZ = 1.570796F;
			LWing.rotateAngleZ = -1.570796F;
		}
	}
}
