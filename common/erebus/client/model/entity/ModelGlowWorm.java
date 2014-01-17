package erebus.client.model.entity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;


public class ModelGlowWorm extends ModelBase
{
	//fields
	ModelRenderer Head1;
	ModelRenderer Head2;
	ModelRenderer LMandible;
	ModelRenderer RMandible;
	ModelRenderer AntL;
	ModelRenderer AntR;
	ModelRenderer Eyes;
	ModelRenderer ThxL1;
	ModelRenderer ThxR1;
	ModelRenderer ThxL2;
	ModelRenderer ThxR2;
	ModelRenderer ThxL3;
	ModelRenderer ThxR3;
	ModelRenderer ThxL4;
	ModelRenderer ThxR4;
	ModelRenderer ThxL5;
	ModelRenderer ThxR5;
	ModelRenderer ThxL6;
	ModelRenderer ThxR6;
	ModelRenderer ThxL7;
	ModelRenderer ThxR7;
	ModelRenderer ThxL8;
	ModelRenderer ThxR8;
	ModelRenderer ThxL9;
	ModelRenderer ThxR9;
	ModelRenderer ThxL10;
	ModelRenderer ThxR10;
	ModelRenderer Thx11;
	ModelRenderer LBL1;
	ModelRenderer LBL2;
	ModelRenderer LBL3;
	ModelRenderer LBL4;
	ModelRenderer LML1;
	ModelRenderer LML2;
	ModelRenderer LML3;
	ModelRenderer LML4;
	ModelRenderer LFL1;
	ModelRenderer LFL2;
	ModelRenderer LFL3;
	ModelRenderer LFL4;
	ModelRenderer RFL1;
	ModelRenderer RFL2;
	ModelRenderer RFL3;
	ModelRenderer RFL4;
	ModelRenderer RML1;
	ModelRenderer RML2;
	ModelRenderer RML3;
	ModelRenderer RML4;
	ModelRenderer RBL1;
	ModelRenderer RBL2;
	ModelRenderer RBL3;
	ModelRenderer RBL4;

	public ModelGlowWorm()
	{
		textureWidth = 64;
		textureHeight = 128;

		Head1 = new ModelRenderer(this, 21, 0);
		Head1.addBox(-2.5F, -1.5F, -4.5F, 5, 4, 5);
		Head1.setRotationPoint(0F, 16F, -11F);
		Head1.setTextureSize(64, 128);
		Head1.mirror = true;
		setRotation(Head1, 0.1745329F, 0F, 0F);
		Head2 = new ModelRenderer(this, 41, 0);
		Head2.addBox(-2F, -1F, -5.5F, 4, 3, 1);
		Head2.setRotationPoint(0F, 16F, -11F);
		Head2.setTextureSize(64, 128);
		Head2.mirror = true;
		setRotation(Head2, 0.1745329F, 0F, 0F);
		LMandible = new ModelRenderer(this, 52, 0);
		LMandible.addBox(0.5F, 1F, -8.5F, 1, 1, 3);
		LMandible.setRotationPoint(0F, 16F, -11F);
		LMandible.setTextureSize(64, 128);
		LMandible.mirror = true;
		setRotation(LMandible, 0.1745329F, 0F, 0F);
		RMandible = new ModelRenderer(this, 52, 0);
		RMandible.addBox(-1.5F, 1F, -8.5F, 1, 1, 3);
		RMandible.setRotationPoint(0F, 16F, -11F);
		RMandible.setTextureSize(64, 128);
		RMandible.mirror = true;
		setRotation(RMandible, 0.1745329F, 0F, 0F);
		AntL = new ModelRenderer(this, 43, 80);
		AntL.addBox(4F, 0.5F, -2F, 9, 1, 1);
		AntL.setRotationPoint(0F, 16F, -11F);
		AntL.setTextureSize(64, 128);
		AntL.mirror = true;
		setRotation(AntL, 0F, 0.8726646F, 0F);
		AntR = new ModelRenderer(this, 43, 80);
		AntR.addBox(-13F, 0.5F, -2F, 9, 1, 1);
		AntR.setRotationPoint(0F, 16F, -11F);
		AntR.setTextureSize(64, 128);
		AntR.mirror = true;
		setRotation(AntR, 0F, -0.8726646F, 0F);
		Eyes = new ModelRenderer(this, 0, 0);
		Eyes.addBox(-3.5F, -1F, -4F, 7, 2, 2);
		Eyes.setRotationPoint(0F, 16F, -11F);
		Eyes.setTextureSize(64, 128);
		Eyes.mirror = true;
		setRotation(Eyes, 0.1745329F, 0F, 0F);
		ThxL1 = new ModelRenderer(this, 0, 5);
		ThxL1.addBox(-0.6F, -3.5F, -3F, 5, 1, 2);
		ThxL1.setRotationPoint(0F, 16F, -10F);
		ThxL1.setTextureSize(64, 128);
		ThxL1.mirror = true;
		setRotation(ThxL1, 0.1745329F, -0.0261799F, 0.1745329F);
		ThxR1 = new ModelRenderer(this, 45, 5);
		ThxR1.addBox(-4.4F, -3.5F, -3F, 5, 1, 2);
		ThxR1.setRotationPoint(0F, 16F, -10F);
		ThxR1.setTextureSize(64, 128);
		ThxR1.mirror = true;
		setRotation(ThxR1, 0.1745329F, 0.0261799F, -0.1745329F);
		ThxL2 = new ModelRenderer(this, 7, 10);
		ThxL2.addBox(-0.7F, -4F, -1F, 7, 6, 5);
		ThxL2.setRotationPoint(0F, 16F, -10F);
		ThxL2.setTextureSize(64, 128);
		ThxL2.mirror = true;
		setRotation(ThxL2, 0.1745329F, -0.0261799F, 0.1745329F);
		ThxR2 = new ModelRenderer(this, 32, 10);
		ThxR2.addBox(-6.3F, -4F, -1F, 7, 6, 5);
		ThxR2.setRotationPoint(0F, 16F, -10F);
		ThxR2.setTextureSize(64, 128);
		ThxR2.mirror = true;
		setRotation(ThxR2, 0.1745329F, 0.0261799F, -0.1745329F);
		ThxL3 = new ModelRenderer(this, 13, 22);
		ThxL3.addBox(-0.7F, -3.5F, 4F, 5, 7, 4);
		ThxL3.setRotationPoint(0F, 16F, -10F);
		ThxL3.setTextureSize(64, 128);
		ThxL3.mirror = true;
		setRotation(ThxL3, 0.1745329F, -0.0261799F, 0.1745329F);
		ThxR3 = new ModelRenderer(this, 32, 22);
		ThxR3.addBox(-4.3F, -3.5F, 4F, 5, 7, 4);
		ThxR3.setRotationPoint(0F, 16F, -10F);
		ThxR3.setTextureSize(64, 128);
		ThxR3.mirror = true;
		setRotation(ThxR3, 0.1745329F, 0.0261799F, -0.1745329F);
		ThxL4 = new ModelRenderer(this, 7, 34);
		ThxL4.addBox(-0.6F, -3F, 8F, 7, 8, 5);
		ThxL4.setRotationPoint(0F, 16F, -10F);
		ThxL4.setTextureSize(64, 128);
		ThxL4.mirror = true;
		setRotation(ThxL4, 0.1745329F, -0.0261799F, 0.1745329F);
		ThxR4 = new ModelRenderer(this, 32, 34);
		ThxR4.addBox(-6.4F, -3F, 8F, 7, 8, 5);
		ThxR4.setRotationPoint(0F, 16F, -10F);
		ThxR4.setTextureSize(64, 128);
		ThxR4.mirror = true;
		setRotation(ThxR4, 0.1745329F, 0.0261799F, -0.1745329F);
		ThxL5 = new ModelRenderer(this, 5, 48);
		ThxL5.addBox(-0.5F, -2.5F, 13F, 8, 9, 5);
		ThxL5.setRotationPoint(0F, 16F, -10F);
		ThxL5.setTextureSize(64, 128);
		ThxL5.mirror = true;
		setRotation(ThxL5, 0.1745329F, -0.0261799F, 0.1745329F);
		ThxR5 = new ModelRenderer(this, 32, 48);
		ThxR5.addBox(-7.5F, -2.5F, 13F, 8, 9, 5);
		ThxR5.setRotationPoint(0F, 16F, -10F);
		ThxR5.setTextureSize(64, 128);
		ThxR5.mirror = true;
		setRotation(ThxR5, 0.1745329F, 0.0261799F, -0.1745329F);
		ThxL6 = new ModelRenderer(this, 1, 63);
		ThxL6.addBox(-0.5F, -2F, 18F, 9, 10, 6);
		ThxL6.setRotationPoint(0F, 16F, -10F);
		ThxL6.setTextureSize(64, 128);
		ThxL6.mirror = true;
		setRotation(ThxL6, 0.1745329F, -0.0261799F, 0.1745329F);
		ThxR6 = new ModelRenderer(this, 32, 63);
		ThxR6.addBox(-8.5F, -2F, 18F, 9, 10, 6);
		ThxR6.setRotationPoint(0F, 16F, -10F);
		ThxR6.setTextureSize(64, 128);
		ThxR6.mirror = true;
		setRotation(ThxR6, 0.1745329F, 0.0261799F, -0.1745329F);
		ThxL7 = new ModelRenderer(this, 1, 63);
		ThxL7.addBox(-1F, -5.5F, 23.5F, 9, 10, 6);
		ThxL7.setRotationPoint(0F, 16F, -10F);
		ThxL7.setTextureSize(64, 128);
		ThxL7.mirror = true;
		setRotation(ThxL7, 0F, 0F, 0.1745329F);
		ThxR7 = new ModelRenderer(this, 32, 63);
		ThxR7.addBox(-8F, -5.5F, 23.5F, 9, 10, 6);
		ThxR7.setRotationPoint(0F, 16F, -10F);
		ThxR7.setTextureSize(64, 128);
		ThxR7.mirror = true;
		setRotation(ThxR7, 0F, 0F, -0.1745329F);
		ThxL8 = new ModelRenderer(this, 5, 48);
		ThxL8.addBox(-1.6F, -10F, 28F, 8, 9, 5);
		ThxL8.setRotationPoint(0F, 16F, -10F);
		ThxL8.setTextureSize(64, 128);
		ThxL8.mirror = true;
		setRotation(ThxL8, -0.1745329F, 0.0261799F, 0.1745329F);
		ThxR8 = new ModelRenderer(this, 32, 48);
		ThxR8.addBox(-6.4F, -10F, 28F, 8, 9, 5);
		ThxR8.setRotationPoint(0F, 16F, -10F);
		ThxR8.setTextureSize(64, 128);
		ThxR8.mirror = true;
		setRotation(ThxR8, -0.1745329F, -0.0261799F, -0.1745329F);
		ThxL9 = new ModelRenderer(this, 7, 100);
		ThxL9.addBox(-1.5F, -9.5F, 33F, 7, 8, 5);
		ThxL9.setRotationPoint(0F, 16F, -10F);
		ThxL9.setTextureSize(64, 128);
		ThxL9.mirror = true;
		setRotation(ThxL9, -0.1745329F, 0.0261799F, 0.1745329F);
		ThxR9 = new ModelRenderer(this, 32, 100);
		ThxR9.addBox(-5.5F, -9.5F, 33F, 7, 8, 5);
		ThxR9.setRotationPoint(0F, 16F, -10F);
		ThxR9.setTextureSize(64, 128);
		ThxR9.mirror = true;
		setRotation(ThxR9, -0.1745329F, -0.0261799F, -0.1745329F);
		ThxL10 = new ModelRenderer(this, 13, 83);
		ThxL10.addBox(-1.5F, -9F, 38F, 5, 7, 4);
		ThxL10.setRotationPoint(0F, 16F, -10F);
		ThxL10.setTextureSize(64, 128);
		ThxL10.mirror = true;
		setRotation(ThxL10, -0.1745329F, 0.0261799F, 0.1745329F);
		ThxR10 = new ModelRenderer(this, 32, 83);
		ThxR10.addBox(-3.5F, -9F, 38F, 5, 7, 4);
		ThxR10.setRotationPoint(0F, 16F, -10F);
		ThxR10.setTextureSize(64, 128);
		ThxR10.mirror = true;
		setRotation(ThxR10, -0.1745329F, -0.0261799F, -0.1745329F);
		Thx11 = new ModelRenderer(this, 19, 114);
		Thx11.addBox(-3.5F, -7F, 42F, 7, 3, 3);
		Thx11.setRotationPoint(0F, 16F, -10F);
		Thx11.setTextureSize(64, 128);
		Thx11.mirror = true;
		setRotation(Thx11, -0.1745329F, 0F, 0F);
		LBL1 = new ModelRenderer(this, 42, 95);
		LBL1.addBox(-1F, -1F, -1F, 7, 2, 2);
		LBL1.setRotationPoint(6F, 18F, 6F);
		LBL1.setTextureSize(64, 128);
		LBL1.mirror = true;
		setRotation(LBL1, 0F, 0F, -0.3490659F);
		LBL2 = new ModelRenderer(this, 0, 88);
		LBL2.addBox(5F, 0F, -1F, 2, 4, 2);
		LBL2.setRotationPoint(6F, 18F, 6F);
		LBL2.setTextureSize(64, 128);
		LBL2.mirror = true;
		setRotation(LBL2, 0F, 0F, -0.3490659F);
		LBL3 = new ModelRenderer(this, 0, 82);
		LBL3.addBox(3.5F, 5.5F, -0.5F, 2, 4, 1);
		LBL3.setRotationPoint(6F, 18F, 6F);
		LBL3.setTextureSize(64, 128);
		LBL3.mirror = true;
		setRotation(LBL3, 0F, 0F, -0.6981317F);
		LBL4 = new ModelRenderer(this, 7, 82);
		LBL4.addBox(2.5F, 9F, -0.5F, 1, 4, 1);
		LBL4.setRotationPoint(6F, 18F, 6F);
		LBL4.setTextureSize(64, 128);
		LBL4.mirror = true;
		setRotation(LBL4, 0F, 0F, -0.8726646F);
		LML1 = new ModelRenderer(this, 0, 95);
		LML1.addBox(-1F, -1F, -1F, 5, 2, 2);
		LML1.setRotationPoint(5F, 17F, -1F);
		LML1.setTextureSize(64, 128);
		LML1.mirror = true;
		setRotation(LML1, 0F, 0F, -0.3490659F);
		LML2 = new ModelRenderer(this, 0, 88);
		LML2.addBox(3F, 0F, -1F, 2, 4, 2);
		LML2.setRotationPoint(5F, 17F, -1F);
		LML2.setTextureSize(64, 128);
		LML2.mirror = true;
		setRotation(LML2, 0F, 0F, -0.3490659F);
		LML3 = new ModelRenderer(this, 0, 82);
		LML3.addBox(1.5F, 4.5F, -0.5F, 2, 4, 1);
		LML3.setRotationPoint(5F, 17F, -1F);
		LML3.setTextureSize(64, 128);
		LML3.mirror = true;
		setRotation(LML3, 0F, 0F, -0.6981317F);
		LML4 = new ModelRenderer(this, 7, 82);
		LML4.addBox(0.5F, 8F, -0.5F, 1, 4, 1);
		LML4.setRotationPoint(5F, 17F, -1F);
		LML4.setTextureSize(64, 128);
		LML4.mirror = true;
		setRotation(LML4, 0F, 0F, -0.8726646F);
		LFL1 = new ModelRenderer(this, 0, 95);
		LFL1.addBox(0F, -1F, -1F, 4, 2, 2);
		LFL1.setRotationPoint(4F, 17F, -8F);
		LFL1.setTextureSize(64, 128);
		LFL1.mirror = true;
		setRotation(LFL1, 0F, 0F, -0.3490659F);
		LFL2 = new ModelRenderer(this, 0, 88);
		LFL2.addBox(3F, 0F, -1F, 2, 4, 2);
		LFL2.setRotationPoint(4F, 17F, -8F);
		LFL2.setTextureSize(64, 128);
		LFL2.mirror = true;
		setRotation(LFL2, 0F, 0F, -0.3490659F);
		LFL3 = new ModelRenderer(this, 0, 82);
		LFL3.addBox(1.5F, 4.5F, -0.5F, 2, 4, 1);
		LFL3.setRotationPoint(4F, 17F, -8F);
		LFL3.setTextureSize(64, 128);
		LFL3.mirror = true;
		setRotation(LFL3, 0F, 0F, -0.6981317F);
		LFL4 = new ModelRenderer(this, 7, 82);
		LFL4.addBox(0.5F, 8F, -0.5F, 1, 4, 1);
		LFL4.setRotationPoint(4F, 17F, -8F);
		LFL4.setTextureSize(64, 128);
		LFL4.mirror = true;
		setRotation(LFL4, 0F, 0F, -0.8726646F);
		RFL1 = new ModelRenderer(this, 0, 95);
		RFL1.addBox(-4F, -1F, -1F, 4, 2, 2);
		RFL1.setRotationPoint(-4F, 17F, -8F);
		RFL1.setTextureSize(64, 128);
		RFL1.mirror = true;
		setRotation(RFL1, 0F, 0F, 0.3490659F);
		RFL2 = new ModelRenderer(this, 0, 88);
		RFL2.addBox(-5F, 0F, -1F, 2, 4, 2);
		RFL2.setRotationPoint(-4F, 17F, -8F);
		RFL2.setTextureSize(64, 128);
		RFL2.mirror = true;
		setRotation(RFL2, 0F, 0F, 0.3490659F);
		RFL3 = new ModelRenderer(this, 0, 82);
		RFL3.addBox(-3.5F, 4.5F, -0.5F, 2, 4, 1);
		RFL3.setRotationPoint(-4F, 17F, -8F);
		RFL3.setTextureSize(64, 128);
		RFL3.mirror = true;
		setRotation(RFL3, 0F, 0F, 0.6981317F);
		RFL4 = new ModelRenderer(this, 7, 82);
		RFL4.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
		RFL4.setRotationPoint(-4F, 17F, -8F);
		RFL4.setTextureSize(64, 128);
		RFL4.mirror = true;
		setRotation(RFL4, 0F, 0F, 0.8726646F);
		RML1 = new ModelRenderer(this, 0, 95);
		RML1.addBox(-4F, -1F, -1F, 5, 2, 2);
		RML1.setRotationPoint(-5F, 17F, -1F);
		RML1.setTextureSize(64, 128);
		RML1.mirror = true;
		setRotation(RML1, 0F, 0F, 0.3490659F);
		RML2 = new ModelRenderer(this, 0, 88);
		RML2.addBox(-5F, 0F, -1F, 2, 4, 2);
		RML2.setRotationPoint(-5F, 17F, -1F);
		RML2.setTextureSize(64, 128);
		RML2.mirror = true;
		setRotation(RML2, 0F, 0F, 0.3490659F);
		RML3 = new ModelRenderer(this, 0, 82);
		RML3.addBox(-3.5F, 4.5F, -0.5F, 2, 4, 1);
		RML3.setRotationPoint(-5F, 17F, -1F);
		RML3.setTextureSize(64, 128);
		RML3.mirror = true;
		setRotation(RML3, 0F, 0F, 0.6981317F);
		RML4 = new ModelRenderer(this, 7, 82);
		RML4.addBox(-1.5F, 8F, -0.5F, 1, 4, 1);
		RML4.setRotationPoint(-5F, 17F, -1F);
		RML4.setTextureSize(64, 128);
		RML4.mirror = true;
		setRotation(RML4, 0F, 0F, 0.8726646F);
		RBL1 = new ModelRenderer(this, 42, 95);
		RBL1.addBox(-6F, -1F, -1F, 7, 2, 2);
		RBL1.setRotationPoint(-6F, 18F, 6F);
		RBL1.setTextureSize(64, 128);
		RBL1.mirror = true;
		setRotation(RBL1, 0F, 0F, 0.3490659F);
		RBL2 = new ModelRenderer(this, 0, 88);
		RBL2.addBox(-7F, 0F, -1F, 2, 4, 2);
		RBL2.setRotationPoint(-6F, 18F, 6F);
		RBL2.setTextureSize(64, 128);
		RBL2.mirror = true;
		setRotation(RBL2, 0F, 0F, 0.3490659F);
		RBL3 = new ModelRenderer(this, 0, 82);
		RBL3.addBox(-5.5F, 5.5F, -0.5F, 2, 4, 1);
		RBL3.setRotationPoint(-6F, 18F, 6F);
		RBL3.setTextureSize(64, 128);
		RBL3.mirror = true;
		setRotation(RBL3, 0F, 0F, 0.6981317F);
		RBL4 = new ModelRenderer(this, 7, 82);
		RBL4.addBox(-3.5F, 9F, -0.5F, 1, 4, 1);
		RBL4.setRotationPoint(-6F, 18F, 6F);
		RBL4.setTextureSize(64, 128);
		RBL4.mirror = true;
		setRotation(RBL4, 0F, 0F, 0.8726646F);
	}


	@Override
	public void render(Entity entity, float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw, float rotationPitch, float unitPixel) {
		super.render(entity, limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel);
		setRotationAngles(limbSwing, prevLimbSwing, entityTickTime, rotationYaw, rotationPitch, unitPixel, entity);
		Head1.render(unitPixel);
		Head2.render(unitPixel);
		LMandible.render(unitPixel);
		RMandible.render(unitPixel);
		AntL.render(unitPixel);
		AntR.render(unitPixel);
		Eyes.render(unitPixel);
		ThxL1.render(unitPixel);
		ThxR1.render(unitPixel);
		ThxL2.render(unitPixel);
		ThxR2.render(unitPixel);
		ThxL3.render(unitPixel);
		ThxR3.render(unitPixel);
		ThxL4.render(unitPixel);
		ThxR4.render(unitPixel);
		ThxL5.render(unitPixel);
		ThxR5.render(unitPixel);
		ThxL6.render(unitPixel);
		ThxR6.render(unitPixel);
		ThxL7.render(unitPixel);
		ThxR7.render(unitPixel);
		ThxL8.render(unitPixel);
		ThxR8.render(unitPixel);
		ThxL9.render(unitPixel);
		ThxR9.render(unitPixel);
		ThxL10.render(unitPixel);
		ThxR10.render(unitPixel);
		Thx11.render(unitPixel);
		LBL1.render(unitPixel);
		LBL2.render(unitPixel);
		LBL3.render(unitPixel);
		LBL4.render(unitPixel);
		LML1.render(unitPixel);
		LML2.render(unitPixel);
		LML3.render(unitPixel);
		LML4.render(unitPixel);
		LFL1.render(unitPixel);
		LFL2.render(unitPixel);
		LFL3.render(unitPixel);
		LFL4.render(unitPixel);
		RFL1.render(unitPixel);
		RFL2.render(unitPixel);
		RFL3.render(unitPixel);
		RFL4.render(unitPixel);
		RML1.render(unitPixel);
		RML2.render(unitPixel);
		RML3.render(unitPixel);
		RML4.render(unitPixel);
		RBL1.render(unitPixel);
		RBL2.render(unitPixel);
		RBL3.render(unitPixel);
		RBL4.render(unitPixel);


	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float limbSwing, float prevLimbSwing, float entityTickTime, float rotationYaw, float rotationPitch, float unitPixel, Entity entity)
	{
		Head1.rotateAngleY = rotationYaw / (180F / (float)Math.PI);
		Head2.rotateAngleY = rotationYaw / (180F / (float)Math.PI);
		LMandible.rotateAngleY = rotationYaw / (180F / (float)Math.PI);
		RMandible.rotateAngleY = rotationYaw / (180F / (float)Math.PI);
		AntR.rotateAngleY = rotationYaw / (180F / (float)Math.PI)-1.0F;
		AntL.rotateAngleY = rotationYaw / (180F / (float)Math.PI)+1.0F;
		Eyes.rotateAngleY = rotationYaw / (180F  / (float)Math.PI);

		LBL1.rotateAngleX = MathHelper.cos(limbSwing * 2.0F + (float)Math.PI) * 0.7F * prevLimbSwing;
		LBL2.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F + (float)Math.PI) * 0.7F * prevLimbSwing;
		LBL3.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F + (float)Math.PI) * 0.7F * prevLimbSwing;
		LBL4.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F + (float)Math.PI) * 0.7F * prevLimbSwing;
		LML1.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F) * 0.7F * prevLimbSwing;
		LML2.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F) * 0.7F * prevLimbSwing;
		LML3.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F) * 0.7F * prevLimbSwing;
		LML4.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F) * 0.7F * prevLimbSwing;
		LFL1.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F + (float)Math.PI) * 0.7F * prevLimbSwing;
		LFL2.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F + (float)Math.PI) * 0.7F * prevLimbSwing;
		LFL3.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F + (float)Math.PI) * 0.7F * prevLimbSwing;
		LFL4.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F + (float)Math.PI) * 0.7F * prevLimbSwing;
		RBL1.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F) * 0.7F * prevLimbSwing;
		RBL2.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F) * 0.7F * prevLimbSwing;
		RBL3.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F) * 0.7F * prevLimbSwing;
		RBL4.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F) * 0.7F * prevLimbSwing;
		RML1.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F + (float)Math.PI) * 0.7F * prevLimbSwing;
		RML2.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F + (float)Math.PI) * 0.7F * prevLimbSwing;
		RML3.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F + (float)Math.PI) * 0.7F * prevLimbSwing;
		RML4.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F + (float)Math.PI) * 0.7F * prevLimbSwing;
		RFL1.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F) * 0.7F * prevLimbSwing;
		RFL2.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F) * 0.7F * prevLimbSwing;
		RFL3.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F) * 0.7F * prevLimbSwing;
		RFL4.rotateAngleX = MathHelper.cos(limbSwing  * 2.0F) * 0.7F * prevLimbSwing;
	}

}
