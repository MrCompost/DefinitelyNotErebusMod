package erebus.World.Gen.Layer;

import net.minecraft.world.biome.BiomeGenBase;

public class GenLayerErebusRiverMix extends GenLayerErebus
{
    private GenLayerErebus biomePatternGeneratorChain;
    private GenLayerErebus riverPatternGeneratorChain;

    public GenLayerErebusRiverMix(long par1, GenLayerErebus par3GenLayerErebus, GenLayerErebus par4GenLayerErebus)
    {
        super(par1);
        this.biomePatternGeneratorChain = par3GenLayerErebus;
        this.riverPatternGeneratorChain = par4GenLayerErebus;
    }

    /**
     * Initialize layer's local worldGenSeed based on its own baseSeed and the world's global seed (passed in as an
     * argument).
     */
    public void initWorldGenSeed(long par1)
    {
        this.biomePatternGeneratorChain.initWorldGenSeed(par1);
        this.riverPatternGeneratorChain.initWorldGenSeed(par1);
        super.initWorldGenSeed(par1);
    }

    /**
     * Returns a list of integer values generated by this layer. These may be interpreted as temperatures, rainfall
     * amounts, or biomeList[] indices based on the particular GenLayerErebus subclass.
     */
    public int[] getInts(int par1, int par2, int par3, int par4)
    {
        int[] var5 = this.biomePatternGeneratorChain.getInts(par1, par2, par3, par4);
        int[] var6 = this.riverPatternGeneratorChain.getInts(par1, par2, par3, par4);
        int[] var7 = IntCache.getIntCache(par3 * par4);

        for (int var8 = 0; var8 < par3 * par4; ++var8)
        {
            if (var5[var8] == BiomeGenBase.ocean.biomeID)
            {
                var7[var8] = var5[var8];
            }
            else if (var6[var8] >= 0)
            {
                if (var5[var8] == BiomeGenBase.icePlains.biomeID)
                {
                    var7[var8] = BiomeGenBase.frozenRiver.biomeID;
                }
                else if (var5[var8] != BiomeGenBase.mushroomIsland.biomeID && var5[var8] != BiomeGenBase.mushroomIslandShore.biomeID)
                {
                    var7[var8] = var6[var8];
                }
                else
                {
                    var7[var8] = BiomeGenBase.mushroomIslandShore.biomeID;
                }
            }
            else
            {
                var7[var8] = var5[var8];
            }
        }

        return var7;
    }
}
