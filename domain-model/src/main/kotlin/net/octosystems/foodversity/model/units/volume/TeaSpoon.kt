package net.octosystems.foodversity.model.units.volume

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.units.UnitSymbol
import java.lang.IllegalStateException

@JvmInline
value class TeaSpoon(val value: NumericDouble) : VolumeUnit, Numeric by value {

    override fun toCubicMeter(): CubicMeter = CubicMeter.of(this)
    override fun toLiter(): Liter = Liter.of(this)
    override fun toMilliLiter(): MilliLiter = MilliLiter.of(this)
    override fun toTeaSpoon(): TeaSpoon = TeaSpoon(value)
    override fun toTableSpoon(): TableSpoon = TableSpoon.of(this)

    override fun getSymbol(): UnitSymbol = UnitSymbol.of("tbsp")

    companion object {
        fun of(value: Number) = TeaSpoon(NumericDouble(value.toDouble()))
        fun of(value: VolumeUnit): TeaSpoon = when (value) {
            is CubicMeter -> TeaSpoon(NumericDouble(value * 202884.1))
            is Liter -> TeaSpoon(NumericDouble(value * 202.88))
            is MilliLiter -> TeaSpoon(NumericDouble(value * 0.202884))
            is TeaSpoon -> value
            is TableSpoon -> TeaSpoon(NumericDouble(value * 3.0433))
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
