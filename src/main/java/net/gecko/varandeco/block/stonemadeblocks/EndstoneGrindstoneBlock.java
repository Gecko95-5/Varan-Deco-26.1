package net.gecko.varandeco.block.stonemadeblocks;

import com.mojang.serialization.MapCodec;
import net.gecko.varandeco.screen.stone.EndstoneGrindstoneMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class EndstoneGrindstoneBlock extends FaceAttachedHorizontalDirectionalBlock {
    public static final MapCodec<EndstoneGrindstoneBlock> CODEC = simpleCodec(EndstoneGrindstoneBlock::new);
    public static final VoxelShape WEST_FLOOR_LEG = Block.box(2.0, 0.0, 6.0, 4.0, 7.0, 10.0);
    public static final VoxelShape EAST_FLOOR_LEG = Block.box(12.0, 0.0, 6.0, 14.0, 7.0, 10.0);
    public static final VoxelShape WEST_FLOOR_HINGE = Block.box(2.0, 7.0, 5.0, 4.0, 13.0, 11.0);
    public static final VoxelShape EAST_FLOOR_HINGE = Block.box(12.0, 7.0, 5.0, 14.0, 13.0, 11.0);
    public static final VoxelShape WEST_FLOOR_SIDE = Shapes.or(WEST_FLOOR_LEG, WEST_FLOOR_HINGE);
    public static final VoxelShape EAST_FLOOR_SIDE = Shapes.or(EAST_FLOOR_LEG, EAST_FLOOR_HINGE);
    public static final VoxelShape Z_FLOOR_SIDES = Shapes.or(WEST_FLOOR_SIDE, EAST_FLOOR_SIDE);
    public static final VoxelShape Z_FLOOR_SHAPE = Shapes.or(Z_FLOOR_SIDES, Block.box(4.0, 4.0, 2.0, 12.0, 16.0, 14.0));
    public static final VoxelShape NORTH_FLOOR_LEG = Block.box(6.0, 0.0, 2.0, 10.0, 7.0, 4.0);
    public static final VoxelShape SOUTH_FLOOR_LEG = Block.box(6.0, 0.0, 12.0, 10.0, 7.0, 14.0);
    public static final VoxelShape NORTH_FLOOR_HINGE = Block.box(5.0, 7.0, 2.0, 11.0, 13.0, 4.0);
    public static final VoxelShape SOUTH_FLOOR_HINGE = Block.box(5.0, 7.0, 12.0, 11.0, 13.0, 14.0);
    public static final VoxelShape NORTH_FLOOR_SIDE = Shapes.or(NORTH_FLOOR_LEG, NORTH_FLOOR_HINGE);
    public static final VoxelShape SOUTH_FLOOR_SIDE = Shapes.or(SOUTH_FLOOR_LEG, SOUTH_FLOOR_HINGE);
    public static final VoxelShape X_FLOOR_SIDES = Shapes.or(NORTH_FLOOR_SIDE, SOUTH_FLOOR_SIDE);
    public static final VoxelShape X_FLOOR_SHAPE = Shapes.or(X_FLOOR_SIDES, Block.box(2.0, 4.0, 4.0, 14.0, 16.0, 12.0));
    public static final VoxelShape SOUTH_WALL_WEST_LEG = Block.box(2.0, 6.0, 0.0, 4.0, 10.0, 7.0);
    public static final VoxelShape SOUTH_WALL_EAST_LEG = Block.box(12.0, 6.0, 0.0, 14.0, 10.0, 7.0);
    public static final VoxelShape SOUTH_WALL_WEST_HINGE = Block.box(2.0, 5.0, 7.0, 4.0, 11.0, 13.0);
    public static final VoxelShape SOUTH_WALL_EAST_HINGE = Block.box(12.0, 5.0, 7.0, 14.0, 11.0, 13.0);
    public static final VoxelShape SOUTH_WALL_WEST_SIDE = Shapes.or(SOUTH_WALL_WEST_LEG, SOUTH_WALL_WEST_HINGE);
    public static final VoxelShape SOUTH_WALL_EAST_SIDE = Shapes.or(SOUTH_WALL_EAST_LEG, SOUTH_WALL_EAST_HINGE);
    public static final VoxelShape SOUTH_WALL_SIDES = Shapes.or(SOUTH_WALL_WEST_SIDE, SOUTH_WALL_EAST_SIDE);
    public static final VoxelShape SOUTH_WALL_SHAPE = Shapes.or(SOUTH_WALL_SIDES, Block.box(4.0, 2.0, 4.0, 12.0, 14.0, 16.0));
    public static final VoxelShape NORTH_WALL_WEST_LEG = Block.box(2.0, 6.0, 7.0, 4.0, 10.0, 16.0);
    public static final VoxelShape NORTH_WALL_EAST_LEG = Block.box(12.0, 6.0, 7.0, 14.0, 10.0, 16.0);
    public static final VoxelShape NORTH_WALL_WEST_HINGE = Block.box(2.0, 5.0, 3.0, 4.0, 11.0, 9.0);
    public static final VoxelShape NORTH_WALL_EAST_HINGE = Block.box(12.0, 5.0, 3.0, 14.0, 11.0, 9.0);
    public static final VoxelShape NORTH_WALL_WEST_SIDE = Shapes.or(NORTH_WALL_WEST_LEG, NORTH_WALL_WEST_HINGE);
    public static final VoxelShape NORTH_WALL_EAST_SIDE = Shapes.or(NORTH_WALL_EAST_LEG, NORTH_WALL_EAST_HINGE);
    public static final VoxelShape NORTH_WALL_SIDES = Shapes.or(NORTH_WALL_WEST_SIDE, NORTH_WALL_EAST_SIDE);
    public static final VoxelShape NORTH_WALL_SHAPE = Shapes.or(NORTH_WALL_SIDES, Block.box(4.0, 2.0, 0.0, 12.0, 14.0, 12.0));
    public static final VoxelShape WEST_WALL_NORTH_LEG = Block.box(7.0, 6.0, 2.0, 16.0, 10.0, 4.0);
    public static final VoxelShape WEST_WALL_SOUTH_LEG = Block.box(7.0, 6.0, 12.0, 16.0, 10.0, 14.0);
    public static final VoxelShape WEST_WALL_NORTH_HINGE = Block.box(3.0, 5.0, 2.0, 9.0, 11.0, 4.0);
    public static final VoxelShape WEST_WALL_SOUTH_HINGE = Block.box(3.0, 5.0, 12.0, 9.0, 11.0, 14.0);
    public static final VoxelShape WEST_WALL_NORTH_SIDE = Shapes.or(WEST_WALL_NORTH_LEG, WEST_WALL_NORTH_HINGE);
    public static final VoxelShape WEST_WALL_SOUTH_SIDE = Shapes.or(WEST_WALL_SOUTH_LEG, WEST_WALL_SOUTH_HINGE);
    public static final VoxelShape WEST_WALL_SIDES = Shapes.or(WEST_WALL_NORTH_SIDE, WEST_WALL_SOUTH_SIDE);
    public static final VoxelShape WEST_WALL_SHAPE = Shapes.or(WEST_WALL_SIDES, Block.box(0.0, 2.0, 4.0, 12.0, 14.0, 12.0));
    public static final VoxelShape EAST_WALL_NORTH_LEG = Block.box(0.0, 6.0, 2.0, 9.0, 10.0, 4.0);
    public static final VoxelShape EAST_WALL_SOUTH_LEG = Block.box(0.0, 6.0, 12.0, 9.0, 10.0, 14.0);
    public static final VoxelShape EAST_WALL_NORTH_HINGE = Block.box(7.0, 5.0, 2.0, 13.0, 11.0, 4.0);
    public static final VoxelShape EAST_WALL_SOUTH_HINGE = Block.box(7.0, 5.0, 12.0, 13.0, 11.0, 14.0);
    public static final VoxelShape EAST_WALL_NORTH_SIDE = Shapes.or(EAST_WALL_NORTH_LEG, EAST_WALL_NORTH_HINGE);
    public static final VoxelShape EAST_WALL_SOUTH_SIDE = Shapes.or(EAST_WALL_SOUTH_LEG, EAST_WALL_SOUTH_HINGE);
    public static final VoxelShape EAST_WALL_SIDES = Shapes.or(EAST_WALL_NORTH_SIDE, EAST_WALL_SOUTH_SIDE);
    public static final VoxelShape EAST_WALL_SHAPE = Shapes.or(EAST_WALL_SIDES, Block.box(4.0, 2.0, 4.0, 16.0, 14.0, 12.0));
    public static final VoxelShape WEST_CEILING_LEG = Block.box(2.0, 9.0, 6.0, 4.0, 16.0, 10.0);
    public static final VoxelShape EAST_CEILING_LEG = Block.box(12.0, 9.0, 6.0, 14.0, 16.0, 10.0);
    public static final VoxelShape WEST_CEILING_HINGE = Block.box(2.0, 3.0, 5.0, 4.0, 9.0, 11.0);
    public static final VoxelShape EAST_CEILING_HINGE = Block.box(12.0, 3.0, 5.0, 14.0, 9.0, 11.0);
    public static final VoxelShape WEST_CEILING_SIDE = Shapes.or(WEST_CEILING_LEG, WEST_CEILING_HINGE);
    public static final VoxelShape EAST_CEILING_SIDE = Shapes.or(EAST_CEILING_LEG, EAST_CEILING_HINGE);
    public static final VoxelShape Z_CEILING_SIDES = Shapes.or(WEST_CEILING_SIDE, EAST_CEILING_SIDE);
    public static final VoxelShape Z_CEILING_SHAPE = Shapes.or(Z_CEILING_SIDES, Block.box(4.0, 0.0, 2.0, 12.0, 12.0, 14.0));
    public static final VoxelShape NORTH_CEILING_LEG = Block.box(6.0, 9.0, 2.0, 10.0, 16.0, 4.0);
    public static final VoxelShape SOUTH_CEILING_LEG = Block.box(6.0, 9.0, 12.0, 10.0, 16.0, 14.0);
    public static final VoxelShape NORTH_CEILING_HINGE = Block.box(5.0, 3.0, 2.0, 11.0, 9.0, 4.0);
    public static final VoxelShape SOUTH_CEILING_HINGE = Block.box(5.0, 3.0, 12.0, 11.0, 9.0, 14.0);
    public static final VoxelShape NORTH_CEILING_SIDE = Shapes.or(NORTH_CEILING_LEG, NORTH_CEILING_HINGE);
    public static final VoxelShape SOUTH_CEILING_SIDE = Shapes.or(SOUTH_CEILING_LEG, SOUTH_CEILING_HINGE);
    public static final VoxelShape X_CEILING_SIDES = Shapes.or(NORTH_CEILING_SIDE, SOUTH_CEILING_SIDE);
    public static final VoxelShape X_CEILING_SHAPE = Shapes.or(X_CEILING_SIDES, Block.box(2.0, 0.0, 4.0, 14.0, 12.0, 12.0));
    private static final Component TITLE = Component.translatable("container.grindstone_title");

    public EndstoneGrindstoneBlock(BlockBehaviour.Properties settings) {
        super(settings);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL));
    }

    @Override
    public MapCodec<EndstoneGrindstoneBlock> codec() {
        return CODEC;
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    private VoxelShape getShape(BlockState state) {
        Direction direction = state.getValue(FACING);
        switch (state.getValue(FACE)) {
            case FLOOR:
                if (direction != Direction.NORTH && direction != Direction.SOUTH) {
                    return X_FLOOR_SHAPE;
                }

                return Z_FLOOR_SHAPE;
            case WALL:
                if (direction == Direction.NORTH) {
                    return NORTH_WALL_SHAPE;
                } else if (direction == Direction.SOUTH) {
                    return SOUTH_WALL_SHAPE;
                } else {
                    if (direction == Direction.EAST) {
                        return EAST_WALL_SHAPE;
                    }

                    return WEST_WALL_SHAPE;
                }
            case CEILING:
                if (direction != Direction.NORTH && direction != Direction.SOUTH) {
                    return X_CEILING_SHAPE;
                }

                return Z_CEILING_SHAPE;
            default:
                return X_FLOOR_SHAPE;
        }
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return this.getShape(state);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return this.getShape(state);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        return true;
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        if (!world.isClientSide()) {
            player.openMenu(state.getMenuProvider(world, pos));
            player.awardStat(Stats.INTERACT_WITH_GRINDSTONE);
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public MenuProvider getMenuProvider(BlockState state, Level world, BlockPos pos) {
        return new SimpleMenuProvider(
                (syncId, inventory, player) -> new EndstoneGrindstoneMenu(syncId, inventory, ContainerLevelAccess.create(world, pos)), TITLE
        );
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, FACE);
    }

    @Override
    protected boolean isPathfindable(BlockState state, PathComputationType type) {
        return false;
    }
}
