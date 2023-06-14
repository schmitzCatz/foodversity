package net.octosystems.foodversity.model.meal

import net.octosystems.foodversity.model.user.person.Person
import net.octosystems.foodversity.model.meal.recipe.Recipe
import java.time.Instant

data class Meal(
    val date: Instant,
    val recipe: Recipe?,
    val cook: Person,
    val participants: List<Person>,
)
