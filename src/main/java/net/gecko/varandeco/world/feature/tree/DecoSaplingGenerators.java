package net.gecko.varandeco.world.feature.tree;

import net.gecko.varandeco.world.feature.DecoConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class DecoSaplingGenerators {

    public static final SaplingGenerator WOODEN =
            new SaplingGenerator("wooden", 0f, Optional.of(DecoConfiguredFeatures.DECO_MEGA_WOODEN_TREE_KEY),
                    Optional.empty(),
                    Optional.of(DecoConfiguredFeatures.DECO_WOODEN_TREE_KEY),
                    Optional.of(DecoConfiguredFeatures.DECO_FANCY_WOODEN_TREE_KEY),
                    Optional.empty(),
                    Optional.empty());

    public static final SaplingGenerator DRIFTWOOD =
            new SaplingGenerator("driftwood", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(DecoConfiguredFeatures.DECO_DRIFTWOOD_TREE_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());

    public static final SaplingGenerator IRON_CAP =
            new SaplingGenerator("iron_cap", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(DecoConfiguredFeatures.DECO_IRON_CAP_MUSHROOM),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
}
