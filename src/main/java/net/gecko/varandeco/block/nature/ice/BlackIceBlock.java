package net.gecko.varandeco.block.nature.ice;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.EnchantmentTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;
import org.jetbrains.annotations.Nullable;

public class BlackIceBlock extends Block {
    public BlackIceBlock(Settings settings) {
        super(settings);
    }


    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (entity.isOnFire()) {
            world.syncWorldEvent(WorldEvents.LAVA_EXTINGUISHED, pos, 0);
        entity.extinguish();
        entity.serverDamage(world.getDamageSources().freeze(), 5.0F);
    }
        if (!entity.bypassesSteppingEffects()) {
            entity.serverDamage(world.getDamageSources().freeze(), 1.0F);
        }
        super.onSteppedOn(world, pos, state, entity);
    }

    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBreak(world, pos, state, player);
        ItemStack stack = player.getMainHandStack();
        int i = stack.getMaxDamage();
        if (!stack.isSuitableFor(DecoBlocks.BLACK_ICE.getDefaultState())){
            stack.damage(i, player, (EquipmentSlot.MAINHAND));
        }
        return state;
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!player.bypassesSteppingEffects()) {
            player.serverDamage(world.getDamageSources().freeze(), 0.1F);
        }
        return super.onUse(state, world, pos, player, hit);
    }

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {
        super.afterBreak(world, player, pos, state, blockEntity, stack);
        if (!stack.isSuitableFor(DecoBlocks.BLACK_ICE.getDefaultState())){
            if (!EnchantmentHelper.hasAnyEnchantmentsIn(stack, EnchantmentTags.PREVENTS_ICE_MELTING)) {
                BlockState blockState = world.getBlockState(pos.down());
                if (blockState.blocksMovement() || blockState.isReplaceable()) {
                    world.setBlockState(pos, Blocks.PACKED_ICE.getDefaultState());
                }
            }

            BlockState blockState = world.getBlockState(pos.down());
            if (blockState.blocksMovement() || blockState.isReplaceable()) {
                world.setBlockState(pos, Blocks.PACKED_ICE.getDefaultState());
            }
        }
        if (!EnchantmentHelper.hasAnyEnchantmentsIn(stack, EnchantmentTags.PREVENTS_ICE_MELTING)) {
            BlockState blockState = world.getBlockState(pos.down());
            if (blockState.blocksMovement() || blockState.isReplaceable()) {
                world.setBlockState(pos, Blocks.PACKED_ICE.getDefaultState());
            }
        }
    }
}
