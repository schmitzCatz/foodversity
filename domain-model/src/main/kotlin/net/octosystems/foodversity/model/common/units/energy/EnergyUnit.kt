package net.octosystems.foodversity.model.common.units.energy

import net.octosystems.foodversity.model.common.units.UnitOfMeasure

interface EnergyUnit : net.octosystems.foodversity.model.common.units.UnitOfMeasure {

    fun toJoule(): net.octosystems.foodversity.model.common.units.energy.Joule
    fun toKiloJoule(): net.octosystems.foodversity.model.common.units.energy.KiloJoule

    fun toCalorie(): net.octosystems.foodversity.model.common.units.energy.Calorie
    fun toKiloCalorie(): net.octosystems.foodversity.model.common.units.energy.KiloCalorie
}
