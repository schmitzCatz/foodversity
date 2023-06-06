package net.octosystems.foodversity.model.meal.recipe

import net.octosystems.foodversity.model.common.Difficulty
import java.time.Instant

data class Preparation(
    val time: Instant,
    val difficulty: Difficulty,
    val steps: List<PreparationStep>,
)
