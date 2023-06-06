package net.octosystems.foodversity.model.common.units.body

import net.octosystems.foodversity.model.common.units.energy.KiloCalorie

data class TotalDailyEnergyExpenditure(
    val bmr: net.octosystems.foodversity.model.common.units.body.BasalMetabolicRate,
    val amr: net.octosystems.foodversity.model.common.units.body.ActiveMetabolicRate,
) {
    val value: net.octosystems.foodversity.model.common.units.energy.KiloCalorie
        get() = net.octosystems.foodversity.model.common.units.energy.KiloCalorie.of((bmr.value + amr.value).getValue())
}
