package erebus.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.ModItems;
import erebus.entity.EntityUmberGolem;
import erebus.tileentity.TileEntityUmberGolemStatue;

public class BlockUmberGolemStatue extends BlockContainer {

	@SideOnly(Side.CLIENT)
	private Icon a, b;
	public BlockUmberGolemStatue(int id) {
		super(id, Material.rock);
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityUmberGolemStatue();
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z) {
		return world.doesBlockHaveSolidTopSurface(x, y - 1, z) || BlockFence.isIdAFence(world.getBlockId(x, y - 1, z));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return side == 0 ? b : side == 1 ? a : blockIcon;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		blockIcon = reg.registerIcon("erebus:blockErebusAltarBreak");
		a = reg.registerIcon("erebus:blockErebusAltarBreak");
		b = reg.registerIcon("erebus:blockErebusAltarBreak");
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		TileEntityUmberGolemStatue te = (TileEntityUmberGolemStatue) world.getBlockTileEntity(x, y, z);
		if (player.getCurrentEquippedItem() != null)
			if (player.getCurrentEquippedItem().itemID == ModItems.wandOfAnimation.itemID) {
				player.getCurrentEquippedItem().damageItem(1, player);
				if (!world.isRemote) {
					EntityUmberGolem entityUmberGolem;
					entityUmberGolem = new EntityUmberGolem(world);
					world.setBlockToAir(x, y, z);
					entityUmberGolem.setLocationAndAngles(x + 0.5D, y, z + 0.5D, MathHelper.wrapAngleTo180_float(player.rotationYaw * 360.0F), 0.0F);
					entityUmberGolem.rotationYawHead = entityUmberGolem.rotationYaw;
					entityUmberGolem.renderYawOffset = entityUmberGolem.rotationYaw;
					world.spawnEntityInWorld(entityUmberGolem);
					world.playSoundEffect(x, y, z, "erebus:altaroffering", 0.2F, 1.0F);
				}

				return true;
			}

		return false;
	}


	@Override
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
		byte b0 = 0;
		int l1 = MathHelper.floor_double(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;
		if (l1 == 0)
			b0 = 2;

		if (l1 == 1)
			b0 = 5;

		if (l1 == 2)
			b0 = 3;

		if (l1 == 3)
			b0 = 4;
		par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 3);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k) {
		float f = 0.0625F;
		return AxisAlignedBB.getBoundingBox(i + f, j, k + f, i + 1 - f, j + 1 - f, k + 1 - f);
	}


}