package net.gecko.varandeco.block.nature;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCollisionHandler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class DriedLeafBlock extends Block {
    public static final MapCodec<DriedLeafBlock> CODEC = createCodec(DriedLeafBlock::new);

    public DriedLeafBlock(Settings settings) {
        super(settings);
    }
    @Override
    public MapCodec<DriedLeafBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity, EntityCollisionHandler handler, boolean bl) {
        Vec3d vec3d = new Vec3d(0.9, 0.9F, 0.9);

        entity.slowMovement(state, vec3d);
    }
}
