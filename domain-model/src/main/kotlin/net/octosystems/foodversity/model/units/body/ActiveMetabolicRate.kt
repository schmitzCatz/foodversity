package net.octosystems.foodversity.model.units.body

import net.octosystems.foodversity.model.units.energy.KiloCalorie

data class ActiveMetabolicRate(
    val bmr: BasalMetabolicRate,
    val pal: ActivityLevel,
) {
    val value: KiloCalorie
        get() = KiloCalorie.of((bmr.value * (pal.value - 1)).getValue())
}
