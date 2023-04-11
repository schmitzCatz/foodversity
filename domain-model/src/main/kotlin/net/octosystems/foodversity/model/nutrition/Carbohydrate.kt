package net.octosystems.foodversity.model.nutrition

import net.octosystems.foodversity.model.common.string.Name
import net.octosystems.foodversity.model.units.weight.WeightUnit

abstract class Carbohydrate(open val name: Name?, open val amount: WeightUnit) : Nutrient