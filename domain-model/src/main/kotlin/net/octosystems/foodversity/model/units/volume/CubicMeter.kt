package net.octosystems.foodversity.model.units.volume

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.units.UnitSymbol
import java.lang.IllegalStateException

@JvmInline
value class CubicMeter(val value: NumericDouble) : VolumeUnit, Numeric by value {

    override fun toCubicMeter(): CubicMeter = CubicMeter(value)
    override fun toLiter(): Liter = Liter.of(this)
    override fun toMilliLiter(): MilliLiter = MilliLiter.of(this)
    override fun toTeaSpoon(): TeaSpoon = TeaSpoon.of(this)
    override fun toTableSpoon(): TableSpoon = TableSpoon.of(this)

    override fun getSymbol(): UnitSymbol = UnitSymbol.of("m³")

    companion object {
        fun of(value: Number) = CubicMeter(NumericDouble(value.toDouble()))
        fun of(value: VolumeUnit): CubicMeter = when(value) {
            is CubicMeter -> value
            is Liter -> CubicMeter(NumericDouble(value * 0.001))
            is MilliLiter -> CubicMeter(NumericDouble(value * 0.000001))
            is TeaSpoon -> CubicMeter(NumericDouble(value * 0.0000049289))
            is TableSpoon -> CubicMeter(NumericDouble(value * 0.0000147868))
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
