package net.octosystems.foodversity.model.user.person

import net.octosystems.foodversity.model.common.string.Name
import net.octosystems.foodversity.model.meal.nutrition.Allergen
import net.octosystems.foodversity.model.grocery.Food

data class Person(
    val name: Name,
    val likes: List<Food>,
    val dislikes: List<Food>,
    val allergies: List<Allergen>,
    val details: Details,
)
