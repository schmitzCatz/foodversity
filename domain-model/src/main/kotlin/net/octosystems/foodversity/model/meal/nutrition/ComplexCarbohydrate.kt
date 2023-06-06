package net.octosystems.foodversity.model.meal.nutrition

import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.common.string.Name
import net.octosystems.foodversity.model.common.units.energy.KiloCalorie
import net.octosystems.foodversity.model.common.units.weight.WeightUnit

data class ComplexCarbohydrate(override val name: Name?, override val amount: net.octosystems.foodversity.model.common.units.weight.WeightUnit) : Carbohydrate(name, amount) {
    private val energy: net.octosystems.foodversity.model.common.units.energy.KiloCalorie
        get() = net.octosystems.foodversity.model.common.units.energy.KiloCalorie.of((amount.toGram() * 4.12).toDouble())
}