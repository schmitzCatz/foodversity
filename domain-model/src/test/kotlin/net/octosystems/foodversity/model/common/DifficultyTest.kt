package net.octosystems.foodversity.model.common

import assertk.assertThat
import assertk.assertions.isFailure
import assertk.assertions.messageContains
import org.junit.jupiter.api.Test

class DifficultyTest {

    @Test
    fun `Creating difficulty below 0 should fail`() {
        assertThat { Difficulty.of(0) }.isFailure().messageContains("should be above zero")
    }

    @Test
    fun `Creating difficulty above 10 should fail`() {
        assertThat { Difficulty.of(11) }.isFailure().messageContains("should be less or equal")
    }
}
