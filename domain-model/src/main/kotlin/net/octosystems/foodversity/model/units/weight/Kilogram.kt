package net.octosystems.foodversity.model.units.weight

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.units.UnitSymbol

@JvmInline
value class Kilogram(private val value: NumericDouble) : WeightUnit, Numeric by value {

    override fun toGram(): Gram = Gram.of(this)
    override fun toMilligram(): Milligram = Milligram.of(this)
    override fun toPound(): Pound = Pound.of(this)
    override fun toKilogram(): Kilogram = Kilogram(value)

    override fun getSymbol(): UnitSymbol = UnitSymbol.of("kg")

    companion object {
        fun of(value: Number) = Kilogram(NumericDouble(value.toDouble()))
        fun of(value: Pound) = Kilogram(NumericDouble(NumericDouble.of(value.getValue()) * .45))
        fun of(value: Gram) = Kilogram(NumericDouble(value / 1_000))
        fun of(value: Milligram) = Kilogram(NumericDouble(value / 1_000_000))
    }
}
