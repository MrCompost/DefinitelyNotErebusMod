package erebus.client.render.tileentity;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.client.model.block.ModelAltarLightning;
import erebus.tileentity.TileEntityErebusAltarLightning;

@SideOnly(Side.CLIENT)
public class TileEntityErebusAltarLightningRenderer extends TileEntitySpecialRenderer {

	private final ModelAltarLightning ModelAltarBlock = new ModelAltarLightning();

	public void renderAModelAt(TileEntityErebusAltarLightning tile, double d, double d1, double d2, float f) {
		TileEntityErebusAltarLightning te = tile;
		if (te.animationTicks <= 5)
			bindTexture(new ResourceLocation("erebus:textures/blocks/EngineOfIllapa1.png"));
		else if (te.animationTicks > 5 && te.animationTicks <= 10)
			bindTexture(new ResourceLocation("erebus:textures/blocks/EngineOfIllapa2.png"));
		else if (te.animationTicks > 10 && te.animationTicks <= 15)
			bindTexture(new ResourceLocation("erebus:textures/blocks/EngineOfIllapa3.png"));
		else if (te.animationTicks > 15 && te.animationTicks <= 20)
			bindTexture(new ResourceLocation("erebus:textures/blocks/EngineOfIllapa4.png"));
		else if (te.animationTicks > 20 && te.animationTicks < 25)
			bindTexture(new ResourceLocation("erebus:textures/blocks/EngineOfIllapa5.png"));
		else if (te.animationTicks == 25 && te.fuzz <= 5)
			bindTexture(new ResourceLocation("erebus:textures/blocks/EngineOfIllapa5.png"));
		else if (te.animationTicks == 25 && te.fuzz > 5 && te.fuzz <= 10 || te.animationTicks == 25 && te.fuzz > 15 && te.fuzz <= 20)
			bindTexture(new ResourceLocation("erebus:textures/blocks/EngineOfIllapa6.png"));
		else if (te.animationTicks == 25 && te.fuzz > 10 && te.fuzz <= 15)
			bindTexture(new ResourceLocation("erebus:textures/blocks/EngineOfIllapa7.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef((float) d + 0.5F, (float) d1 + 0.75F, (float) d2 + 0.5F);
		GL11.glScalef(0.5F, -0.5F, -0.5F);
		GL11.glRotatef(0 * 90, 0.0F, 1.0F, 0.0F);
		ModelAltarBlock.render(tile);
		GL11.glPopMatrix();
	}

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float partialTickTime) {
		renderAModelAt((TileEntityErebusAltarLightning) tile, x, y, z, partialTickTime);
	}

}