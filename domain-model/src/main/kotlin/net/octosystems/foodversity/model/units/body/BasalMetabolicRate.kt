package net.octosystems.foodversity.model.units.body

import net.octosystems.foodversity.model.person.Age
import net.octosystems.foodversity.model.person.Sex
import net.octosystems.foodversity.model.units.energy.KiloCalorie
import net.octosystems.foodversity.model.units.length.Centimeter
import net.octosystems.foodversity.model.units.weight.Kilogram

/**
 * Mifflin St Jeor equation to determine Base Metabolic Rate.
 */
data class BasalMetabolicRate(
    val sex: Sex,
    val weight: Kilogram,
    val height: Centimeter,
    val age: Age
) {
    init {
        require(sex == Sex.MALE || sex == Sex.FEMALE) {
            "Mifflin St Jeor equation only works for Male/Female sex and not for $sex"
        }
    }
    val value: KiloCalorie
        get() {
            val base = (weight * 10) + (height * 6.25) - (age * 5)
            return when (sex) {
                Sex.FEMALE -> KiloCalorie.of((base - 161).getValue())
                Sex.MALE -> KiloCalorie.of((base + 5).getValue())
                else -> throw IllegalStateException("Mifflin St Jeor equation only works for Male/Female sex")
            }
        }
}
