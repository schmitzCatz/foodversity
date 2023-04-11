package net.octosystems.foodversity.model.units.energy

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.units.UnitSymbol
import java.lang.IllegalStateException

/**
 * The calorie is a unit of energy that originated from the obsolete caloric theory of heat.
 */
@JvmInline
value class Calorie(val value: NumericDouble) : EnergyUnit, Numeric by value {

    override fun toJoule(): Joule = Joule.of(this)
    override fun toKiloJoule(): KiloJoule = KiloJoule.of(this)
    override fun toCalorie(): Calorie = Calorie(value)
    override fun toKiloCalorie(): KiloCalorie = KiloCalorie.of(this)

    override fun getSymbol(): UnitSymbol = UnitSymbol.of("cal")

    companion object {
        fun of(value: Number) = Calorie(NumericDouble(value.toDouble()))

        fun of(value: EnergyUnit): Calorie = when (value) {
            is Joule -> Calorie(NumericDouble(value * 0.238846))
            is KiloJoule -> Calorie(NumericDouble(value * 238.85))
            is Calorie -> value
            is KiloCalorie -> Calorie(NumericDouble(value * 1000))
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
