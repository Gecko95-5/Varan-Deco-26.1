package net.gecko.varandeco.item.custom;

import net.minecraft.block.Block;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.function.Consumer;

public class NonStationBlockItem extends BlockItem {
    private static final Formatting FORMATTING = Formatting.RED;
    private static final Text TEXT = Text.literal("This Block is not able to be used by Villagers").formatted(FORMATTING);
    public NonStationBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        textConsumer.accept(TEXT);
        super.appendTooltip(stack, context, displayComponent, textConsumer, type);
    }
}
