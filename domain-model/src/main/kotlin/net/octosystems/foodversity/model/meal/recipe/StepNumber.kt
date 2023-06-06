package net.octosystems.foodversity.model.meal.recipe

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericInt

@JvmInline
value class StepNumber(val value: NumericInt) : Numeric by value {
    init {
        require(value > 0) {
            "'$value' should be more than zero"
        }
    }
}
