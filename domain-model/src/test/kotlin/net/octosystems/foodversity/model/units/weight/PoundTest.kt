package net.octosystems.foodversity.model.units.weight

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class PoundTest {

    @Test
    fun `Symbol of Pound should be 'lbs'`() {
        assertThat(Pound.of(5).getSymbol().toString()).isEqualTo("lbs")
    }

    @Test
    fun `Conversion of 1 Gram to pound is ~0,00220462`() {
        val g = Gram.of(1)
        assertThat(Pound.of(g)).transform { it.toDouble() }.isEqualTo(0.002204622621848776)
    }

    @Test
    fun `Conversion of 1 Kilogram to Pound is ~2,2046`() {
        val kg = Kilogram.of(1)
        assertThat(Pound.of(kg)).transform { it.toDouble() }.isEqualTo(2.2046)
    }

    @Test
    fun `Conversion of 1 Milligram to Pound is ~0,0000022046`() {
        val mg = Milligram.of(1)
        assertThat(Pound.of(mg)).transform { it.toDouble() }.isEqualTo(0.000002205)
    }
}
