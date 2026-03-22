package net.gecko.varandeco.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TransparentWallBlock extends WallBlock {

    public TransparentWallBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected VoxelShape getVisualShape(final net.minecraft.world.level.block.state.BlockState state, final BlockGetter level, final BlockPos pos, final CollisionContext context) {
        return Shapes.empty();
    }
}
