package net.gecko.varandeco.block.nature.flowers;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.*;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCollisionHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class EnderRoseBlock extends FlowerBlock {
    public static final MapCodec<EnderRoseBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(STEW_EFFECT_CODEC.forGetter(FlowerBlock::getStewEffects), createSettingsCodec()).apply(instance, EnderRoseBlock::new)
    );

    @Override
    public MapCodec<EnderRoseBlock> getCodec() {
        return CODEC;
    }

    public EnderRoseBlock(RegistryEntry<StatusEffect> registryEntry, float f, AbstractBlock.Settings settings) {
        this(createStewEffectList(registryEntry, f), settings);
    }

    public EnderRoseBlock(SuspiciousStewEffectsComponent suspiciousStewEffectsComponent, AbstractBlock.Settings settings) {
        super(suspiciousStewEffectsComponent, settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return super.canPlantOnTop(floor, world, pos) || floor.isOf(Blocks.END_STONE) || floor.isOf(DecoBlocks.VOID_STONE);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        VoxelShape voxelShape = this.getOutlineShape(state, world, pos, ShapeContext.absent());
        Vec3d vec3d = voxelShape.getBoundingBox().getCenter();
        double d = pos.getX() + vec3d.x;
        double e = pos.getZ() + vec3d.z;

        for (int i = 0; i < 3; i++) {
            if (random.nextBoolean()) {
                world.addParticleClient(
                        ParticleTypes.PORTAL, d + random.nextDouble() / 5.0, pos.getY() + (0.5 - random.nextDouble()), e + random.nextDouble() / 5.0, 0.0, 0.0, 0.0
                );
            }
        }
    }

    @Override
    protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity, EntityCollisionHandler handler, boolean bl) {
        if (world instanceof ServerWorld serverWorld
                && world.getDifficulty() != Difficulty.PEACEFUL
                && entity instanceof LivingEntity livingEntity
                && !livingEntity.isInvulnerableTo(serverWorld, world.getDamageSources().magic())) {
            livingEntity.addStatusEffect(this.getContactEffect());
        }
    }

    @Override
    public StatusEffectInstance getContactEffect() {
        return new StatusEffectInstance(StatusEffects.LEVITATION, 40);
    }
}
