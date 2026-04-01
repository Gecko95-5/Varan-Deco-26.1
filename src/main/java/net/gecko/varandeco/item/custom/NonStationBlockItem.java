package net.gecko.varandeco.item.custom;

import java.util.function.Consumer;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.Block;

public class NonStationBlockItem extends BlockItem {
    private static final ChatFormatting FORMATTING = ChatFormatting.RED;
    private static final Component TEXT = Component.literal("This Block is not able to be used by Villagers").withStyle(FORMATTING);
    public NonStationBlockItem(Block block, Properties settings) {
        super(block, settings);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay displayComponent, Consumer<Component> textConsumer, TooltipFlag type) {
        textConsumer.accept(TEXT);
        super.appendHoverText(stack, context, displayComponent, textConsumer, type);
    }
}
