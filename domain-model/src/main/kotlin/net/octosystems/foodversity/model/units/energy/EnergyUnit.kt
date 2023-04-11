package net.octosystems.foodversity.model.units.energy

import net.octosystems.foodversity.model.units.UnitOfMeasure

interface EnergyUnit : UnitOfMeasure {

    fun toJoule(): Joule
    fun toKiloJoule(): KiloJoule

    fun toCalorie(): Calorie
    fun toKiloCalorie(): KiloCalorie
}
