package net.octosystems.foodversity.model.common.units.body

import net.octosystems.foodversity.model.common.units.energy.KiloCalorie

data class ActiveMetabolicRate(
    val bmr: net.octosystems.foodversity.model.common.units.body.BasalMetabolicRate,
    val pal: net.octosystems.foodversity.model.common.units.body.ActivityLevel,
) {
    val value: net.octosystems.foodversity.model.common.units.energy.KiloCalorie
        get() = net.octosystems.foodversity.model.common.units.energy.KiloCalorie.of((bmr.value * (pal.value - 1)).getValue())
}
