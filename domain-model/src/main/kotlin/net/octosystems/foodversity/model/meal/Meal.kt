package net.octosystems.foodversity.model.meal

import net.octosystems.foodversity.model.person.Person
import net.octosystems.foodversity.model.recipe.Recipe
import java.time.Instant

data class Meal(
    val data: Instant,
    val recipe: Recipe?,
    val cook: Person,
    val participants: List<Person>,
)
