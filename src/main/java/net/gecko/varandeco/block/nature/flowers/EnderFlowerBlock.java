package net.gecko.varandeco.block.nature.flowers;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;

public class EnderFlowerBlock extends FlowerBlock {


    public EnderFlowerBlock(SuspiciousStewEffects stewEffects, Properties settings) {
        super(stewEffects, settings);
    }

    @Override
    protected boolean mayPlaceOn(BlockState floor, BlockGetter world, BlockPos pos) {
        return super.mayPlaceOn(floor, world, pos) || floor.is(Blocks.END_STONE) || floor.is(DecoBlocks.VOID_STONE);
    }
}
