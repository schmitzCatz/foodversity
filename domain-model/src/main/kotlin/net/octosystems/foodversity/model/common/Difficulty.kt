package net.octosystems.foodversity.model.common

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericInt

@JvmInline
value class Difficulty(val value: NumericInt) : Numeric by value {

    init {
        require(value > 0) {
            "'$value' should be above zero"
        }
        require(value <= 10) {
            "'$value' should be less or equal 10"
        }
    }

    companion object {
        fun of(value: Int) = Difficulty(NumericInt(value))
    }
}
