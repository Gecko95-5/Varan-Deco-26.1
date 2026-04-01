package net.gecko.varandeco.block.nature.ice;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.EnchantmentTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LevelEvent;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class BlackIceBlock extends Block {
    public BlackIceBlock(Properties settings) {
        super(settings);
    }


    @Override
    public void stepOn(Level world, BlockPos pos, BlockState state, Entity entity) {
        if (entity.isOnFire()) {
            world.levelEvent(LevelEvent.LAVA_FIZZ, pos, 0);
        entity.clearFire();
        entity.hurt(world.damageSources().freeze(), 5.0F);
    }
        if (!entity.isSteppingCarefully()) {
            entity.hurt(world.damageSources().freeze(), 1.0F);
        }
        super.stepOn(world, pos, state, entity);
    }

    public BlockState playerWillDestroy(Level world, BlockPos pos, BlockState state, Player player) {
        super.playerWillDestroy(world, pos, state, player);
        ItemStack stack = player.getMainHandItem();
        int i = stack.getMaxDamage();
        if (!stack.isCorrectToolForDrops(DecoBlocks.BLACK_ICE.defaultBlockState())){
            stack.hurtAndBreak(i, player, (EquipmentSlot.MAINHAND));
        }
        return state;
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        if (!player.isSteppingCarefully()) {
            player.hurt(world.damageSources().freeze(), 0.1F);
        }
        return super.useWithoutItem(state, world, pos, player, hit);
    }

    @Override
    public void playerDestroy(Level world, Player player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {
        super.playerDestroy(world, player, pos, state, blockEntity, stack);
        if (!stack.isCorrectToolForDrops(DecoBlocks.BLACK_ICE.defaultBlockState())){
            if (!EnchantmentHelper.hasTag(stack, EnchantmentTags.PREVENTS_ICE_MELTING)) {
                BlockState blockState = world.getBlockState(pos.below());
                if (blockState.blocksMotion() || blockState.canBeReplaced()) {
                    world.setBlockAndUpdate(pos, Blocks.PACKED_ICE.defaultBlockState());
                }
            }

            BlockState blockState = world.getBlockState(pos.below());
            if (blockState.blocksMotion() || blockState.canBeReplaced()) {
                world.setBlockAndUpdate(pos, Blocks.PACKED_ICE.defaultBlockState());
            }
        }
        if (!EnchantmentHelper.hasTag(stack, EnchantmentTags.PREVENTS_ICE_MELTING)) {
            BlockState blockState = world.getBlockState(pos.below());
            if (blockState.blocksMotion() || blockState.canBeReplaced()) {
                world.setBlockAndUpdate(pos, Blocks.PACKED_ICE.defaultBlockState());
            }
        }
    }
}
