package net.octosystems.foodversity.model.grocery.ean

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isSuccess
import net.octosystems.foodversity.model.common.numeric.PositiveNumber
import org.junit.jupiter.api.Test

class CheckSumTest {

    @Test
    fun `EAN-13 barcode 400638133393 has checksum 1`() {
        assertThat { CheckSum.of("400638133393").value }.isSuccess().isEqualTo(PositiveNumber.of(1))
    }

    @Test
    fun `EAN-8 barcode 7351353 has checksum 7`() {
        assertThat { CheckSum.of("7351353").value }.isSuccess().isEqualTo(PositiveNumber.of(7))
    }
}
