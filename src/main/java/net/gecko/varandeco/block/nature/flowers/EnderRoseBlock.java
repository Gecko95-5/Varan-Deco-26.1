package net.gecko.varandeco.block.nature.flowers;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class EnderRoseBlock extends FlowerBlock {
    public static final MapCodec<EnderRoseBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(EFFECTS_FIELD.forGetter(FlowerBlock::getSuspiciousEffects), propertiesCodec()).apply(instance, EnderRoseBlock::new)
    );

    @Override
    public MapCodec<EnderRoseBlock> codec() {
        return CODEC;
    }

    public EnderRoseBlock(Holder<MobEffect> registryEntry, float f, BlockBehaviour.Properties settings) {
        this(makeEffectList(registryEntry, f), settings);
    }

    public EnderRoseBlock(SuspiciousStewEffects suspiciousStewEffectsComponent, BlockBehaviour.Properties settings) {
        super(suspiciousStewEffectsComponent, settings);
    }

    @Override
    protected boolean mayPlaceOn(BlockState floor, BlockGetter world, BlockPos pos) {
        return super.mayPlaceOn(floor, world, pos) || floor.is(Blocks.END_STONE) || floor.is(DecoBlocks.VOID_STONE);
    }

    @Override
    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
        VoxelShape voxelShape = this.getShape(state, world, pos, CollisionContext.empty());
        Vec3 vec3d = voxelShape.bounds().getCenter();
        double d = pos.getX() + vec3d.x;
        double e = pos.getZ() + vec3d.z;

        for (int i = 0; i < 3; i++) {
            if (random.nextBoolean()) {
                world.addParticle(
                        ParticleTypes.PORTAL, d + random.nextDouble() / 5.0, pos.getY() + (0.5 - random.nextDouble()), e + random.nextDouble() / 5.0, 0.0, 0.0, 0.0
                );
            }
        }
    }

    @Override
    protected void entityInside(BlockState state, Level world, BlockPos pos, Entity entity, InsideBlockEffectApplier handler, boolean bl) {
        if (world instanceof ServerLevel serverWorld
                && world.getDifficulty() != Difficulty.PEACEFUL
                && entity instanceof LivingEntity livingEntity
                && !livingEntity.isInvulnerableTo(serverWorld, world.damageSources().magic())) {
            livingEntity.addEffect(this.getBeeInteractionEffect());
        }
    }

    @Override
    public MobEffectInstance getBeeInteractionEffect() {
        return new MobEffectInstance(MobEffects.LEVITATION, 40);
    }
}
