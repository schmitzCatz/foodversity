package net.octosystems.foodversity.model.common.units.energy

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.common.units.UnitSymbol
import java.lang.IllegalStateException

@JvmInline
value class KiloJoule(val value: NumericDouble) : net.octosystems.foodversity.model.common.units.energy.EnergyUnit, Numeric by value {

    override fun toJoule(): net.octosystems.foodversity.model.common.units.energy.Joule =
        net.octosystems.foodversity.model.common.units.energy.Joule.Companion.of(this)
    override fun toKiloJoule(): net.octosystems.foodversity.model.common.units.energy.KiloJoule =
        net.octosystems.foodversity.model.common.units.energy.KiloJoule(value)
    override fun toCalorie(): net.octosystems.foodversity.model.common.units.energy.Calorie =
        net.octosystems.foodversity.model.common.units.energy.Calorie.Companion.of(this)
    override fun toKiloCalorie(): net.octosystems.foodversity.model.common.units.energy.KiloCalorie =
        net.octosystems.foodversity.model.common.units.energy.KiloCalorie.Companion.of(this)

    override fun getSymbol(): net.octosystems.foodversity.model.common.units.UnitSymbol = net.octosystems.foodversity.model.common.units.UnitSymbol.of("kJ")

    companion object {
        fun of(value: Number) =
            net.octosystems.foodversity.model.common.units.energy.KiloJoule(NumericDouble(value.toDouble()))

        fun of(value: net.octosystems.foodversity.model.common.units.energy.EnergyUnit): net.octosystems.foodversity.model.common.units.energy.KiloJoule = when (value) {
            is net.octosystems.foodversity.model.common.units.energy.Joule -> net.octosystems.foodversity.model.common.units.energy.KiloJoule(
                NumericDouble(value * 0.001)
            )
            is net.octosystems.foodversity.model.common.units.energy.KiloCalorie -> net.octosystems.foodversity.model.common.units.energy.KiloJoule(
                NumericDouble(value * 4.1868)
            )
            is net.octosystems.foodversity.model.common.units.energy.Calorie -> net.octosystems.foodversity.model.common.units.energy.KiloJoule(
                NumericDouble(value * 0.0041868)
            )
            is net.octosystems.foodversity.model.common.units.energy.KiloJoule -> value
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
