package net.octosystems.foodversity.model.user

import assertk.assertThat
import assertk.assertions.isFailure
import assertk.assertions.isSuccess
import assertk.assertions.messageContains
import net.octosystems.foodversity.model.user.person.DayOfBirth
import org.junit.jupiter.api.Test
import java.time.Instant

class DayOfBirthTest {

    @Test
    fun `Day of birth should be after 1900-01-01`() {
        assertThat {
            DayOfBirth.of("1900-01-01")
        }.isFailure().messageContains("Should be after 1900")
    }

    @Test
    fun `Day of birth should be before today`() {
        assertThat {
            DayOfBirth(Instant.now().plusSeconds(3600))
        }.isFailure().messageContains("Should be before today!")
    }

    @Test
    fun `Day of birth of Konrad Zuse(1910-06-22) is valid`() {
        assertThat {
            DayOfBirth.of("1910-06-22")
        }.isSuccess()
    }
}
