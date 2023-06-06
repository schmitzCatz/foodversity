package net.octosystems.foodversity.model.common.units.length

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.common.units.UnitSymbol

@JvmInline
value class Inch(private val value: NumericDouble) : net.octosystems.foodversity.model.common.units.length.LengthUnit, Numeric by value {

    override fun getSymbol(): net.octosystems.foodversity.model.common.units.UnitSymbol = net.octosystems.foodversity.model.common.units.UnitSymbol.of("in")

    override fun toMeter(): net.octosystems.foodversity.model.common.units.length.Meter =
        net.octosystems.foodversity.model.common.units.length.Meter.Companion.of(this)
    override fun toCentimeter(): net.octosystems.foodversity.model.common.units.length.Centimeter =
        net.octosystems.foodversity.model.common.units.length.Centimeter.Companion.of(this)
    override fun toInch(): net.octosystems.foodversity.model.common.units.length.Inch =
        net.octosystems.foodversity.model.common.units.length.Inch(value)

    companion object {
        fun of(value: Number) = net.octosystems.foodversity.model.common.units.length.Inch(NumericDouble.of(value))
        fun of(value: net.octosystems.foodversity.model.common.units.length.Centimeter) =
            net.octosystems.foodversity.model.common.units.length.Inch(NumericDouble(value * 0.393701))
        fun of(value: net.octosystems.foodversity.model.common.units.length.Meter) =
            net.octosystems.foodversity.model.common.units.length.Inch(NumericDouble(value * 39.3701))
    }
}
