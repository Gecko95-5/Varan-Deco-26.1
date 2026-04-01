package net.gecko.varandeco.effects;

import net.gecko.varandeco.VaranDeco;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class DecoStatusEffects {

    public static final Holder<MobEffect> GROUNDED = registerStatusEffect("grounded",
            new CustomAttributeEffect(MobEffectCategory.HARMFUL, 0x4D400F).addAttributeModifier(Attributes.JUMP_STRENGTH,
                    Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "grounded"),-0.2, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(Attributes.STEP_HEIGHT,
                            Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, "grounded"),-0.2, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    private static Holder<MobEffect> registerStatusEffect(String name, MobEffect statusEffect){
        return Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath(VaranDeco.MOD_ID, name), statusEffect);
    }

    public static void registerStatusEffects() {
        VaranDeco.LOGGER.info("Registering Status Effect for " + VaranDeco.MOD_ID);
    }
}
