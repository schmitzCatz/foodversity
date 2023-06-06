package net.octosystems.foodversity.model.units.person

import assertk.assertThat
import assertk.assertions.isFailure
import assertk.assertions.messageContains
import net.octosystems.foodversity.model.user.person.Age
import org.junit.jupiter.api.Test

class AgeTest {

    @Test
    fun `Age of zero should fail`() {
        assertThat { Age.of(0) }.isFailure().messageContains("should be greater than zero")
    }

    @Test
    fun `Age of less then zero should fail`() {
        assertThat { Age.of(-1) }.isFailure().messageContains("should be greater than zero")
    }

    @Test
    fun `Age of 150 year should fail`() {
        assertThat { Age.of(150) }.isFailure().messageContains("should be less then 150!")
    }
}
