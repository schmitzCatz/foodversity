package net.octosystems.foodversity.model.common.units.weight

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.common.units.UnitSymbol

@JvmInline
value class Gram(val value: NumericDouble) : net.octosystems.foodversity.model.common.units.weight.WeightUnit, Numeric by value {

    override fun toGram(): net.octosystems.foodversity.model.common.units.weight.Gram =
        net.octosystems.foodversity.model.common.units.weight.Gram(value)
    override fun toKilogram(): net.octosystems.foodversity.model.common.units.weight.Kilogram =
        net.octosystems.foodversity.model.common.units.weight.Kilogram.Companion.of(this)
    override fun toMilligram(): net.octosystems.foodversity.model.common.units.weight.Milligram =
        net.octosystems.foodversity.model.common.units.weight.Milligram.Companion.of(this)
    override fun toPound(): net.octosystems.foodversity.model.common.units.weight.Pound =
        net.octosystems.foodversity.model.common.units.weight.Pound.Companion.of(this)

    override fun getSymbol(): net.octosystems.foodversity.model.common.units.UnitSymbol = net.octosystems.foodversity.model.common.units.UnitSymbol.of("g")

    companion object {
        fun of(value: Number) =
            net.octosystems.foodversity.model.common.units.weight.Gram(NumericDouble(value.toDouble()))
        fun of(value: net.octosystems.foodversity.model.common.units.weight.Pound) =
            net.octosystems.foodversity.model.common.units.weight.Gram(NumericDouble(value * 453.59237))
        fun of(value: net.octosystems.foodversity.model.common.units.weight.Kilogram) =
            net.octosystems.foodversity.model.common.units.weight.Gram(NumericDouble(value * 1_000))
        fun of(value: net.octosystems.foodversity.model.common.units.weight.Milligram) =
            net.octosystems.foodversity.model.common.units.weight.Gram(NumericDouble(value / 1_000))
    }
}
