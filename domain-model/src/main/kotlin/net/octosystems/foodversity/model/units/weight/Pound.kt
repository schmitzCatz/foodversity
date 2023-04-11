package net.octosystems.foodversity.model.units.weight

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.units.UnitSymbol

@JvmInline
value class Pound(val value: NumericDouble) : WeightUnit, Numeric by value {

    override fun getSymbol(): UnitSymbol = UnitSymbol.of("lbs")

    override fun toGram(): Gram = Gram.of(this)
    override fun toKilogram(): Kilogram = Kilogram.of(this)
    override fun toMilligram(): Milligram = Milligram.of(this)
    override fun toPound(): Pound = Pound(value)

    companion object {
        fun of(value: Number) = Pound(NumericDouble(value.toDouble()))
        fun of(value: Gram) = Pound(NumericDouble(value / 453.59237))
        fun of(value: Kilogram) = Pound(NumericDouble(value * 2.2046))
        fun of(value: Milligram) = Pound(NumericDouble(value * 0.000002205))
    }
}
