package net.octosystems.foodversity.model.meal.nutrition

import net.octosystems.foodversity.model.common.string.Name
import net.octosystems.foodversity.model.common.units.weight.WeightUnit

data class Vitamin(val name: Name?, val amount: net.octosystems.foodversity.model.common.units.weight.WeightUnit) : Nutrient