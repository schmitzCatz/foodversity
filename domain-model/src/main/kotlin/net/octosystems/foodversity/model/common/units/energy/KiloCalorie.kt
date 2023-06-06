package net.octosystems.foodversity.model.common.units.energy

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.common.units.UnitSymbol
import java.lang.IllegalStateException

@JvmInline
value class KiloCalorie(private val value: NumericDouble) : net.octosystems.foodversity.model.common.units.energy.EnergyUnit, Numeric by value {

    override fun toJoule(): net.octosystems.foodversity.model.common.units.energy.Joule =
        net.octosystems.foodversity.model.common.units.energy.Joule.Companion.of(this)
    override fun toKiloJoule(): net.octosystems.foodversity.model.common.units.energy.KiloJoule =
        net.octosystems.foodversity.model.common.units.energy.KiloJoule.Companion.of(this)
    override fun toCalorie(): net.octosystems.foodversity.model.common.units.energy.Calorie =
        net.octosystems.foodversity.model.common.units.energy.Calorie.Companion.of(this)
    override fun toKiloCalorie(): net.octosystems.foodversity.model.common.units.energy.KiloCalorie =
        net.octosystems.foodversity.model.common.units.energy.KiloCalorie(value)

    override fun getSymbol(): net.octosystems.foodversity.model.common.units.UnitSymbol = net.octosystems.foodversity.model.common.units.UnitSymbol.of("kCal")

    companion object {
        fun of(value: Number) =
            net.octosystems.foodversity.model.common.units.energy.KiloCalorie(NumericDouble(value.toDouble()))

        fun of(value: net.octosystems.foodversity.model.common.units.energy.EnergyUnit): net.octosystems.foodversity.model.common.units.energy.KiloCalorie = when (value) {
            is net.octosystems.foodversity.model.common.units.energy.Joule -> net.octosystems.foodversity.model.common.units.energy.KiloCalorie(
                NumericDouble(value * 0.00023885)
            )
            is net.octosystems.foodversity.model.common.units.energy.KiloCalorie -> value
            is net.octosystems.foodversity.model.common.units.energy.Calorie -> net.octosystems.foodversity.model.common.units.energy.KiloCalorie(
                NumericDouble(value * 0.001)
            )
            is net.octosystems.foodversity.model.common.units.energy.KiloJoule -> net.octosystems.foodversity.model.common.units.energy.KiloCalorie(
                NumericDouble(value * 0.238846)
            )
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
