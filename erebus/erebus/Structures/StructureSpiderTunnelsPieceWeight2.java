package erebus.Structures;

final class StructureSpiderTunnelsPieceWeight2 extends StructureSpiderTunnelsPieceWeight
{
    StructureSpiderTunnelsPieceWeight2(Class par1Class, int par2, int par3)
    {
        super(par1Class, par2, par3);
    }

    public boolean canSpawnMoreStructuresOfType(int par1)
    {
        return super.canSpawnMoreStructuresOfType(par1) && par1 > 4;
    }
}
