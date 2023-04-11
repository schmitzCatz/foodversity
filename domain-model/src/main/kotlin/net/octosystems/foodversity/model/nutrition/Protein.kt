package net.octosystems.foodversity.model.nutrition

import net.octosystems.foodversity.model.common.string.Name
import net.octosystems.foodversity.model.units.energy.KiloCalorie
import net.octosystems.foodversity.model.units.weight.WeightUnit

data class Protein(val name: Name?, val amount: WeightUnit) : Nutrient {
    private val energy: KiloCalorie
        get() = KiloCalorie.of((amount.toGram() * 4).toDouble())
}
