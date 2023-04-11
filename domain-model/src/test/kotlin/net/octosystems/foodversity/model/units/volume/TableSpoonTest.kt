package net.octosystems.foodversity.model.units.volume

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class TableSpoonTest {

    @Test
    fun `Symbol of TableSpoon should be 'ml'`() {
        assertThat(TableSpoon.of(5).getSymbol().toString()).isEqualTo("tsp")
    }

    @Test
    fun `Conversion of 1 CubicMeter to TableSpoon is 67628,03`() {
        val cubicMeter = CubicMeter.of(1)
        assertThat(TableSpoon.of(cubicMeter)).transform { it.toDouble() }.isEqualTo(67628.03)
    }

    @Test
    fun `Conversion of 1 MilliLiter to TableSpoon is 0,067628`() {
        val ml = MilliLiter.of(1)
        assertThat(TableSpoon.of(ml)).transform { it.toDouble() }.isEqualTo(0.067628)
    }

    @Test
    fun `Conversion of 1 TeaSpoon to TableSpoon is 0,333333`() {
        val tsp = TeaSpoon.of(1)
        assertThat(TableSpoon.of(tsp)).transform { it.toDouble() }.isEqualTo(0.333333)
    }

    @Test
    fun `Conversion of 1 Liter to TableSpoon is 67,628`() {
        val l = Liter.of(1)
        assertThat(TableSpoon.of(l)).transform { it.toDouble() }.isEqualTo(67.628)
    }
}
