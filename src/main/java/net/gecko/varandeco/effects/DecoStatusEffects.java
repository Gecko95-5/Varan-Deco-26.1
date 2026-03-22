package net.gecko.varandeco.effects;

import net.gecko.varandeco.VaranDeco;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class DecoStatusEffects {

    public static final RegistryEntry<StatusEffect> GROUNDED = registerStatusEffect("grounded",
            new CustomAttributeEffect(StatusEffectCategory.HARMFUL, 0x4D400F).addAttributeModifier(EntityAttributes.JUMP_STRENGTH,
                    Identifier.of(VaranDeco.MOD_ID, "grounded"),-0.2, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.STEP_HEIGHT,
                            Identifier.of(VaranDeco.MOD_ID, "grounded"),-0.2, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect){
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(VaranDeco.MOD_ID, name), statusEffect);
    }

    public static void registerStatusEffects() {
        VaranDeco.LOGGER.info("Registering Status Effect for " + VaranDeco.MOD_ID);
    }
}
