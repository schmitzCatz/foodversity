package net.octosystems.foodversity.model.units.energy

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class KiloJouleTest {

    @Test
    fun `Symbol of KiloJoule should be 'kJ'`() {
        val actual = net.octosystems.foodversity.model.common.units.energy.KiloJoule.of(5).getSymbol().toString()
        assertThat(actual).isEqualTo("kJ")
    }

    @Test
    fun `Conversion of 1 Joule to KiloJoule is 0,001`() {
        val j = net.octosystems.foodversity.model.common.units.energy.Joule.of(1)
        val actual = net.octosystems.foodversity.model.common.units.energy.KiloJoule.of(j)
        assertThat(actual).transform { it.toDouble() }.isEqualTo(0.001)
    }

    @Test
    fun `Conversion of 1 KiloCalorie to KiloJoule is 4,1868`() {
        val kCal = net.octosystems.foodversity.model.common.units.energy.KiloCalorie.of(1)
        val actual = net.octosystems.foodversity.model.common.units.energy.KiloJoule.of(kCal)
        assertThat(actual).transform { it.toDouble() }.isEqualTo(4.1868)
    }

    @Test
    fun `Conversion of 1 Calorie to KiloJoule is 0,0041868`() {
        val cal = net.octosystems.foodversity.model.common.units.energy.Calorie.of(1)
        val actual = net.octosystems.foodversity.model.common.units.energy.KiloJoule.of(cal)
        assertThat(actual).transform { it.toDouble() }.isEqualTo(0.0041868)
    }
}
