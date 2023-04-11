package net.octosystems.foodversity.model.grocery

import net.octosystems.foodversity.model.common.string.Name
import net.octosystems.foodversity.model.nutrition.Allergen
import net.octosystems.foodversity.model.nutrition.Nutrient

data class Food(
    val name: Name,
    val nutrients: List<Nutrient> = emptyList(),
    val allergenes: List<Allergen> = emptyList(),
) : Buyable
