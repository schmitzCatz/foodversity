package net.octosystems.foodversity.model.units.weight

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class GramTest {

    @Test
    fun `Symbol of Gram should be 'g'`() {
        assertThat(net.octosystems.foodversity.model.common.units.weight.Gram.of(5).getSymbol().toString()).isEqualTo("g")
    }

    @Test
    fun `Conversion of 1 Kilogram to Gram is 1000`() {
        val kg = net.octosystems.foodversity.model.common.units.weight.Kilogram.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.weight.Gram.of(kg)).isEqualTo(net.octosystems.foodversity.model.common.units.weight.Gram.of(1000.0))
    }

    @Test
    fun `Conversion of 1 Milligram to Gram is 0,001`() {
        val mg = net.octosystems.foodversity.model.common.units.weight.Milligram.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.weight.Gram.of(mg)).transform { it.toDouble() }.isEqualTo(0.001)
    }

    @Test
    fun `Conversion of 1 Pound to Gram is 453,6`() {
        val lbs = net.octosystems.foodversity.model.common.units.weight.Pound.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.weight.Gram.of(lbs))
            .transform { it.toDouble() }
            .isEqualTo(453.59237)
    }
}
