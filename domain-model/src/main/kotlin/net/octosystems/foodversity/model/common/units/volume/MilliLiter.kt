package net.octosystems.foodversity.model.common.units.volume

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.common.units.UnitSymbol
import java.lang.IllegalStateException

@JvmInline
value class MilliLiter(val value: NumericDouble) : net.octosystems.foodversity.model.common.units.volume.VolumeUnit, Numeric by value {

    override fun toCubicMeter(): net.octosystems.foodversity.model.common.units.volume.CubicMeter =
        net.octosystems.foodversity.model.common.units.volume.CubicMeter.Companion.of(this)
    override fun toLiter(): net.octosystems.foodversity.model.common.units.volume.Liter =
        net.octosystems.foodversity.model.common.units.volume.Liter.Companion.of(this)
    override fun toMilliLiter(): net.octosystems.foodversity.model.common.units.volume.MilliLiter =
        net.octosystems.foodversity.model.common.units.volume.MilliLiter(value)
    override fun toTeaSpoon(): net.octosystems.foodversity.model.common.units.volume.TeaSpoon =
        net.octosystems.foodversity.model.common.units.volume.TeaSpoon.Companion.of(this)
    override fun toTableSpoon(): net.octosystems.foodversity.model.common.units.volume.TableSpoon =
        net.octosystems.foodversity.model.common.units.volume.TableSpoon.Companion.of(this)

    override fun getSymbol(): net.octosystems.foodversity.model.common.units.UnitSymbol = net.octosystems.foodversity.model.common.units.UnitSymbol.of("ml")

    companion object {
        fun of(value: Number) =
            net.octosystems.foodversity.model.common.units.volume.MilliLiter(NumericDouble(value.toDouble()))
        fun of(value: net.octosystems.foodversity.model.common.units.volume.VolumeUnit): net.octosystems.foodversity.model.common.units.volume.MilliLiter = when (value) {
            is net.octosystems.foodversity.model.common.units.volume.CubicMeter -> net.octosystems.foodversity.model.common.units.volume.MilliLiter(
                NumericDouble(value * 1_000_000)
            )
            is net.octosystems.foodversity.model.common.units.volume.Liter -> net.octosystems.foodversity.model.common.units.volume.MilliLiter(
                NumericDouble(value * 1_000)
            )
            is net.octosystems.foodversity.model.common.units.volume.MilliLiter -> value
            is net.octosystems.foodversity.model.common.units.volume.TeaSpoon -> net.octosystems.foodversity.model.common.units.volume.MilliLiter(
                NumericDouble(value * 5)
            )
            is net.octosystems.foodversity.model.common.units.volume.TableSpoon -> net.octosystems.foodversity.model.common.units.volume.MilliLiter(
                NumericDouble(value * 15)
            )
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
