package net.gecko.varandeco.potion;

import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.effects.DecoStatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class DecoPotion {

    public static final RegistryEntry<Potion> WATER_BUBBLE_POTION = registerPotion("bubble_potion",
            new Potion("water_bubble",new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 1800, 0),
                    new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1800, 0)));

    public static final RegistryEntry<Potion> STRONG_WATER_BUBBLE_POTION = registerPotion("strong_bubble_potion",
            new Potion("water_bubble",new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 900, 0),
                    new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 900, 0)));

    public static final RegistryEntry<Potion> LONG_WATER_BUBBLE_POTION  = registerPotion("long_bubble_potion",
            new Potion("water_bubble",new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 4800, 0),
                    new StatusEffectInstance(StatusEffects.WATER_BREATHING, 4800, 0)));

    public static final RegistryEntry<Potion> GROUNDING_POTION = registerPotion("grounding_potion",
            new Potion("grounded",new StatusEffectInstance(DecoStatusEffects.GROUNDED, 1800, 0)));

    public static final RegistryEntry<Potion> LONG_GROUNDING_POTION = registerPotion("long_grounding_potion",
            new Potion("grounded",new StatusEffectInstance(DecoStatusEffects.GROUNDED, 4800, 0)));

    public static final RegistryEntry<Potion> STRONG_GROUNDING_POTION = registerPotion("strong_grounding_potion",
            new Potion("grounded",new StatusEffectInstance(DecoStatusEffects.GROUNDED, 400, 3)));


    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(VaranDeco.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        VaranDeco.LOGGER.info("Registering Mod Potions for " + VaranDeco.MOD_ID);
    }
}

