package net.octosystems.foodversity.model.units.length

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.units.UnitSymbol

@JvmInline
value class Meter(private val value: NumericDouble) : LengthUnit, Numeric by value {

    override fun toMeter(): Meter = Meter(value)
    override fun toCentimeter(): Centimeter = Centimeter.of(this)
    override fun toInch(): Inch = Inch.of(this)

    override fun getSymbol(): UnitSymbol = UnitSymbol.of("m")

    companion object {
        fun of(value: Number) = Meter(NumericDouble.of(value))
        fun of(value: Centimeter) = Meter(NumericDouble(value * 0.01))
        fun of(value: Inch) = Meter(NumericDouble(value * 0.0254))
    }
}
