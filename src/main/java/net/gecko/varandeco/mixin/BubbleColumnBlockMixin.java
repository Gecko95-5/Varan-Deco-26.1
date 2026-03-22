package net.gecko.varandeco.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.minecraft.block.BubbleColumnBlock.DRAG;

//I got this code from Lukasabbe Copper Grate Bubble Mod https://github.com/lukasabbe/Copper-Grates-Bubble/tree/main
@Mixin(BubbleColumnBlock.class)
public abstract class BubbleColumnBlockMixin extends Block implements FluidDrainable {

    public BubbleColumnBlockMixin(Settings settings) {
        super(settings);
    }

    @Inject(method = "update(Lnet/minecraft/world/WorldAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;Lnet/minecraft/block/BlockState;)V",
    at = @At("HEAD"), cancellable = true)
    private static void newUpdate(WorldAccess world, BlockPos pos, BlockState water, BlockState bubbleSource, CallbackInfo ci){
        if (!BubbleColumnBlockMixin.isStillWater(water)) {
            return;
        }
        BlockState secondBubbleState = BubbleColumnBlockMixin.getSecondBubbleState(bubbleSource);
        world.setBlockState(pos, secondBubbleState, Block.NOTIFY_LISTENERS);
        BlockPos.Mutable mutable = pos.mutableCopy().move(Direction.UP);
        while (BubbleColumnBlockMixin.isStillWater(world.getBlockState(mutable))) {
            if (!world.setBlockState(mutable, secondBubbleState, Block.NOTIFY_LISTENERS)) {
                return;
            }
            mutable.move(Direction.UP);
        }
        ci.cancel();
    }

    @Unique
    private static BlockState getSecondBubbleState(BlockState state) {
        if (state.isOf(Blocks.BUBBLE_COLUMN)) {
        return state;
    }
        if (state.isOf(DecoBlocks.BUBBLE_BLOCK) || state.isOf(Blocks.SOUL_SAND) || state.isOf(DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE)) {
            return Blocks.BUBBLE_COLUMN.getDefaultState().with(DRAG, false);
        }
        if (state.isOf(Blocks.MAGMA_BLOCK) || state.isOf(DecoBlocks.BUBBLE_ELEVATOR_BLOCK_MAGMA)) {
            return Blocks.BUBBLE_COLUMN.getDefaultState().with(DRAG, true);
        }
        return Blocks.WATER.getDefaultState();
    }
    @Shadow
    private static boolean isStillWater(BlockState state) {
        return state.isOf(Blocks.BUBBLE_COLUMN) || state.isOf(Blocks.WATER) && state.getFluidState().getLevel() >= 8 && state.getFluidState().isStill();
    }
    @ModifyExpressionValue(
            method = "canPlaceAt",
            at= @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z", ordinal = 0)
    )
    public boolean canPlaceAt(boolean original, @Local(ordinal = 1) BlockState blockState){
        return original || blockState.isOf(DecoBlocks.BUBBLE_BLOCK) || blockState.isOf(DecoBlocks.BUBBLE_ELEVATOR_BLOCK_MAGMA) || blockState.isOf(DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE);
    }
}
