package net.octosystems.foodversity.model.units.body

import net.octosystems.foodversity.model.units.energy.KiloCalorie

data class TotalDailyEnergyExpenditure(
    val bmr: BasalMetabolicRate,
    val amr: ActiveMetabolicRate,
) {
    val value: KiloCalorie
        get() = KiloCalorie.of((bmr.value + amr.value).getValue())
}
