package net.octosystems.foodversity.model.common

import assertk.assertThat
import assertk.assertions.isFailure
import assertk.assertions.messageContains
import net.octosystems.foodversity.model.common.numeric.PositiveNumber
import org.junit.jupiter.api.Test

class PositiveNumberTest {

    @Test
    fun `Using a negative number results in error`() {
        assertThat { PositiveNumber.of(-1) }.isFailure().messageContains("should be positive or 0")
    }
}
