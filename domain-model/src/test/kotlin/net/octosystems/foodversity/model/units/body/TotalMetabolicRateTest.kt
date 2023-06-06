package net.octosystems.foodversity.model.units.body

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isSuccess
import net.octosystems.foodversity.model.user.person.Age
import net.octosystems.foodversity.model.user.person.Sex
import net.octosystems.foodversity.model.common.units.length.Centimeter
import net.octosystems.foodversity.model.common.units.weight.Kilogram
import org.junit.jupiter.api.Test

class TotalMetabolicRateTest {

    @Test
    fun `TDEE of BMR 1902 kCal and SEDENTARY activity level is 2282,4 kCal`() {
        val bmr = net.octosystems.foodversity.model.common.units.body.BasalMetabolicRate(
            Sex.MALE,
            net.octosystems.foodversity.model.common.units.weight.Kilogram.of(88.7),
            net.octosystems.foodversity.model.common.units.length.Centimeter.of(180),
            Age.of(23)
        )
        val amr = net.octosystems.foodversity.model.common.units.body.ActiveMetabolicRate(
            bmr,
            net.octosystems.foodversity.model.common.units.body.ActivityLevel.SEDENTARY
        )

        assertThat { net.octosystems.foodversity.model.common.units.body.TotalDailyEnergyExpenditure(bmr, amr).value }
            .isSuccess().transform { it.toDouble() }
            .isEqualTo(2282.4)
    }
}
