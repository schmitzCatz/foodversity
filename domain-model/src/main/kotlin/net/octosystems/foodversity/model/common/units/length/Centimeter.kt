package net.octosystems.foodversity.model.common.units.length

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.common.units.UnitSymbol

@JvmInline
value class Centimeter(private val value: NumericDouble) : net.octosystems.foodversity.model.common.units.length.LengthUnit, Numeric by value {

    override fun toMeter(): net.octosystems.foodversity.model.common.units.length.Meter =
        net.octosystems.foodversity.model.common.units.length.Meter.Companion.of(this)
    override fun toCentimeter(): net.octosystems.foodversity.model.common.units.length.Centimeter =
        net.octosystems.foodversity.model.common.units.length.Centimeter(value)
    override fun toInch(): net.octosystems.foodversity.model.common.units.length.Inch =
        net.octosystems.foodversity.model.common.units.length.Inch.Companion.of(this)

    override fun getSymbol(): net.octosystems.foodversity.model.common.units.UnitSymbol = net.octosystems.foodversity.model.common.units.UnitSymbol.of("cm")

    companion object {
        fun of(value: Number) =
            net.octosystems.foodversity.model.common.units.length.Centimeter(NumericDouble(value.toDouble()))
        fun of(value: net.octosystems.foodversity.model.common.units.length.Meter) =
            net.octosystems.foodversity.model.common.units.length.Centimeter(NumericDouble(value * 100))
        fun of(value: net.octosystems.foodversity.model.common.units.length.Inch) =
            net.octosystems.foodversity.model.common.units.length.Centimeter(NumericDouble(value * 2.54))
    }
}
