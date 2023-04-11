package net.octosystems.foodversity.model.units.volume

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.units.UnitSymbol
import java.lang.IllegalStateException

@JvmInline
value class TableSpoon(val value: NumericDouble) : VolumeUnit, Numeric by value {

    override fun toCubicMeter(): CubicMeter = toMilliLiter().toCubicMeter()
    override fun toLiter(): Liter = toMilliLiter().toLiter()
    override fun toMilliLiter(): MilliLiter = MilliLiter.of(this)
    override fun toTeaSpoon(): TeaSpoon = TeaSpoon.of(this)
    override fun toTableSpoon(): TableSpoon = TableSpoon(value)

    override fun getSymbol(): UnitSymbol = UnitSymbol.of("tsp")

    companion object {
        fun of(value: Number) = TableSpoon(NumericDouble(value.toDouble()))
        fun of(value: VolumeUnit): TableSpoon = when (value) {
            is CubicMeter -> TableSpoon(NumericDouble(value * 67628.03))
            is Liter -> TableSpoon(NumericDouble(value * 67.628))
            is MilliLiter -> TableSpoon(NumericDouble(value * 0.067628))
            is TeaSpoon -> TableSpoon(NumericDouble(value * 0.333333))
            is TableSpoon -> value
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
