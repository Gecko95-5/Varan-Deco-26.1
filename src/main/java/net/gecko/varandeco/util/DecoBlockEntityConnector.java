package net.gecko.varandeco.util;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class DecoBlockEntityConnector {
    public static void registerConnectedBlockEntities(){
        BlockEntityType.BARREL.addValidBlock(DecoBlocks.OAK_BARREL);
        BlockEntityType.BARREL.addValidBlock(DecoBlocks.BIRCH_BARREL);
        BlockEntityType.BARREL.addValidBlock(DecoBlocks.SPRUCE_BARREL);
        BlockEntityType.BARREL.addValidBlock(DecoBlocks.JUNGLE_BARREL);
        BlockEntityType.BARREL.addValidBlock(DecoBlocks.ACACIA_BARREL);
        BlockEntityType.BARREL.addValidBlock(DecoBlocks.DARK_OAK_BARREL);
        BlockEntityType.BARREL.addValidBlock(DecoBlocks.CHERRY_BARREL);
        BlockEntityType.BARREL.addValidBlock(DecoBlocks.MANGROVE_BARREL);
        BlockEntityType.BARREL.addValidBlock(DecoBlocks.PALE_OAK_BARREL);
        BlockEntityType.BARREL.addValidBlock(DecoBlocks.BAMBOO_BARREL);
        BlockEntityType.BARREL.addValidBlock(DecoBlocks.CRIMSON_BARREL);
        BlockEntityType.BARREL.addValidBlock(DecoBlocks.WARPED_BARREL);
        BlockEntityType.BARREL.addValidBlock(DecoBlocks.CACTUS_BARREL);
        BlockEntityType.BARREL.addValidBlock(DecoBlocks.DRIFTWOOD_BARREL);
        BlockEntityType.BARREL.addValidBlock(DecoBlocks.MUSHROOM_BARREL);
        BlockEntityType.BARREL.addValidBlock(DecoBlocks.IRON_CAP_BARREL);

        BlockEntityType.FURNACE.addValidBlock(DecoBlocks.DEEPSLATE_FURNACE);
        BlockEntityType.BLAST_FURNACE.addValidBlock(DecoBlocks.DEEPSLATE_BLAST_FURNACE);
        BlockEntityType.SMOKER.addValidBlock(DecoBlocks.DEEPSLATE_SMOKER);

        BlockEntityType.FURNACE.addValidBlock(DecoBlocks.BLACKSTONE_FURNACE);
        BlockEntityType.BLAST_FURNACE.addValidBlock(DecoBlocks.BLACKSTONE_BLAST_FURNACE);
        BlockEntityType.SMOKER.addValidBlock(DecoBlocks.BLACKSTONE_SMOKER);

        BlockEntityType.FURNACE.addValidBlock(DecoBlocks.TUFF_FURNACE);
        BlockEntityType.BLAST_FURNACE.addValidBlock(DecoBlocks.TUFF_BLAST_FURNACE);
        BlockEntityType.SMOKER.addValidBlock(DecoBlocks.TUFF_SMOKER);

        BlockEntityType.FURNACE.addValidBlock(DecoBlocks.END_STONE_FURNACE);
        BlockEntityType.BLAST_FURNACE.addValidBlock(DecoBlocks.END_STONE_BLAST_FURNACE);
        BlockEntityType.SMOKER.addValidBlock(DecoBlocks.END_STONE_SMOKER);

        BlockEntityType.SHELF.addValidBlock(DecoBlocks.CACTUS_SHELF);
        BlockEntityType.SHELF.addValidBlock(DecoBlocks.MUSHROOM_SHELF);
        BlockEntityType.SHELF.addValidBlock(DecoBlocks.IRON_CAP_SHELF);
        BlockEntityType.SHELF.addValidBlock(DecoBlocks.DRIFTWOOD_SHELF);
        BlockEntityType.SHELF.addValidBlock(DecoBlocks.WOODEN_SHELF);
    }
}
