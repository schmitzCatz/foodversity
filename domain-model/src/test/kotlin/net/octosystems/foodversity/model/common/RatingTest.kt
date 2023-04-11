package net.octosystems.foodversity.model.common

import assertk.assertThat
import assertk.assertions.isFailure
import assertk.assertions.messageContains
import org.junit.jupiter.api.Test

class RatingTest {

    @Test
    fun `Creating rating below 0 should fail`() {
        assertThat { Rating.of(-1) }.isFailure().messageContains("is lower than zero")
    }

    @Test
    fun `Creating rating above 5 should fail`() {
        assertThat { Rating.of(11) }.isFailure().messageContains("is greater than five")
    }
}
