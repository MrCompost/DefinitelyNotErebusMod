package erebus;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import erebus.block.BlockAmber;
import erebus.block.BlockBambooCrate;
import erebus.block.BlockCaveSpiderSpawner;
import erebus.block.BlockCobbleWebbed;
import erebus.block.BlockErebus;
import erebus.block.BlockErebusBrick;
import erebus.block.BlockErebusGrass;
import erebus.block.BlockErebusOre;
import erebus.block.BlockFern;
import erebus.block.BlockHollowLog;
import erebus.block.BlockLeavesErebus;
import erebus.block.BlockLogAcacia;
import erebus.block.BlockLogEucalyptus;
import erebus.block.BlockLogMahogany;
import erebus.block.BlockMaggot;
import erebus.block.BlockOreFossil;
import erebus.block.BlockPlanksErebus;
import erebus.block.BlockPortalErebus;
import erebus.block.BlockQuickSand;
import erebus.block.BlockSaplingErebus;
import erebus.block.BlockScree;
import erebus.block.BlockSilk;
import erebus.block.BlockSpiderSilk;
import erebus.block.BlockSpiderSpawner;
import erebus.block.BlockStairsErebus;
import erebus.block.BlockThorns;
import erebus.block.BlockTurnip;
import erebus.block.BlockUmberstone;
import erebus.item.ItemMultiBlock;
import erebus.item.ItemSapling;
import erebus.tileentity.TileEntityHollowLog;

/**
 * @author ProPercivalalb
 */
public class ModBlocks {

	//public static Block mud;
	public static Block blockAmber;						public static int blockAmberID;
	public static BlockPortalErebus portalErebus;		public static int portalErebusID;
	public static Block woodMahogany;					public static int woodMahoganyID;
	public static BlockLeavesErebus leavesMahogany;		public static int leavesMahoganyID;
	public static Block woodEucalyptus;					public static int woodEucalyptusID;
	public static BlockLeavesErebus leavesEucalyptus;	public static int leavesEucalyptusID;
	public static Block cobbleWebbed;					public static int cobbleWebbedID;
	public static Block oreFossil;						public static int oreFossilID;
	public static Block blockSilk;						public static int blockSilkID;
	public static Block planksMahogany;					public static int planksMahoganyID;
	public static Block planksEucalyptus;				public static int planksEucalyptusID;
	public static Block stairsMahogany;					//public static int blockAmberID;
	public static Block stairsEucalyptus;				//public static int blockAmberID;
	public static Block mirBrick;						public static int mirBrickID;
	public static Block spiderSpawner;					public static int spiderSpawnerID;
	public static Block caveSpiderSpawner;				public static int caveSpiderSpawnerID;
	public static Block blockSpiderSilk;				public static int blockSpiderSilkID;
	public static Block thorns;							public static int thornsID;
	public static BlockFern fern;						public static int fernID;
	public static Block woodAcacia;						public static int woodAcaciaID;
	public static BlockLeavesErebus leavesAcacia;		public static int leavesAcaciaID;
	public static Block erebusSapling;					public static int erebusSaplingID;
	public static Block erebusGrass;					public static int erebusGrassID;
	public static Block planksAcacia;					public static int planksAcaciaID;
	public static Block quickSand;						public static int quickSandID;
	public static Block blockTurnip;					public static int blockTurnipID;
	public static Block dryScree;						//public static int blockAmberID;
	public static Block screeBricks;					//public static int blockAmberID;
	public static Block hollowLogAcacia;				public static int hollowLogAcaciaID;
	public static Block maggotLogAcacia;				//public static int blockAmberID;
	public static Block umberstone;					    public static int umberstoneID;
	public static Block umberOreBlock;					public static int umberOreBlockID;
	public static Block bambooCrate;			  	    public static int bambooCrateID;
	
	public static void init() {
		//mud = new BlockMud(2501, 0).setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("mud");
		portalErebus = (BlockPortalErebus)(new BlockPortalErebus(portalErebusID, 221)).setStepSound(Block.soundGlassFootstep).setHardness(-1F).setLightValue(1.0F).setUnlocalizedName("portalErebus").setCreativeTab(ErebusMod.tabErebus);
		blockAmber = new BlockAmber(blockAmberID).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("blockAmber").setCreativeTab(ErebusMod.tabErebus);
		woodMahogany = new BlockLogMahogany(woodMahoganyID).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("tree_mahogany").setCreativeTab(ErebusMod.tabErebus);
		leavesMahogany = (BlockLeavesErebus)(new BlockLeavesErebus(leavesMahoganyID, 0)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("leaves_mahogany").setCreativeTab(ErebusMod.tabErebus).func_111022_d("erebus:leaves_mahogany");
		woodEucalyptus = new BlockLogEucalyptus(woodEucalyptusID).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("tree_eucalyptus").setCreativeTab(ErebusMod.tabErebus);
		leavesEucalyptus = (BlockLeavesErebus)(new BlockLeavesErebus(leavesEucalyptusID, 1)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("leaves_eucalyptus").setCreativeTab(ErebusMod.tabErebus).func_111022_d("erebus:leaves_eucalyptus");
		cobbleWebbed = new BlockCobbleWebbed(cobbleWebbedID).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundClothFootstep).setUnlocalizedName("cobbleWebbed").setCreativeTab(ErebusMod.tabErebus).func_111022_d("erebus:cobbleWebbed");
		oreFossil = new BlockOreFossil(oreFossilID).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("oreFossil_U").setCreativeTab(ErebusMod.tabErebus).func_111022_d("erebus:oreFossil_U");
		blockSilk = new BlockSilk(blockSilkID, 70).setHardness(0.2F).setStepSound(Block.soundClothFootstep).setUnlocalizedName("blockSilk").setCreativeTab(ErebusMod.tabErebus).func_111022_d("erebus:blockSilk");
		planksMahogany = new BlockPlanksErebus(planksMahoganyID).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("wood_mahogany").setCreativeTab(ErebusMod.tabErebus).func_111022_d("erebus:wood_mahogany");
		planksEucalyptus = new BlockPlanksErebus(planksEucalyptusID).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("wood_eucalyptus").setCreativeTab(ErebusMod.tabErebus).func_111022_d("erebus:wood_eucalyptus");
		mirBrick = new BlockErebus(mirBrickID, Material.rock).setHardness(1.5F).setResistance(100.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("mirbrick").setCreativeTab(ErebusMod.tabErebus).func_111022_d("erebus:mirbrick");
		spiderSpawner = new BlockSpiderSpawner(spiderSpawnerID, 96).setHardness(1.5F).setResistance(100.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("spiderSpawner").func_111022_d("erebus:spiderSpawner");
		caveSpiderSpawner = new BlockCaveSpiderSpawner(caveSpiderSpawnerID, 96).setHardness(1.5F).setResistance(100.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("spiderSpawner").func_111022_d("erebus:spiderSpawner");
		blockSpiderSilk = new BlockSpiderSilk(blockSpiderSilkID).setHardness(0.2F).setStepSound(Block.soundClothFootstep).setUnlocalizedName("blockSpiderSilk").setCreativeTab(ErebusMod.tabErebus).func_111022_d("erebus:blockSpiderSilk");
		thorns = new BlockThorns(thornsID).setHardness(0.2F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("thorns").setCreativeTab(ErebusMod.tabErebus).func_111022_d("erebus:thorns");
		fern = (BlockFern)(new BlockFern(fernID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("erebusFern").setCreativeTab(ErebusMod.tabErebus);
		woodAcacia = new BlockLogAcacia(woodAcaciaID).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("tree_acacia").setCreativeTab(ErebusMod.tabErebus);
		leavesAcacia = (BlockLeavesErebus)(new BlockLeavesErebus(leavesAcaciaID, 2)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("leaves_acacia").setCreativeTab(ErebusMod.tabErebus).func_111022_d("erebus:leaves_acacia");
		erebusSapling = new BlockSaplingErebus(erebusSaplingID).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("sapling_mahogany");
		erebusGrass = new BlockErebusGrass(erebusGrassID).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("tallgrass").setCreativeTab(ErebusMod.tabErebus).func_111022_d("erebus:tallgrass");
		planksAcacia = new BlockPlanksErebus(planksAcaciaID).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("wood_acacia").setCreativeTab(ErebusMod.tabErebus).func_111022_d("erebus:wood_acacia");
		quickSand = new BlockQuickSand(quickSandID).setHardness(0.5F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("quickSand").setCreativeTab(ErebusMod.tabErebus);
		blockTurnip = (new BlockTurnip(blockTurnipID)).setUnlocalizedName("turnips");
		umberOreBlock = new BlockErebusOre(umberOreBlockID).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("oreBlockU");
		umberstone = new BlockUmberstone(umberstoneID, Material.rock).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("umberstone");
		bambooCrate = new BlockBambooCrate(bambooCrateID).setUnlocalizedName("bamboo").setHardness(2.0F).setCreativeTab(ErebusMod.tabErebus);
		
		dryScree = (new BlockScree(2550)).setHardness(0.5F).setStepSound(Block.soundSandFootstep).setUnlocalizedName("blockScree").setCreativeTab(ErebusMod.tabErebus).func_111022_d("erebus:blockScree");  
		screeBricks = (new BlockErebusBrick(2551)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("brickScree").setCreativeTab(ErebusMod.tabErebus).func_111022_d("erebus:brickScree");
		hollowLogAcacia = new BlockHollowLog(2552, TileEntityHollowLog.class).setHardness(0.4F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("log_acacia").setCreativeTab(ErebusMod.tabErebus).func_111022_d("erebus:log_acacia");
		maggotLogAcacia = new BlockMaggot(2553, 164).setHardness(0.4F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("log_acacia").setCreativeTab(ErebusMod.tabErebus).func_111022_d("erebus:log_acacia");
		stairsMahogany = new BlockStairsErebus(2554, planksMahogany, 0).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("stairsMahogany").setCreativeTab(ErebusMod.tabErebus);
		stairsEucalyptus = new BlockStairsErebus(2555, planksEucalyptus, 0).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("stairsEucalyptus").setCreativeTab(ErebusMod.tabErebus);
	
		//GameRegistry.registerBlock(mud);		  
		GameRegistry.registerBlock(portalErebus, "erebus.portal");
		GameRegistry.registerBlock(blockAmber, ItemMultiBlock.class, "erebus.blockAmber");		  
		GameRegistry.registerBlock(woodMahogany, "erebus.woodMahogany");		  
		GameRegistry.registerBlock(leavesMahogany, "erebus.leavesMahogany");		  
		GameRegistry.registerBlock(woodEucalyptus, "erebus.woodEucalyptus");		  
		GameRegistry.registerBlock(leavesEucalyptus, "erebus.leavesEucalyptus");		  
		GameRegistry.registerBlock(cobbleWebbed, "erebus.cobbleWebbed");		  
		GameRegistry.registerBlock(oreFossil, "erebus.oreFossil");		  
		GameRegistry.registerBlock(blockSilk, "erebus.blockSilk");		  
		GameRegistry.registerBlock(planksMahogany, "erebus.planksMahogany");		  
		GameRegistry.registerBlock(planksEucalyptus, "erebus.planksEucalyptus");		  
		GameRegistry.registerBlock(mirBrick, "erebus.mirBrick");		  
		GameRegistry.registerBlock(spiderSpawner, "erebus.spiderSpawner");		  
		GameRegistry.registerBlock(caveSpiderSpawner, "erebus.caveSpiderSpawner");		  
		GameRegistry.registerBlock(blockSpiderSilk, "erebus.blockSpiderSilk");		  
		GameRegistry.registerBlock(thorns, "erebus.thorns");		  
		GameRegistry.registerBlock(fern, "erebus.fern");		  
		GameRegistry.registerBlock(woodAcacia, "erebus.woodAcacia");		  
		GameRegistry.registerBlock(leavesAcacia, "erebus.leavesAcacia");	  
		GameRegistry.registerBlock(erebusSapling, ItemSapling.class, "erebus.erebusSapling");		  
		GameRegistry.registerBlock(erebusGrass, "erebus.erebusGrass");		  
		GameRegistry.registerBlock(planksAcacia, "erebus.planksAcacia");		  
		GameRegistry.registerBlock(quickSand, "erebus.quickSand");
		GameRegistry.registerBlock(blockTurnip, "erebus.blockTurnip");
		//GameRegistry.registerBlock(dryScree, "erebus.dryScree");		  
		//GameRegistry.registerBlock(screeBricks, "erebus.screeBricks");		  
		GameRegistry.registerBlock(hollowLogAcacia, "erebus.hollowLogAcacia");		  
		//GameRegistry.registerBlock(maggotLogAcacia, "erebus.maggotLogAcacia");		  
		//GameRegistry.registerBlock(stairsMahogany);		  
		//GameRegistry.registerBlock(stairsEucalyptus);
		GameRegistry.registerBlock(umberstone, ItemMultiBlock.class, "erebus.umberstone");		  
		GameRegistry.registerBlock(umberOreBlock, ItemMultiBlock.class, "erebus.oreBlockU");		  	  
		GameRegistry.registerBlock(bambooCrate, ItemMultiBlock.class, "erebus.bamboo");
		
		//Block Mining Levels
		MinecraftForge.setBlockHarvestLevel(blockAmber, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(cobbleWebbed, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(oreFossil, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(mirBrick, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(screeBricks, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(umberOreBlock, 0, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(umberOreBlock, 3, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(umberOreBlock, 4, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(umberOreBlock, 5, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(umberOreBlock, 1, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(umberOreBlock, 2, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(umberOreBlock, 5, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(quickSand, "shovel", 1);
		MinecraftForge.setBlockHarvestLevel(dryScree, "shovel", 0);
	}
}
