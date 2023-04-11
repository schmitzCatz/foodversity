package net.octosystems.foodversity.model.units.volume

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class CubicMeterTest {

    @Test
    fun `Symbol of CubicMeter should be 'm³'`() {
        assertThat(CubicMeter.of(5).getSymbol().toString()).isEqualTo("m³")
    }

    @Test
    fun `Conversion of 1 TeaSpoon to CubicMeter is 0,0000049289`() {
        val tsp = TeaSpoon.of(1)
        assertThat(CubicMeter.of(tsp)).transform { it.toDouble() }.isEqualTo(0.0000049289)
    }

    @Test
    fun `Conversion of 1 MilliLiter to CubicMeter is 0,000001`() {
        val ml = MilliLiter.of(1)
        assertThat(CubicMeter.of(ml)).transform { it.toDouble() }.isEqualTo(0.000001)
    }

    @Test
    fun `Conversion of 1 TableSpoon to CubicMeter is 0,0000147868`() {
        val tsp = TableSpoon.of(1)
        assertThat(CubicMeter.of(tsp)).transform { it.toDouble() }.isEqualTo(0.0000147868)
    }

    @Test
    fun `Conversion of 1 Liter to CubicMeter is 0,001`() {
        val l = Liter.of(1)
        assertThat(CubicMeter.of(l)).transform { it.value.toDouble() }.isEqualTo(0.001)
    }
}
