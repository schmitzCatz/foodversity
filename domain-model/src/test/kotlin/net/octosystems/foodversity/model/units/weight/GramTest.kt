package net.octosystems.foodversity.model.units.weight

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class GramTest {

    @Test
    fun `Symbol of Gram should be 'g'`() {
        assertThat(Gram.of(5).getSymbol().toString()).isEqualTo("g")
    }

    @Test
    fun `Conversion of 1 Kilogram to Gram is 1000`() {
        val kg = Kilogram.of(1)
        assertThat(Gram.of(kg)).isEqualTo(Gram.of(1000.0))
    }

    @Test
    fun `Conversion of 1 Milligram to Gram is 0,001`() {
        val mg = Milligram.of(1)
        assertThat(Gram.of(mg)).transform { it.toDouble() }.isEqualTo(0.001)
    }

    @Test
    fun `Conversion of 1 Pound to Gram is 453,6`() {
        val lbs = Pound.of(1)
        assertThat(Gram.of(lbs))
            .transform { it.toDouble() }
            .isEqualTo(453.59237)
    }
}
