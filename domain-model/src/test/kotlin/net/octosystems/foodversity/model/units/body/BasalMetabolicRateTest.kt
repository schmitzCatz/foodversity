package net.octosystems.foodversity.model.units.body

import assertk.assertAll
import assertk.assertThat
import assertk.assertions.hasMessage
import assertk.assertions.isEqualTo
import assertk.assertions.isFailure
import assertk.assertions.isSuccess
import net.octosystems.foodversity.model.person.Age
import net.octosystems.foodversity.model.person.Sex
import net.octosystems.foodversity.model.units.energy.KiloCalorie
import net.octosystems.foodversity.model.units.length.Centimeter
import net.octosystems.foodversity.model.units.weight.Kilogram
import org.junit.jupiter.api.Test

class BasalMetabolicRateTest {

    @Test
    fun `BMR calculation should fail for Non-Male or Non-Female sex`() {
        assertAll {
            assertThat { BasalMetabolicRate(Sex.DIVERSE, Kilogram.of(1), Centimeter.of(1), Age.of(1)) }
                .isFailure()
                .hasMessage("Mifflin St Jeor equation only works for Male/Female sex and not for DIVERSE")
            assertThat { BasalMetabolicRate(Sex.INDEFINITE, Kilogram.of(1), Centimeter.of(1), Age.of(1)) }
                .isFailure()
                .hasMessage("Mifflin St Jeor equation only works for Male/Female sex and not for INDEFINITE")
        }
    }

    @Test
    fun `BMR calculation of a Male weight 88,7kg of 180cm and Age of 23`() {
        assertThat { BasalMetabolicRate(Sex.MALE, Kilogram.of(88.7), Centimeter.of(180), Age.of(23)) }
            .isSuccess().transform { it.value }
            .isEqualTo(KiloCalorie.of(1902.0))
    }

    @Test
    fun `BMR calculation of a Male weight 71,7kg of 166cm and Age of 23`(){
        assertThat { BasalMetabolicRate(Sex.FEMALE, Kilogram.of(71.7), Centimeter.of(166), Age.of(23)) }
            .isSuccess().transform { it.value }
            .isEqualTo(KiloCalorie.of(1478.5))
    }
}
