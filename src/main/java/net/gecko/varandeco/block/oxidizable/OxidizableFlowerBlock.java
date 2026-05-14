package net.gecko.varandeco.block.oxidizable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

public class OxidizableFlowerBlock extends FlowerBlock implements WeatheringCopper {
    private final WeatheringCopper.WeatherState oxidationLevel;
    public OxidizableFlowerBlock(Holder<MobEffect> stewEffect, float effectSeconds, WeatheringCopper.WeatherState oxidationLevel, Properties properties) {
        super(stewEffect, effectSeconds, properties);
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
