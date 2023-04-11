package net.octosystems.foodversity.model.units.body

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isSuccess
import net.octosystems.foodversity.model.person.Age
import net.octosystems.foodversity.model.person.Sex
import net.octosystems.foodversity.model.units.length.Centimeter
import net.octosystems.foodversity.model.units.weight.Kilogram
import org.junit.jupiter.api.Test

class TotalMetabolicRateTest {

    @Test
    fun `TDEE of BMR 1902 kCal and SEDENTARY activity level is 2282,4 kCal`() {
        val bmr = BasalMetabolicRate(Sex.MALE, Kilogram.of(88.7), Centimeter.of(180), Age.of(23))
        val amr = ActiveMetabolicRate(bmr, ActivityLevel.SEDENTARY)

        assertThat { TotalDailyEnergyExpenditure(bmr, amr).value }
            .isSuccess().transform { it.toDouble() }
            .isEqualTo(2282.4)
    }
}
