package erebus.client.model.item;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWebSlinger extends ModelBase
{
	ModelRenderer ShapeA;
	ModelRenderer ShapeB;
	ModelRenderer ShapeC;
	ModelRenderer ShapeD;
	ModelRenderer ShapeE;
	ModelRenderer ShapeF;
	ModelRenderer ShapeG;
	ModelRenderer ShapeH;
	ModelRenderer ShapeI;
	ModelRenderer ShapeJ;
	ModelRenderer ShapeK;
	ModelRenderer ShapeL;
	ModelRenderer ShapeM;
	ModelRenderer ShapeN;
	ModelRenderer ShapeO;
	ModelRenderer ShapeP;
	ModelRenderer ShapeQ;
	ModelRenderer ShapeR;
	ModelRenderer ShapeS;
	ModelRenderer ShapeT;
	ModelRenderer ShapeU;
	ModelRenderer ShapeV;
	ModelRenderer ShapeW;
	ModelRenderer ShapeX;
	ModelRenderer Back;
	ModelRenderer BarrelDeco;
	ModelRenderer Barrel;
	ModelRenderer Grip;

	public ModelWebSlinger()
	{
		textureWidth = 64;
		textureHeight = 32;

		ShapeA = new ModelRenderer(this, 0, 0);
		ShapeA.addBox(-2.5F, -4.466667F, 2.5F, 5, 1, 1);
		ShapeA.setRotationPoint(0F, 8F, -9F);
		ShapeA.setTextureSize(64, 32);
		ShapeA.mirror = true;
		setRotation(ShapeA, 0F, 0F, -3.141593F);
		ShapeB = new ModelRenderer(this, 0, 0);
		ShapeB.addBox(0F, -1F, -0.5F, 13, 2, 1);
		ShapeB.setRotationPoint(0F, 8F, 0F);
		ShapeB.setTextureSize(64, 32);
		ShapeB.mirror = true;
		setRotation(ShapeB, 0.5759587F, 1.204277F, 0.5759587F);
		ShapeC = new ModelRenderer(this, 0, 0);
		ShapeC.addBox(-2.5F, -4.466667F, 2.5F, 5, 1, 1);
		ShapeC.setRotationPoint(0F, 8F, -9F);
		ShapeC.setTextureSize(64, 32);
		ShapeC.mirror = true;
		setRotation(ShapeC, 0F, 0F, 2.094395F);
		ShapeD = new ModelRenderer(this, 0, 0);
		ShapeD.addBox(-2.5F, -4.466667F, 2.5F, 5, 1, 1);
		ShapeD.setRotationPoint(0F, 8F, -9F);
		ShapeD.setTextureSize(64, 32);
		ShapeD.mirror = true;
		setRotation(ShapeD, 0F, 0F, 1.047198F);
		ShapeE = new ModelRenderer(this, 0, 0);
		ShapeE.addBox(-3.5F, -6.466667F, -0.5F, 7, 1, 1);
		ShapeE.setRotationPoint(0F, 8F, -9F);
		ShapeE.setTextureSize(64, 32);
		ShapeE.mirror = true;
		setRotation(ShapeE, 0F, 0F, -1.047198F);
		ShapeF = new ModelRenderer(this, 0, 0);
		ShapeF.addBox(-2.5F, -4.466667F, 2.5F, 5, 1, 1);
		ShapeF.setRotationPoint(0F, 8F, -9F);
		ShapeF.setTextureSize(64, 32);
		ShapeF.mirror = true;
		setRotation(ShapeF, 0F, 0F, -1.047198F);
		ShapeG = new ModelRenderer(this, 0, 0);
		ShapeG.addBox(-2.5F, -4.466667F, 2.5F, 5, 1, 1);
		ShapeG.setRotationPoint(0F, 8F, -9F);
		ShapeG.setTextureSize(64, 32);
		ShapeG.mirror = true;
		setRotation(ShapeG, 0F, 0F, -2.094395F);
		ShapeH = new ModelRenderer(this, 0, 0);
		ShapeH.addBox(-1.5F, -2.466667F, 5.5F, 3, 1, 1);
		ShapeH.setRotationPoint(0F, 8F, -9F);
		ShapeH.setTextureSize(64, 32);
		ShapeH.mirror = true;
		setRotation(ShapeH, 0F, 0F, 3.141593F);
		ShapeI = new ModelRenderer(this, 0, 0);
		ShapeI.addBox(-3.5F, -6.466667F, -0.5F, 7, 1, 1);
		ShapeI.setRotationPoint(0F, 8F, -9F);
		ShapeI.setTextureSize(64, 32);
		ShapeI.mirror = true;
		setRotation(ShapeI, 0F, 0F, 0F);
		ShapeJ = new ModelRenderer(this, 0, 0);
		ShapeJ.addBox(-3.5F, -6.466667F, -0.5F, 7, 1, 1);
		ShapeJ.setRotationPoint(0F, 8F, -9F);
		ShapeJ.setTextureSize(64, 32);
		ShapeJ.mirror = true;
		setRotation(ShapeJ, 0F, 0F, 3.141593F);
		ShapeK = new ModelRenderer(this, 0, 0);
		ShapeK.addBox(-3.5F, -6.466667F, -0.5F, 7, 1, 1);
		ShapeK.setRotationPoint(0F, 8F, -9F);
		ShapeK.setTextureSize(64, 32);
		ShapeK.mirror = true;
		setRotation(ShapeK, 0F, 0F, 1.047198F);
		ShapeL = new ModelRenderer(this, 0, 0);
		ShapeL.addBox(-3.5F, -6.466667F, -0.5F, 7, 1, 1);
		ShapeL.setRotationPoint(0F, 8F, -9F);
		ShapeL.setTextureSize(64, 32);
		ShapeL.mirror = true;
		setRotation(ShapeL, 0F, 0F, 2.094395F);
		ShapeM = new ModelRenderer(this, 0, 0);
		ShapeM.addBox(-3.5F, -6.466667F, -0.5F, 7, 1, 1);
		ShapeM.setRotationPoint(0F, 8F, -9F);
		ShapeM.setTextureSize(64, 32);
		ShapeM.mirror = true;
		setRotation(ShapeM, 0F, 0F, -2.094395F);
		ShapeN = new ModelRenderer(this, 0, 0);
		ShapeN.addBox(-2.5F, -4.466667F, 2.5F, 5, 1, 1);
		ShapeN.setRotationPoint(0F, 8F, -9F);
		ShapeN.setTextureSize(64, 32);
		ShapeN.mirror = true;
		setRotation(ShapeN, 0F, 0F, 0F);
		ShapeO = new ModelRenderer(this, 0, 0);
		ShapeO.addBox(-1.5F, -2.466667F, 5.5F, 3, 1, 1);
		ShapeO.setRotationPoint(0F, 8F, -9F);
		ShapeO.setTextureSize(64, 32);
		ShapeO.mirror = true;
		setRotation(ShapeO, 0F, 0F, 0F);
		ShapeP = new ModelRenderer(this, 0, 0);
		ShapeP.addBox(-1.5F, -2.466667F, 5.5F, 3, 1, 1);
		ShapeP.setRotationPoint(0F, 8F, -9F);
		ShapeP.setTextureSize(64, 32);
		ShapeP.mirror = true;
		setRotation(ShapeP, 0F, 0F, 1.047198F);
		ShapeQ = new ModelRenderer(this, 0, 0);
		ShapeQ.addBox(-1.5F, -2.466667F, 5.5F, 3, 1, 1);
		ShapeQ.setRotationPoint(0F, 8F, -9F);
		ShapeQ.setTextureSize(64, 32);
		ShapeQ.mirror = true;
		setRotation(ShapeQ, 0F, 0F, 2.094395F);
		ShapeR = new ModelRenderer(this, 0, 0);
		ShapeR.addBox(-1.5F, -2.466667F, 5.5F, 3, 1, 1);
		ShapeR.setRotationPoint(0F, 8F, -9F);
		ShapeR.setTextureSize(64, 32);
		ShapeR.mirror = true;
		setRotation(ShapeR, 0F, 0F, -1.047198F);
		ShapeS = new ModelRenderer(this, 0, 0);
		ShapeS.addBox(-1.5F, -2.466667F, 5.5F, 3, 1, 1);
		ShapeS.setRotationPoint(0F, 8F, -9F);
		ShapeS.setTextureSize(64, 32);
		ShapeS.mirror = true;
		setRotation(ShapeS, 0F, 0F, -2.094395F);
		ShapeT = new ModelRenderer(this, 0, 0);
		ShapeT.addBox(0F, -0.5F, -1F, 13, 1, 2);
		ShapeT.setRotationPoint(0F, 8F, 0F);
		ShapeT.setTextureSize(64, 32);
		ShapeT.mirror = true;
		setRotation(ShapeT, 0F, 2.251475F, 0F);
		ShapeU = new ModelRenderer(this, 0, 0);
		ShapeU.addBox(0F, -0.4666667F, -1F, 13, 1, 2);
		ShapeU.setRotationPoint(0F, 8F, 0F);
		ShapeU.setTextureSize(64, 32);
		ShapeU.mirror = true;
		setRotation(ShapeU, 0F, 0.9075712F, 0F);
		ShapeV = new ModelRenderer(this, 0, 0);
		ShapeV.addBox(0F, -1F, -0.5F, 13, 2, 1);
		ShapeV.setRotationPoint(0F, 8F, 0F);
		ShapeV.setTextureSize(64, 32);
		ShapeV.mirror = true;
		setRotation(ShapeV, 0.7853982F, -1.186824F, -2.600541F);
		ShapeW = new ModelRenderer(this, 0, 0);
		ShapeW.addBox(0F, -1F, -0.5F, 13, 2, 1);
		ShapeW.setRotationPoint(0F, 8F, 0F);
		ShapeW.setTextureSize(64, 32);
		ShapeW.mirror = true;
		setRotation(ShapeW, -0.4363323F, 1.937315F, 0.5759587F);
		ShapeX = new ModelRenderer(this, 0, 0);
		ShapeX.addBox(0F, -1F, -0.5F, 13, 2, 1);
		ShapeX.setRotationPoint(0F, 8F, 0F);
		ShapeX.setTextureSize(64, 32);
		ShapeX.mirror = true;
		setRotation(ShapeX, -0.6108652F, 1.204277F, -0.5759587F);
		Back = new ModelRenderer(this, 0, 16);
		Back.addBox(-2F, -2F, 7F, 4, 3, 6);
		Back.setRotationPoint(0F, 8F, 0F);
		Back.setTextureSize(64, 32);
		Back.mirror = true;
		setRotation(Back, 0F, 0F, 0F);
		BarrelDeco = new ModelRenderer(this, 36, 0);
		BarrelDeco.addBox(-2F, -0.5F, -1F, 4, 1, 7);
		BarrelDeco.setRotationPoint(0F, 8F, 0F);
		BarrelDeco.setTextureSize(64, 32);
		BarrelDeco.mirror = true;
		setRotation(BarrelDeco, 0F, 0F, 0F);
		Barrel = new ModelRenderer(this, 15, 4);
		Barrel.addBox(-1F, -1.5F, 0F, 2, 3, 8);
		Barrel.setRotationPoint(0F, 8F, 0F);
		Barrel.setTextureSize(64, 32);
		Barrel.mirror = true;
		setRotation(Barrel, 0F, 0F, 0F);
		Grip = new ModelRenderer(this, 0, 4);
		Grip.addBox(-1.5F, 1.5F, 7F, 3, 7, 4);
		Grip.setRotationPoint(0F, 8F, 0F);
		Grip.setTextureSize(64, 32);
		Grip.mirror = true;
		setRotation(Grip, 0.1396263F, 0F, 0F);
	}

	public void render()
	{
		ShapeA.render(0.0625F);

		ShapeC.render(0.0625F);
		ShapeD.render(0.0625F);
		ShapeE.render(0.0625F);
		ShapeF.render(0.0625F);
		ShapeG.render(0.0625F);
		ShapeH.render(0.0625F);
		ShapeI.render(0.0625F);
		ShapeJ.render(0.0625F);
		ShapeK.render(0.0625F);
		ShapeL.render(0.0625F);
		ShapeM.render(0.0625F);
		ShapeN.render(0.0625F);
		ShapeO.render(0.0625F);
		ShapeP.render(0.0625F);
		ShapeQ.render(0.0625F);
		ShapeR.render(0.0625F);
		ShapeS.render(0.0625F);
		// bad ShapeB.render(0.0625F);
		// good ShapeT.render(0.0625F);
		// good ShapeU.render(0.0625F);
		// bad ShapeV.render(0.0625F);
		// bad ShapeW.render(0.0625F);
		// bad ShapeX.render(0.0625F);
		Back.render(0.0625F);
		BarrelDeco.render(0.0625F);
		Barrel.render(0.0625F);
		Grip.render(0.0625F);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par6Entity) {

	}

}
