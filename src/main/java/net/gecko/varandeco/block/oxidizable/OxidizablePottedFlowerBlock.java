package net.gecko.varandeco.block.oxidizable;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

public class OxidizablePottedFlowerBlock extends FlowerPotBlock implements WeatheringCopper {
    private final WeatheringCopper.WeatherState oxidationLevel;
    public OxidizablePottedFlowerBlock(Block potted, WeatheringCopper.WeatherState oxidationLevel, Properties properties) {
        super(potted, properties);
        this.oxidationLevel = oxidationLevel;
    }
    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        this.changeOverTime(state, world, pos, random);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return WeatheringCopper.getNext(state.getBlock()).isPresent();
    }

    @Override
    public WeatherState getAge() {
        return this.oxidationLevel;
    }
}
