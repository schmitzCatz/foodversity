package net.octosystems.foodversity.model.common.units.volume

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.common.units.UnitSymbol
import java.lang.IllegalStateException

@JvmInline
value class TeaSpoon(val value: NumericDouble) : net.octosystems.foodversity.model.common.units.volume.VolumeUnit, Numeric by value {

    override fun toCubicMeter(): net.octosystems.foodversity.model.common.units.volume.CubicMeter =
        net.octosystems.foodversity.model.common.units.volume.CubicMeter.Companion.of(this)
    override fun toLiter(): net.octosystems.foodversity.model.common.units.volume.Liter =
        net.octosystems.foodversity.model.common.units.volume.Liter.Companion.of(this)
    override fun toMilliLiter(): net.octosystems.foodversity.model.common.units.volume.MilliLiter =
        net.octosystems.foodversity.model.common.units.volume.MilliLiter.Companion.of(this)
    override fun toTeaSpoon(): net.octosystems.foodversity.model.common.units.volume.TeaSpoon =
        net.octosystems.foodversity.model.common.units.volume.TeaSpoon(value)
    override fun toTableSpoon(): net.octosystems.foodversity.model.common.units.volume.TableSpoon =
        net.octosystems.foodversity.model.common.units.volume.TableSpoon.Companion.of(this)

    override fun getSymbol(): net.octosystems.foodversity.model.common.units.UnitSymbol = net.octosystems.foodversity.model.common.units.UnitSymbol.of("tbsp")

    companion object {
        fun of(value: Number) =
            net.octosystems.foodversity.model.common.units.volume.TeaSpoon(NumericDouble(value.toDouble()))
        fun of(value: net.octosystems.foodversity.model.common.units.volume.VolumeUnit): net.octosystems.foodversity.model.common.units.volume.TeaSpoon = when (value) {
            is net.octosystems.foodversity.model.common.units.volume.CubicMeter -> net.octosystems.foodversity.model.common.units.volume.TeaSpoon(
                NumericDouble(value * 202884.1)
            )
            is net.octosystems.foodversity.model.common.units.volume.Liter -> net.octosystems.foodversity.model.common.units.volume.TeaSpoon(
                NumericDouble(value * 202.88)
            )
            is net.octosystems.foodversity.model.common.units.volume.MilliLiter -> net.octosystems.foodversity.model.common.units.volume.TeaSpoon(
                NumericDouble(value * 0.202884)
            )
            is net.octosystems.foodversity.model.common.units.volume.TeaSpoon -> value
            is net.octosystems.foodversity.model.common.units.volume.TableSpoon -> net.octosystems.foodversity.model.common.units.volume.TeaSpoon(
                NumericDouble(value * 3.0433)
            )
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
