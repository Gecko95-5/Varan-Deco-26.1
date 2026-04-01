package net.gecko.varandeco.block.nature;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class DriedLeafBlock extends Block {
    public static final MapCodec<DriedLeafBlock> CODEC = simpleCodec(DriedLeafBlock::new);

    public DriedLeafBlock(Properties settings) {
        super(settings);
    }
    @Override
    public MapCodec<DriedLeafBlock> codec() {
        return CODEC;
    }

    @Override
    protected void entityInside(BlockState state, Level world, BlockPos pos, Entity entity, InsideBlockEffectApplier handler, boolean bl) {
        Vec3 vec3d = new Vec3(0.9, 0.9F, 0.9);

        entity.makeStuckInBlock(state, vec3d);
    }
}
