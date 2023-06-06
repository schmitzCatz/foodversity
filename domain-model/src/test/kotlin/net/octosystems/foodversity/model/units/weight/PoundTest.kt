package net.octosystems.foodversity.model.units.weight

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class PoundTest {

    @Test
    fun `Symbol of Pound should be 'lbs'`() {
        assertThat(net.octosystems.foodversity.model.common.units.weight.Pound.of(5).getSymbol().toString()).isEqualTo("lbs")
    }

    @Test
    fun `Conversion of 1 Gram to pound is ~0,00220462`() {
        val g = net.octosystems.foodversity.model.common.units.weight.Gram.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.weight.Pound.of(g)).transform { it.toDouble() }.isEqualTo(0.002204622621848776)
    }

    @Test
    fun `Conversion of 1 Kilogram to Pound is ~2,2046`() {
        val kg = net.octosystems.foodversity.model.common.units.weight.Kilogram.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.weight.Pound.of(kg)).transform { it.toDouble() }.isEqualTo(2.2046)
    }

    @Test
    fun `Conversion of 1 Milligram to Pound is ~0,0000022046`() {
        val mg = net.octosystems.foodversity.model.common.units.weight.Milligram.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.weight.Pound.of(mg)).transform { it.toDouble() }.isEqualTo(0.000002205)
    }
}
