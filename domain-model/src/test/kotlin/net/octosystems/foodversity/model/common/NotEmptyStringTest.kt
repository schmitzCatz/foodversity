package net.octosystems.foodversity.model.common

import assertk.assertThat
import assertk.assertions.isFailure
import assertk.assertions.messageContains
import net.octosystems.foodversity.model.common.string.NotEmptyString
import org.junit.jupiter.api.Test

class NotEmptyStringTest {

    @Test
    fun `Blank string should result into an error`() {
        assertThat { NotEmptyString(" ") }.isFailure().messageContains("should not be empty!")
    }

    @Test
    fun `Empty string should result into an error`() {
        assertThat { NotEmptyString("") }.isFailure().messageContains("should not be empty!")
    }
}
