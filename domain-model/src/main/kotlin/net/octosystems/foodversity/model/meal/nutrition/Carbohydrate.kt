package net.octosystems.foodversity.model.meal.nutrition

import net.octosystems.foodversity.model.common.string.Name
import net.octosystems.foodversity.model.common.units.weight.WeightUnit

abstract class Carbohydrate(open val name: Name?, open val amount: net.octosystems.foodversity.model.common.units.weight.WeightUnit) : Nutrient