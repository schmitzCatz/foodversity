package net.octosystems.foodversity.model.units.volume

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.units.UnitSymbol
import java.lang.IllegalStateException

@JvmInline
value class MilliLiter(val value: NumericDouble) : VolumeUnit, Numeric by value {

    override fun toCubicMeter(): CubicMeter = CubicMeter.of(this)
    override fun toLiter(): Liter = Liter.of(this)
    override fun toMilliLiter(): MilliLiter = MilliLiter(value)
    override fun toTeaSpoon(): TeaSpoon = TeaSpoon.of(this)
    override fun toTableSpoon(): TableSpoon = TableSpoon.of(this)

    override fun getSymbol(): UnitSymbol = UnitSymbol.of("ml")

    companion object {
        fun of(value: Number) = MilliLiter(NumericDouble(value.toDouble()))
        fun of(value: VolumeUnit): MilliLiter = when (value) {
            is CubicMeter -> MilliLiter(NumericDouble(value * 1_000_000))
            is Liter -> MilliLiter(NumericDouble(value * 1_000))
            is MilliLiter -> value
            is TeaSpoon -> MilliLiter(NumericDouble(value * 5))
            is TableSpoon -> MilliLiter(NumericDouble(value * 15))
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
