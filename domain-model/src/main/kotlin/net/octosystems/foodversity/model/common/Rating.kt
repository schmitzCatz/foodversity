package net.octosystems.foodversity.model.common

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble

@JvmInline
value class Rating(val value: NumericDouble): Numeric by value{
    init {
        require(value >= 0) {
            "$value is lower than zero"
        }
        require(value <= 5) {
            "$value is greater than five"
        }
    }

    companion object {
        fun of(value: Double) = Rating(NumericDouble(value))
        fun of(value: Int) = Rating(NumericDouble(value.toDouble()))
    }
}