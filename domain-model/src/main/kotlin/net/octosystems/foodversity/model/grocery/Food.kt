package net.octosystems.foodversity.model.grocery

import net.octosystems.foodversity.model.common.string.Name
import net.octosystems.foodversity.model.meal.nutrition.Allergen
import net.octosystems.foodversity.model.meal.nutrition.Nutrient

data class Food(
    val name: Name,
    val nutrients: List<Nutrient> = emptyList(),
    val allergenes: List<Allergen> = emptyList(),
) : Buyable
