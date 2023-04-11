package net.octosystems.foodversity.model.units.energy

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.units.UnitSymbol
import java.lang.IllegalStateException

/**
 * The joule (symbol: J) is the unit of energy in the International System of Units (SI).
 */
@JvmInline
value class Joule(val value: NumericDouble) : EnergyUnit, Numeric by value {

    override fun toJoule(): Joule = Joule(value)
    override fun toKiloJoule(): KiloJoule = KiloJoule.of(this)
    override fun toCalorie(): Calorie = Calorie.of(this)
    override fun toKiloCalorie(): KiloCalorie = KiloCalorie.of(this)

    override fun getSymbol(): UnitSymbol = UnitSymbol.of("J")

    companion object {
        fun of(value: Number) = Joule(NumericDouble(value.toDouble()))

        fun of(value: EnergyUnit): Joule = when (value) {
            is Joule -> value
            is KiloJoule -> Joule(NumericDouble(value * 1000))
            is Calorie -> Joule(NumericDouble(value * 4.1868))
            is KiloCalorie -> Joule(NumericDouble(value * 4186.8))
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
