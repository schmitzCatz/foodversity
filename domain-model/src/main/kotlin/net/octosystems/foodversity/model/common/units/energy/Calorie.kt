package net.octosystems.foodversity.model.common.units.energy

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.common.units.UnitSymbol
import java.lang.IllegalStateException

/**
 * The calorie is a unit of energy that originated from the obsolete caloric theory of heat.
 */
@JvmInline
value class Calorie(val value: NumericDouble) : net.octosystems.foodversity.model.common.units.energy.EnergyUnit, Numeric by value {

    override fun toJoule(): net.octosystems.foodversity.model.common.units.energy.Joule =
        net.octosystems.foodversity.model.common.units.energy.Joule.Companion.of(this)
    override fun toKiloJoule(): net.octosystems.foodversity.model.common.units.energy.KiloJoule =
        net.octosystems.foodversity.model.common.units.energy.KiloJoule.Companion.of(this)
    override fun toCalorie(): net.octosystems.foodversity.model.common.units.energy.Calorie =
        net.octosystems.foodversity.model.common.units.energy.Calorie(value)
    override fun toKiloCalorie(): net.octosystems.foodversity.model.common.units.energy.KiloCalorie =
        net.octosystems.foodversity.model.common.units.energy.KiloCalorie.Companion.of(this)

    override fun getSymbol(): net.octosystems.foodversity.model.common.units.UnitSymbol = net.octosystems.foodversity.model.common.units.UnitSymbol.of("cal")

    companion object {
        fun of(value: Number) =
            net.octosystems.foodversity.model.common.units.energy.Calorie(NumericDouble(value.toDouble()))

        fun of(value: net.octosystems.foodversity.model.common.units.energy.EnergyUnit): net.octosystems.foodversity.model.common.units.energy.Calorie = when (value) {
            is net.octosystems.foodversity.model.common.units.energy.Joule -> net.octosystems.foodversity.model.common.units.energy.Calorie(
                NumericDouble(value * 0.238846)
            )
            is net.octosystems.foodversity.model.common.units.energy.KiloJoule -> net.octosystems.foodversity.model.common.units.energy.Calorie(
                NumericDouble(value * 238.85)
            )
            is net.octosystems.foodversity.model.common.units.energy.Calorie -> value
            is net.octosystems.foodversity.model.common.units.energy.KiloCalorie -> net.octosystems.foodversity.model.common.units.energy.Calorie(
                NumericDouble(value * 1000)
            )
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
