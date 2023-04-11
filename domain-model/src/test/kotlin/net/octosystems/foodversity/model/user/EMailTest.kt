package net.octosystems.foodversity.model.user

import assertk.assertAll
import assertk.assertThat
import assertk.assertions.isFailure
import assertk.assertions.isSuccess
import assertk.assertions.messageContains
import org.junit.jupiter.api.Test

class EMailTest {

    @Test
    fun `EMail should not be empty`() {
        assertAll {
            assertThat {
                EMail.of("")
            }.isFailure().messageContains("should not be empty!")
            assertThat {
                EMail.of(" ")
            }.isFailure().messageContains("should not be empty!")
        }
    }

    @Test
    fun `Email should contain @-Symbol`() {
        assertThat {
            EMail.of("nomail")
        }.isFailure().messageContains("should contain @-Symbol!")
    }

    @Test
    fun `Test valid email address`() {
        assertThat {
            EMail.of("unit-test@example.com")
        }.isSuccess()
    }
}
