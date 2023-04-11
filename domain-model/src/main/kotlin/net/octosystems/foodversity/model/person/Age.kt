package net.octosystems.foodversity.model.person

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericInt

@JvmInline
value class Age(val value: NumericInt) : Numeric by value {
    init {
        require(value > 0) {
            "'$value' should be greater than zero!"
        }
        require(value < 150) {
            "'$value' should be less then 150!"
        }
    }

    companion object {
        fun of(value: Number) = Age(NumericInt(value.toInt()))
    }
}
