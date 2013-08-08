package erebus.world.gen;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenWaterlily;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenPonds extends WorldGenerator
{
    private int blockIndex;
    private int groundIndex;
    private double size;

    public WorldGenPonds(int filler, int ground, double size)
    {
        this.blockIndex = filler;
        this.groundIndex = ground;
        this.size = size;
    }

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        par3 -= 8;

        for (par5 -= 8; par4 > 5 && par1World.isAirBlock(par3, par4, par5); --par4)
        {
            ;
        }

        if (par4 <= 4)
        {
            return false;
        }
        else
        {
            par4 -= 4;
            boolean[] aboolean = new boolean[2048];
            int l = par2Random.nextInt(4) + 4;
            int i1;

            for (i1 = 0; i1 < l; ++i1)
            {
                double d0 = (par2Random.nextDouble() * 6.0D + 3.0D) * size;
                double d1 = (par2Random.nextDouble() * 4.0D + 2.0D) * size / 2D;
                double d2 = (par2Random.nextDouble() * 6.0D + 3.0D) * size;
                double d3 = par2Random.nextDouble() * (16.0D - d0 - 2.0D) + 1.0D + d0 / 2.0D;
                double d4 = par2Random.nextDouble() * (8.0D - d1 - 4.0D) + 2.0D + d1 / 2.0D;
                double d5 = par2Random.nextDouble() * (16.0D - d2 - 2.0D) + 1.0D + d2 / 2.0D;

                for (int j1 = 1; j1 < 15; ++j1)
                {
                    for (int k1 = 1; k1 < 15; ++k1)
                    {
                        for (int l1 = 1; l1 < 7; ++l1)
                        {
                            double d6 = ((double)j1 - d3) / (d0 / 2.0D);
                            double d7 = ((double)l1 - d4) / (d1 / 2.0D);
                            double d8 = ((double)k1 - d5) / (d2 / 2.0D);
                            double d9 = d6 * d6 + d7 * d7 + d8 * d8;

                            if (d9 < 1.0D)
                            {
                                aboolean[(j1 * 16 + k1) * 8 + l1] = true;
                            }
                        }
                    }
                }
            }

            int i2;
            int j2;
            boolean flag;

            for (i1 = 0; i1 < 16; ++i1)
            {
                for (j2 = 0; j2 < 16; ++j2)
                {
                    for (i2 = 0; i2 < 8; ++i2)
                    {
                        flag = !aboolean[(i1 * 16 + j2) * 8 + i2] && (i1 < 15 && aboolean[((i1 + 1) * 16 + j2) * 8 + i2] || i1 > 0 && aboolean[((i1 - 1) * 16 + j2) * 8 + i2] || j2 < 15 && aboolean[(i1 * 16 + j2 + 1) * 8 + i2] || j2 > 0 && aboolean[(i1 * 16 + (j2 - 1)) * 8 + i2] || i2 < 7 && aboolean[(i1 * 16 + j2) * 8 + i2 + 1] || i2 > 0 && aboolean[(i1 * 16 + j2) * 8 + (i2 - 1)]);

                        if (flag)
                        {
                            Material material = par1World.getBlockMaterial(par3 + i1, par4 + i2, par5 + j2);

                            if (i2 >= 4 && material.isLiquid())
                            {
                                return false;
                            }

                            if (i2 < 4 && !material.isSolid() && par1World.getBlockId(par3 + i1, par4 + i2, par5 + j2) != this.blockIndex)
                            {
                                return false;
                            }
                        }
                    }
                }
            }

            /**Generating filler (water etc.)**/
            for (i1 = 0; i1 < 16; ++i1)
            {
                for (j2 = 0; j2 < 16; ++j2)
                {
                    for (i2 = 0; i2 < 8; ++i2)
                    {
                        if (aboolean[(i1 * 16 + j2) * 8 + i2])
                        {
                            par1World.setBlock(par3 + i1, par4 + i2, par5 + j2, i2 >= 4 ? 0 : this.blockIndex, 0, 2);
                        }
                    }
                }
            }

            /**Generating ground**/
            if (this.groundIndex > 0)
            {
                for (i1 = 0; i1 < 16; ++i1)
                {
                    for (j2 = 0; j2 < 16; ++j2)
                    {
                        for (i2 = 0; i2 < 8; ++i2)
                        {
                            flag = !aboolean[(i1 * 16 + j2) * 8 + i2] && (i1 < 15 && aboolean[((i1 + 1) * 16 + j2) * 8 + i2] || i1 > 0 && aboolean[((i1 - 1) * 16 + j2) * 8 + i2] || j2 < 15 && aboolean[(i1 * 16 + j2 + 1) * 8 + i2] || j2 > 0 && aboolean[(i1 * 16 + (j2 - 1)) * 8 + i2] || i2 < 7 && aboolean[(i1 * 16 + j2) * 8 + i2 + 1] || i2 > 0 && aboolean[(i1 * 16 + j2) * 8 + (i2 - 1)]);

                            if (flag && (i2 < 4 || par2Random.nextInt(2) != 0) && par1World.getBlockMaterial(par3 + i1, par4 + i2, par5 + j2).isSolid())
                            {
                                par1World.setBlock(par3 + i1, par4 + i2, par5 + j2, this.groundIndex, 0, 2);
                            }
                        }
                    }
                }
            }
            
            /**Generates waterlilies**/
            WorldGenWaterlily waterlily = new WorldGenWaterlily();
            for (int c = 0; c < 5; ++c) {
            	waterlily.generate(par1World, par2Random, par3 + par2Random.nextInt(8) - par2Random.nextInt(8) + 8, par4 + 2 + par2Random.nextInt(6), par5 + par2Random.nextInt(8) - par2Random.nextInt(8) + 8);
            }

            return true;
        }
    }
}
