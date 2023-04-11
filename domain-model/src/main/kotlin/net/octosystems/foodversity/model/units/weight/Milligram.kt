package net.octosystems.foodversity.model.units.weight

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.units.UnitSymbol

@JvmInline
value class Milligram(val value: NumericDouble) : WeightUnit, Numeric by value {

    override fun toGram(): Gram = Gram.of(this)
    override fun toMilligram(): Milligram = Milligram(value)
    override fun toKilogram(): Kilogram = Kilogram.of(this)
    override fun toPound(): Pound = Pound.of(this)

    override fun getSymbol(): UnitSymbol = UnitSymbol.of("mg")

    companion object {
        fun of(value: Number) = Milligram(NumericDouble(value.toDouble()))
        fun of(value: Pound) = Milligram(NumericDouble(value * 453_592.37))
        fun of(value: Gram) = Milligram(NumericDouble(value * 1_000))
        fun of(value: Kilogram) = Milligram(NumericDouble(value * 1_000_000))
    }
}
