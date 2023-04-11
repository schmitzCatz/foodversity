package net.octosystems.foodversity.model.nutrition

import net.octosystems.foodversity.model.common.string.Name
import net.octosystems.foodversity.model.units.energy.KiloCalorie
import net.octosystems.foodversity.model.units.weight.WeightUnit

data class SimpleCarbohydrate(override val name: Name?, override val amount: WeightUnit) : Carbohydrate(name, amount) {
    private val energy: KiloCalorie
        get() = KiloCalorie.of((amount.toGram() * 3.87).toDouble())
}
