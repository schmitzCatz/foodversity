package net.octosystems.foodversity.model.units.energy

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class KiloCalorieTest {

    @Test
    fun `Symbol of KiloCalorie should be 'kJ'`() {
        val actual = KiloCalorie.of(5).getSymbol().toString()
        assertThat(actual).isEqualTo("kCal")
    }

    @Test
    fun `Conversion of 1 Joule to KiloCalorie is 0,00023885`() {
        val j = Joule.of(1)
        val actual = KiloCalorie.of(j)
        assertThat(actual).transform { it.toDouble() }.isEqualTo(0.00023885)
    }

    @Test
    fun `Conversion of 1 KiloJoule to KiloCalorie is 0,238846`() {
        val kj = KiloJoule.of(1)
        val actual = KiloCalorie.of(kj)
        assertThat(actual).transform { it.toDouble() }.isEqualTo(0.238846)
    }

    @Test
    fun `Conversion of 1 Calorie to KiloCalorie is 0,001`() {
        val cal = Calorie.of(1)
        val actual = KiloCalorie.of(cal)
        assertThat(actual).transform { it.toDouble() }.isEqualTo(0.001)
    }
}
