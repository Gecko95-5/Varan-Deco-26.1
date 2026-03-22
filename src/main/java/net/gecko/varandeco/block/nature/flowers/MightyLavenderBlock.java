package net.gecko.varandeco.block.nature.flowers;

import net.gecko.varandeco.item.DecoItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.TallFlowerBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class MightyLavenderBlock extends TallFlowerBlock {
    public MightyLavenderBlock(Settings settings) {
        super(settings);
    }
    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        dropStack(world, pos, new ItemStack(DecoItems.MIGHTY_LAVENDER_FLOWER));
    }
}
