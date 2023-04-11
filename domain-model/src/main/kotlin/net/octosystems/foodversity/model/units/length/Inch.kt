package net.octosystems.foodversity.model.units.length

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.units.UnitSymbol

@JvmInline
value class Inch(private val value: NumericDouble) : LengthUnit, Numeric by value {

    override fun getSymbol(): UnitSymbol = UnitSymbol.of("in")

    override fun toMeter(): Meter = Meter.of(this)
    override fun toCentimeter(): Centimeter = Centimeter.of(this)
    override fun toInch(): Inch = Inch(value)

    companion object {
        fun of(value: Number) = Inch(NumericDouble.of(value))
        fun of(value: Centimeter) = Inch(NumericDouble(value * 0.393701))
        fun of(value: Meter) = Inch(NumericDouble(value * 39.3701))
    }
}
