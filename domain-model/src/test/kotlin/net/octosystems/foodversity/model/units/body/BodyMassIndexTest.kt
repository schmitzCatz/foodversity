package net.octosystems.foodversity.model.units.body

import assertk.assertThat
import assertk.assertions.isEqualTo
import net.octosystems.foodversity.model.common.numeric.NumericDouble
import org.junit.jupiter.api.Test
import kotlin.math.pow

class BodyMassIndexTest {

    @Test
    fun `Test metric BMI calculation kg times m pow 2`() {
        assertThat(BodyMassIndex.of(130.0, 1.82).value).isEqualTo(NumericDouble(130.0 / 1.82.pow(2.0)))
    }
}
