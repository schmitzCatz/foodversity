package net.octosystems.foodversity.model.common.units.body

import net.octosystems.foodversity.model.user.person.Age
import net.octosystems.foodversity.model.user.person.Sex
import net.octosystems.foodversity.model.common.units.energy.KiloCalorie
import net.octosystems.foodversity.model.common.units.length.Centimeter
import net.octosystems.foodversity.model.common.units.weight.Kilogram

/**
 * Mifflin St Jeor equation to determine Base Metabolic Rate.
 */
data class BasalMetabolicRate(
    val sex: Sex,
    val weight: net.octosystems.foodversity.model.common.units.weight.Kilogram,
    val height: net.octosystems.foodversity.model.common.units.length.Centimeter,
    val age: Age
) {
    init {
        require(sex == Sex.MALE || sex == Sex.FEMALE) {
            "Mifflin St Jeor equation only works for Male/Female sex and not for $sex"
        }
    }
    val value: net.octosystems.foodversity.model.common.units.energy.KiloCalorie
        get() {
            val base = (weight * 10) + (height * 6.25) - (age * 5)
            return when (sex) {
                Sex.FEMALE -> net.octosystems.foodversity.model.common.units.energy.KiloCalorie.of((base - 161).getValue())
                Sex.MALE -> net.octosystems.foodversity.model.common.units.energy.KiloCalorie.of((base + 5).getValue())
                else -> throw IllegalStateException("Mifflin St Jeor equation only works for Male/Female sex")
            }
        }
}
