package net.gecko.varandeco.block.oxidizable;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.WeightedPressurePlateBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class OxidizablePressurePlateBlock extends WeightedPressurePlateBlock implements WeatheringCopper {
    private final WeatheringCopper.WeatherState oxidationLevel;
    public OxidizablePressurePlateBlock( int weight,WeatheringCopper.WeatherState oxidationLevel, BlockSetType blockSetType, Properties settings) {
        super(weight, blockSetType, settings);
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

    public WeatheringCopper.WeatherState getAge() {
        return this.oxidationLevel;
    }
}
