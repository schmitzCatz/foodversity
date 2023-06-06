package net.octosystems.foodversity.model.common.units.volume

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.common.units.UnitSymbol
import java.lang.IllegalStateException

@JvmInline
value class TableSpoon(val value: NumericDouble) : net.octosystems.foodversity.model.common.units.volume.VolumeUnit, Numeric by value {

    override fun toCubicMeter(): net.octosystems.foodversity.model.common.units.volume.CubicMeter = toMilliLiter().toCubicMeter()
    override fun toLiter(): net.octosystems.foodversity.model.common.units.volume.Liter = toMilliLiter().toLiter()
    override fun toMilliLiter(): net.octosystems.foodversity.model.common.units.volume.MilliLiter =
        net.octosystems.foodversity.model.common.units.volume.MilliLiter.Companion.of(this)
    override fun toTeaSpoon(): net.octosystems.foodversity.model.common.units.volume.TeaSpoon =
        net.octosystems.foodversity.model.common.units.volume.TeaSpoon.Companion.of(this)
    override fun toTableSpoon(): net.octosystems.foodversity.model.common.units.volume.TableSpoon =
        net.octosystems.foodversity.model.common.units.volume.TableSpoon(value)

    override fun getSymbol(): net.octosystems.foodversity.model.common.units.UnitSymbol = net.octosystems.foodversity.model.common.units.UnitSymbol.of("tsp")

    companion object {
        fun of(value: Number) =
            net.octosystems.foodversity.model.common.units.volume.TableSpoon(NumericDouble(value.toDouble()))
        fun of(value: net.octosystems.foodversity.model.common.units.volume.VolumeUnit): net.octosystems.foodversity.model.common.units.volume.TableSpoon = when (value) {
            is net.octosystems.foodversity.model.common.units.volume.CubicMeter -> net.octosystems.foodversity.model.common.units.volume.TableSpoon(
                NumericDouble(value * 67628.03)
            )
            is net.octosystems.foodversity.model.common.units.volume.Liter -> net.octosystems.foodversity.model.common.units.volume.TableSpoon(
                NumericDouble(value * 67.628)
            )
            is net.octosystems.foodversity.model.common.units.volume.MilliLiter -> net.octosystems.foodversity.model.common.units.volume.TableSpoon(
                NumericDouble(value * 0.067628)
            )
            is net.octosystems.foodversity.model.common.units.volume.TeaSpoon -> net.octosystems.foodversity.model.common.units.volume.TableSpoon(
                NumericDouble(value * 0.333333)
            )
            is net.octosystems.foodversity.model.common.units.volume.TableSpoon -> value
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
