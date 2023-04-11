package net.octosystems.foodversity.model.nutrition

import net.octosystems.foodversity.model.common.string.Name
import net.octosystems.foodversity.model.units.weight.WeightUnit

data class Fiber(val name: Name?, val amount: WeightUnit) : Nutrient