package net.octosystems.foodversity.model.units.energy

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.units.UnitSymbol
import java.lang.IllegalStateException

@JvmInline
value class KiloCalorie(private val value: NumericDouble) : EnergyUnit, Numeric by value {

    override fun toJoule(): Joule = Joule.of(this)
    override fun toKiloJoule(): KiloJoule = KiloJoule.of(this)
    override fun toCalorie(): Calorie = Calorie.of(this)
    override fun toKiloCalorie(): KiloCalorie = KiloCalorie(value)

    override fun getSymbol(): UnitSymbol = UnitSymbol.of("kCal")

    companion object {
        fun of(value: Number) = KiloCalorie(NumericDouble(value.toDouble()))

        fun of(value: EnergyUnit): KiloCalorie = when (value) {
            is Joule -> KiloCalorie(NumericDouble(value * 0.00023885))
            is KiloCalorie -> value
            is Calorie -> KiloCalorie(NumericDouble(value * 0.001))
            is KiloJoule -> KiloCalorie(NumericDouble(value * 0.238846))
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
