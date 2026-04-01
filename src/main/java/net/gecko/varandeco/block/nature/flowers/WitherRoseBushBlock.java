package net.gecko.varandeco.block.nature.flowers;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.Difficulty;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.TallFlowerBlock;
import net.minecraft.world.level.block.state.BlockState;

public class WitherRoseBushBlock extends TallFlowerBlock {
    public WitherRoseBushBlock(Properties settings) {
        super(settings);
    }
    @Override
    protected boolean mayPlaceOn(BlockState floor, BlockGetter world, BlockPos pos) {
        return super.mayPlaceOn(floor, world, pos) || floor.is(Blocks.NETHERRACK) || floor.is(Blocks.SOUL_SAND) || floor.is(Blocks.SOUL_SOIL);
    }
    @Override
    protected void entityInside(BlockState state, Level world, BlockPos pos, Entity entity, InsideBlockEffectApplier handler, boolean bl) {
        if (world instanceof ServerLevel serverWorld
                && world.getDifficulty() != Difficulty.PEACEFUL
                && entity instanceof LivingEntity livingEntity
                && !livingEntity.isInvulnerableTo(serverWorld, world.damageSources().magic())) {
            livingEntity.addEffect(this.getContactEffect());
        }
    }

    public MobEffectInstance getContactEffect() {
        return new MobEffectInstance(MobEffects.WITHER, 40);
    }
}
