package net.octosystems.foodversity.model.common.units.energy

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.common.units.UnitSymbol
import java.lang.IllegalStateException

/**
 * The joule (symbol: J) is the unit of energy in the International System of Units (SI).
 */
@JvmInline
value class Joule(val value: NumericDouble) : net.octosystems.foodversity.model.common.units.energy.EnergyUnit, Numeric by value {

    override fun toJoule(): net.octosystems.foodversity.model.common.units.energy.Joule =
        net.octosystems.foodversity.model.common.units.energy.Joule(value)
    override fun toKiloJoule(): net.octosystems.foodversity.model.common.units.energy.KiloJoule =
        net.octosystems.foodversity.model.common.units.energy.KiloJoule.Companion.of(this)
    override fun toCalorie(): net.octosystems.foodversity.model.common.units.energy.Calorie =
        net.octosystems.foodversity.model.common.units.energy.Calorie.Companion.of(this)
    override fun toKiloCalorie(): net.octosystems.foodversity.model.common.units.energy.KiloCalorie =
        net.octosystems.foodversity.model.common.units.energy.KiloCalorie.Companion.of(this)

    override fun getSymbol(): net.octosystems.foodversity.model.common.units.UnitSymbol = net.octosystems.foodversity.model.common.units.UnitSymbol.of("J")

    companion object {
        fun of(value: Number) =
            net.octosystems.foodversity.model.common.units.energy.Joule(NumericDouble(value.toDouble()))

        fun of(value: net.octosystems.foodversity.model.common.units.energy.EnergyUnit): net.octosystems.foodversity.model.common.units.energy.Joule = when (value) {
            is net.octosystems.foodversity.model.common.units.energy.Joule -> value
            is net.octosystems.foodversity.model.common.units.energy.KiloJoule -> net.octosystems.foodversity.model.common.units.energy.Joule(
                NumericDouble(value * 1000)
            )
            is net.octosystems.foodversity.model.common.units.energy.Calorie -> net.octosystems.foodversity.model.common.units.energy.Joule(
                NumericDouble(value * 4.1868)
            )
            is net.octosystems.foodversity.model.common.units.energy.KiloCalorie -> net.octosystems.foodversity.model.common.units.energy.Joule(
                NumericDouble(value * 4186.8)
            )
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
