package net.octosystems.foodversity.model.nutrition

import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.common.string.Name
import net.octosystems.foodversity.model.units.energy.KiloCalorie
import net.octosystems.foodversity.model.units.weight.WeightUnit

data class ComplexCarbohydrate(override val name: Name?, override val amount: WeightUnit) : Carbohydrate(name, amount) {
    private val energy: KiloCalorie
        get() = KiloCalorie.of((amount.toGram() * 4.12).toDouble())
}