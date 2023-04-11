package net.octosystems.foodversity.model.units.energy

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class JouleTest {

    @Test
    fun `Symbol of Joule should be 'J'`() {
        val actual = Joule.of(5).getSymbol().toString()
        assertThat(actual).isEqualTo("J")
    }

    @Test
    fun `Conversion of 1 KiloCalorie to Joule is 4186,8`() {
        val kCal = KiloCalorie.of(1)
        val actual = Joule.of(kCal)
        assertThat(actual).transform { it.toDouble() }.isEqualTo(4186.8)
    }

    @Test
    fun `Conversion of 1 KiloJoule to Joule is 1000`() {
        val kj = KiloJoule.of(1)
        val actual = Joule.of(kj)
        assertThat(actual).transform { it.toDouble() }.isEqualTo(1000.0)
    }

    @Test
    fun `Conversion of 1 Calorie to Joule is 4,1868`() {
        val cal = Calorie.of(1)
        val actual = Joule.of(cal)
        assertThat(actual).transform { it.toDouble() }.isEqualTo(4.1868)
    }
}
