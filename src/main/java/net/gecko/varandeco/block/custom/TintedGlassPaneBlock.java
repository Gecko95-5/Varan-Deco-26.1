package net.gecko.varandeco.block.custom;

import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockState;

public class TintedGlassPaneBlock extends IronBarsBlock {
    public TintedGlassPaneBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected boolean propagatesSkylightDown(BlockState state) {
        return false;
    }

    @Override
    protected int getLightDampening(final BlockState state) {
        return 15;
    }
}
