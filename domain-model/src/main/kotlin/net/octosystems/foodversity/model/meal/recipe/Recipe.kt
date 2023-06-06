package net.octosystems.foodversity.model.meal.recipe

import net.octosystems.foodversity.model.common.string.Name
import net.octosystems.foodversity.model.common.Rating
import net.octosystems.foodversity.model.user.User
import java.net.URI

data class Recipe(
    val name: Name,
    val description: Description,
    val creator: User,
    val rating: Rating,
    val image: URI,
    val preparation: Preparation,
)
