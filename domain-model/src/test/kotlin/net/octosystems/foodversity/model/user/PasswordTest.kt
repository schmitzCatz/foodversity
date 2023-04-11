package net.octosystems.foodversity.model.user

import assertk.assertAll
import assertk.assertThat
import assertk.assertions.isFailure
import assertk.assertions.messageContains
import org.junit.jupiter.api.Test

class PasswordTest {

    @Test
    fun `Password should not be empty`() {
        assertAll {
            assertThat {
                Password.of("")
            }.isFailure().messageContains("should not be empty!")
            assertThat {
                Password.of(" ")
            }.isFailure().messageContains("should not be empty!")
        }
    }

    @Test
    fun `Password should be at least 8 Characters long`() {
        assertThat {
            Password.of("1234567")
        }.isFailure().messageContains("should be at least 8 Characters long!")
    }
}
