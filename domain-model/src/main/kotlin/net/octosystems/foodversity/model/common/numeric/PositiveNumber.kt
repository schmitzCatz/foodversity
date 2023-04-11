package net.octosystems.foodversity.model.common.numeric

@JvmInline
value class PositiveNumber(val value: Numeric) : Numeric by value {
    init {
        require(value >= 0) {
            "'$value' should be positive or 0"
        }
    }

    companion object {
        fun of(value: Number) = PositiveNumber(Numeric.of(value))
    }
}
