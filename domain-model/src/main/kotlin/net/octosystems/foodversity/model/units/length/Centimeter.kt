package net.octosystems.foodversity.model.units.length

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.units.UnitSymbol

@JvmInline
value class Centimeter(private val value: NumericDouble) : LengthUnit, Numeric by value {

    override fun toMeter(): Meter = Meter.of(this)
    override fun toCentimeter(): Centimeter = Centimeter(value)
    override fun toInch(): Inch = Inch.of(this)

    override fun getSymbol(): UnitSymbol = UnitSymbol.of("cm")

    companion object {
        fun of(value: Number) = Centimeter(NumericDouble(value.toDouble()))
        fun of(value: Meter) = Centimeter(NumericDouble(value * 100))
        fun of(value: Inch) = Centimeter(NumericDouble(value * 2.54))
    }
}
