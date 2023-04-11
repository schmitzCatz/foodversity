package net.octosystems.foodversity.model.units.energy

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class CalorieTest {

    @Test
    fun `Symbol of Calorie should be 'cal'`() {
        val actual = Calorie.of(5).getSymbol().toString()
        assertThat(actual).isEqualTo("cal")
    }

    @Test
    fun `Conversion of 1 KiloCalorie to Calorie is 1000`() {
        val kCal = KiloCalorie.of(1)
        val actual = Calorie.of(kCal)
        assertThat(actual).transform { it.toDouble() }.isEqualTo(1000.0)
    }

    @Test
    fun `Conversion of 1 KiloJoule to Calorie is 238,85`() {
        val kj = KiloJoule.of(1)
        val actual = Calorie.of(kj)
        assertThat(actual).transform { it.toDouble() }.isEqualTo(238.85)
    }

    @Test
    fun `Conversion of 1 Joule to Calorie is 0,238846`() {
        val j = Joule.of(1)
        val actual = Calorie.of(j)
        assertThat(actual).transform { it.toDouble() }.isEqualTo(0.238846)
    }
}
