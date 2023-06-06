package net.octosystems.foodversity.model.meal.nutrition

import net.octosystems.foodversity.model.common.string.Name
import net.octosystems.foodversity.model.common.units.weight.WeightUnit

data class Mineral(val name: Name?, val amount: net.octosystems.foodversity.model.common.units.weight.WeightUnit) : Nutrient