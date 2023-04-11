package net.octosystems.foodversity.model.units.weight

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class MilligramTest {

    @Test
    fun `Symbol of Milligram should be 'lbs'`() {
        assertThat(Milligram.of(5).getSymbol().toString()).isEqualTo("mg")
    }

    @Test
    fun `Conversion of 1 Gram to Milligram is 1000`() {
        val g = Gram.of(1)
        assertThat(Milligram.of(g)).isEqualTo(Milligram.of(1_000))
    }

    @Test
    fun `Conversion of 1 Kilogram to Milligram is 1000000`() {
        val kg = Kilogram.of(1)
        assertThat(Milligram.of(kg)).isEqualTo(Milligram.of(1_000_000))
    }

    @Test
    fun `Conversion of 1 Pound to Milligram is ~453592,37`() {
        val lbs = Pound.of(1)
        assertThat(Milligram.of(lbs)).transform { it.toDouble() }.isEqualTo(453592.37)
    }
}
