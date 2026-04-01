package net.gecko.varandeco.util.interfaces;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;

//I had some inspiration The Mentor CodeLab
public interface CoralFanFunction<T, F> {
    F apply(Block standingBlock, Block wallBlock, Direction attachmentDirection, T properties);
}
