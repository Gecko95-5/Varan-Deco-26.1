package net.gecko.varandeco.block.nature.flowers;

import net.gecko.varandeco.item.DecoItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.TallFlowerBlock;
import net.minecraft.world.level.block.state.BlockState;

public class MightyLavenderBlock extends TallFlowerBlock {
    public MightyLavenderBlock(Properties settings) {
        super(settings);
    }
    @Override
    public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState state) {
        popResource(world, pos, new ItemStack(DecoItems.MIGHTY_LAVENDER_FLOWER));
    }
}
