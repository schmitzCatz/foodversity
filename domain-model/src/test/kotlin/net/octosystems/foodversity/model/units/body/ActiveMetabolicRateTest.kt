package net.octosystems.foodversity.model.units.body

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isSuccess
import net.octosystems.foodversity.model.person.Age
import net.octosystems.foodversity.model.person.Sex
import net.octosystems.foodversity.model.units.length.Centimeter
import net.octosystems.foodversity.model.units.weight.Kilogram
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import java.math.RoundingMode

class ActiveMetabolicRateTest {

    @Test
    fun `AMR of BMR 1902 kCal and SEDENTARY activity level is 380,40 kCal`() {
        val bmr = BasalMetabolicRate(Sex.MALE, Kilogram.of(88.7), Centimeter.of(180), Age.of(23))
        assertThat { ActiveMetabolicRate(bmr, ActivityLevel.SEDENTARY).value }
            .isSuccess()
            .transform { BigDecimal(it.toDouble()).setScale(2, RoundingMode.UP).toDouble() }
            .isEqualTo(380.40)
    }
}
