package net.octosystems.foodversity.model.units.weight

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.units.UnitSymbol

@JvmInline
value class Gram(val value: NumericDouble) : WeightUnit, Numeric by value {

    override fun toGram(): Gram = Gram(value)
    override fun toKilogram(): Kilogram = Kilogram.of(this)
    override fun toMilligram(): Milligram = Milligram.of(this)
    override fun toPound(): Pound = Pound.of(this)

    override fun getSymbol(): UnitSymbol = UnitSymbol.of("g")

    companion object {
        fun of(value: Number) = Gram(NumericDouble(value.toDouble()))
        fun of(value: Pound) = Gram(NumericDouble(value * 453.59237))
        fun of(value: Kilogram) = Gram(NumericDouble(value * 1_000))
        fun of(value: Milligram) = Gram(NumericDouble(value / 1_000))
    }
}
