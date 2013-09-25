package erebus.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * @author ProPercivalalb
 */
public class BlockUmberstone extends Block {

	/**
	 * The icon path, not including "erebus:" as it is joined when registering
	 * icon
	 **/
	public static final String[] iconPaths = new String[] { "Umberstone", "cobbleUmber", "cobbleUmberMossy", "cobbleUmberWebbed", "umberstoneBricks" };
	public static final Icon[] icons = new Icon[iconPaths.length];

	public BlockUmberstone(int id) {
		super(id, Material.rock);
	}

	@Override
	public void registerIcons(IconRegister iconRegister) {
		int i = 0;
		for (String path : iconPaths)
			icons[i++] = iconRegister.registerIcon("erebus:" + path);
	}

	@Override
	public Icon getIcon(int side, int meta) {
		if (meta < 0 || meta >= icons.length)
			return null;
		return icons[meta];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int a = 0; a < icons.length; a++) {
			par3List.add(new ItemStack(par1, 1, a));
		}
	}

	@Override
	public int damageDropped(int meta) {
		if (meta == 0)
			return 1;
		else
			return meta;
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
		return 1;
	}

	@Override
	public int idDropped(int metadata, Random random, int fortune) {
		return blockID;
	}

	/**
	 * Used to decide what damage to pass to the stack when using the pick block
	 * button.
	 */
	@Override
	public int getDamageValue(World world, int x, int y, int z) {
		return world.getBlockMetadata(x, y, z);
	}
}
