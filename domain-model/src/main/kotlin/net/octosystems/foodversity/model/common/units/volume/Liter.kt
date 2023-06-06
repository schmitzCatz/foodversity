package net.octosystems.foodversity.model.common.units.volume

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.common.units.UnitSymbol
import java.lang.IllegalStateException

@JvmInline
value class Liter(val value: NumericDouble) : net.octosystems.foodversity.model.common.units.volume.VolumeUnit, Numeric by value {

    override fun toLiter(): net.octosystems.foodversity.model.common.units.volume.Liter =
        net.octosystems.foodversity.model.common.units.volume.Liter(value)
    override fun toCubicMeter(): net.octosystems.foodversity.model.common.units.volume.CubicMeter =
        net.octosystems.foodversity.model.common.units.volume.CubicMeter.Companion.of(this)
    override fun toMilliLiter(): net.octosystems.foodversity.model.common.units.volume.MilliLiter =
        net.octosystems.foodversity.model.common.units.volume.MilliLiter.Companion.of(this)
    override fun toTeaSpoon(): net.octosystems.foodversity.model.common.units.volume.TeaSpoon =
        net.octosystems.foodversity.model.common.units.volume.TeaSpoon.Companion.of(this)
    override fun toTableSpoon(): net.octosystems.foodversity.model.common.units.volume.TableSpoon =
        net.octosystems.foodversity.model.common.units.volume.TableSpoon.Companion.of(this)

    override fun getSymbol(): net.octosystems.foodversity.model.common.units.UnitSymbol = net.octosystems.foodversity.model.common.units.UnitSymbol.of("L")

    companion object {
        fun of(value: Number) =
            net.octosystems.foodversity.model.common.units.volume.Liter(NumericDouble(value.toDouble()))
        fun of(value: net.octosystems.foodversity.model.common.units.volume.VolumeUnit): net.octosystems.foodversity.model.common.units.volume.Liter = when (value) {
            is net.octosystems.foodversity.model.common.units.volume.Liter -> value
            is net.octosystems.foodversity.model.common.units.volume.CubicMeter -> net.octosystems.foodversity.model.common.units.volume.Liter(
                NumericDouble(value * 1000)
            )
            is net.octosystems.foodversity.model.common.units.volume.MilliLiter -> net.octosystems.foodversity.model.common.units.volume.Liter(
                NumericDouble(value * 0.001)
            )
            is net.octosystems.foodversity.model.common.units.volume.TeaSpoon -> net.octosystems.foodversity.model.common.units.volume.Liter(
                NumericDouble(value * 0.00492892)
            )
            is net.octosystems.foodversity.model.common.units.volume.TableSpoon -> net.octosystems.foodversity.model.common.units.volume.Liter(
                NumericDouble(value * 0.015)
            )
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
