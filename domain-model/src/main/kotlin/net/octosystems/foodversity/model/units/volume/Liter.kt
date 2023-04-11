package net.octosystems.foodversity.model.units.volume

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.units.UnitSymbol
import java.lang.IllegalStateException

@JvmInline
value class Liter(val value: NumericDouble) : VolumeUnit, Numeric by value {

    override fun toLiter(): Liter = Liter(value)
    override fun toCubicMeter(): CubicMeter = CubicMeter.of(this)
    override fun toMilliLiter(): MilliLiter = MilliLiter.of(this)
    override fun toTeaSpoon(): TeaSpoon = TeaSpoon.of(this)
    override fun toTableSpoon(): TableSpoon = TableSpoon.of(this)

    override fun getSymbol(): UnitSymbol = UnitSymbol.of("L")

    companion object {
        fun of(value: Number) = Liter(NumericDouble(value.toDouble()))
        fun of(value: VolumeUnit): Liter = when (value) {
            is Liter -> value
            is CubicMeter -> Liter(NumericDouble(value * 1000))
            is MilliLiter -> Liter(NumericDouble(value * 0.001))
            is TeaSpoon -> Liter(NumericDouble(value * 0.00492892))
            is TableSpoon -> Liter(NumericDouble(value * 0.015))
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
