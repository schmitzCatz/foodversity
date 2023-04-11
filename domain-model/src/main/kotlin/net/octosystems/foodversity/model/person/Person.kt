package net.octosystems.foodversity.model.person

import net.octosystems.foodversity.model.common.string.Name
import net.octosystems.foodversity.model.nutrition.Allergen
import net.octosystems.foodversity.model.grocery.Food

data class Person(
    val name: Name,
    val likes: List<Food>,
    val dislikes: List<Food>,
    val allergies: List<Allergen>,
    val details: Details,
)
