package net.gecko.varandeco.block.custom;

import net.minecraft.world.level.block.IronBarsBlock;

public class TintedGlassPaneBlock extends IronBarsBlock {

    public TintedGlassPaneBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean propagatesSkylightDown(final net.minecraft.world.level.block.state.BlockState state) {
        return false;
    }

    @Override
    protected int getLightDampening(final net.minecraft.world.level.block.state.BlockState state) {
        return 15;
    }
}
