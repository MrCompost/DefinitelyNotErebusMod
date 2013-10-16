package erebus.client.render.entity;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import erebus.client.model.entity.ModelAnimatedChest;
import erebus.entity.EntityAnimatedChest;


public class RenderAnimatedChest extends RenderLiving
{
	protected ModelAnimatedChest model;

	private static final ResourceLocation Texture = new ResourceLocation("erebus:textures/mob/ModelAnimatedChest.png");

	public RenderAnimatedChest(ModelAnimatedChest par1ModelBase, float par2)
	{
		super(par1ModelBase, par2);
		model = (ModelAnimatedChest) mainModel;

	}
	public void renderAnimatedChest(EntityAnimatedChest par1EntityAnimatedChest, double par2, double par4, double par6, float par8, float par9)
	{
		super.doRenderLiving(par1EntityAnimatedChest, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
	{
		renderAnimatedChest((EntityAnimatedChest)par1EntityLiving, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
	{
		renderAnimatedChest((EntityAnimatedChest)par1Entity, par2, par4, par6, par8, par9);
	}
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return Texture;
	}

}
