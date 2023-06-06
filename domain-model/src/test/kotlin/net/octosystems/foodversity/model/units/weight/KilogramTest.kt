package net.octosystems.foodversity.model.units.weight

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class KilogramTest {

    @Test
    fun `Symbol of Kilogram should be 'kg'`() {
        assertThat(net.octosystems.foodversity.model.common.units.weight.Kilogram.of(5).getSymbol().toString()).isEqualTo("kg")
    }

    @Test
    fun `Conversion of 1 Gram to Kilogram is 0,001`() {
        val g = net.octosystems.foodversity.model.common.units.weight.Gram.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.weight.Kilogram.of(g)).transform { it.toDouble() }.isEqualTo(0.001)
    }

    @Test
    fun `Conversion of 1 Milligram to Kilogram is 0,000001`() {
        val mg = net.octosystems.foodversity.model.common.units.weight.Milligram.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.weight.Kilogram.of(mg)).transform { it.toDouble() }.isEqualTo(0.000001)
    }

    @Test
    fun `Conversion of 1 Pound to Kilogram is ~0,45`() {
        val lbs = net.octosystems.foodversity.model.common.units.weight.Pound.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.weight.Kilogram.of(lbs)).transform { it.toDouble() }.isEqualTo(0.45)
    }
}
