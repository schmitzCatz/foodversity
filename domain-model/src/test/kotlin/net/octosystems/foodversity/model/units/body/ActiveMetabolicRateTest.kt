package net.octosystems.foodversity.model.units.body

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isSuccess
import net.octosystems.foodversity.model.user.person.Age
import net.octosystems.foodversity.model.user.person.Sex
import net.octosystems.foodversity.model.common.units.length.Centimeter
import net.octosystems.foodversity.model.common.units.weight.Kilogram
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import java.math.RoundingMode

class ActiveMetabolicRateTest {

    @Test
    fun `AMR of BMR 1902 kCal and SEDENTARY activity level is 380,40 kCal`() {
        val bmr = net.octosystems.foodversity.model.common.units.body.BasalMetabolicRate(
            Sex.MALE,
            net.octosystems.foodversity.model.common.units.weight.Kilogram.of(88.7),
            net.octosystems.foodversity.model.common.units.length.Centimeter.of(180),
            Age.of(23)
        )
        assertThat { net.octosystems.foodversity.model.common.units.body.ActiveMetabolicRate(
            bmr,
            net.octosystems.foodversity.model.common.units.body.ActivityLevel.SEDENTARY
        ).value }
            .isSuccess()
            .transform { BigDecimal(it.toDouble()).setScale(2, RoundingMode.UP).toDouble() }
            .isEqualTo(380.40)
    }
}
