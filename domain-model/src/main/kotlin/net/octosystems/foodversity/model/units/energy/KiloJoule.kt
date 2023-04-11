package net.octosystems.foodversity.model.units.energy

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.units.UnitSymbol
import java.lang.IllegalStateException

@JvmInline
value class KiloJoule(val value: NumericDouble) : EnergyUnit, Numeric by value {

    override fun toJoule(): Joule = Joule.of(this)
    override fun toKiloJoule(): KiloJoule = KiloJoule(value)
    override fun toCalorie(): Calorie = Calorie.of(this)
    override fun toKiloCalorie(): KiloCalorie = KiloCalorie.of(this)

    override fun getSymbol(): UnitSymbol = UnitSymbol.of("kJ")

    companion object {
        fun of(value: Number) = KiloJoule(NumericDouble(value.toDouble()))

        fun of(value: EnergyUnit): KiloJoule = when (value) {
            is Joule -> KiloJoule(NumericDouble(value * 0.001))
            is KiloCalorie -> KiloJoule(NumericDouble(value * 4.1868))
            is Calorie -> KiloJoule(NumericDouble(value * 0.0041868))
            is KiloJoule -> value
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
