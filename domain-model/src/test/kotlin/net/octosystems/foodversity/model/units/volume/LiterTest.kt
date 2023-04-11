package net.octosystems.foodversity.model.units.volume

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class LiterTest {

    @Test
    fun `Symbol of Liter should be 'L'`() {
        assertThat(Liter.of(5).getSymbol().toString()).isEqualTo("L")
    }

    @Test
    fun `Conversion of 1 CubicMeter to Liter is 1000`() {
        val cubicMeter = CubicMeter.of(1)
        assertThat(Liter.of(cubicMeter)).transform { it.toDouble() }.isEqualTo(1000.0)
    }

    @Test
    fun `Conversion of 1 MilliLiter to Liter is 0,001`() {
        val ml = MilliLiter.of(1)
        assertThat(Liter.of(ml)).transform { it.toDouble() }.isEqualTo(0.001)
    }

    @Test
    fun `Conversion of 1 TeaSpoon to Liter is 0,00492892`() {
        val tsp = TeaSpoon.of(1)
        assertThat(Liter.of(tsp)).transform { it.toDouble() }.isEqualTo(0.00492892)
    }

    @Test
    fun `Conversion of 1 TableSpoon to Liter is 0,015`() {
        val tbs = TableSpoon.of(1)
        assertThat(Liter.of(tbs)).transform { it.toDouble() }.isEqualTo(0.015)
    }
}
