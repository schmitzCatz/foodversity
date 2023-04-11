package net.octosystems.foodversity.model.units.length

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class MeterTest {

    @Test
    fun `Symbol of Meter should be 'm'`() {
        assertThat(Meter.of(5).getSymbol().toString()).isEqualTo("m")
    }

    @Test
    fun `Conversion of 1 Centimeter to Meter is 0,01`() {
        val cm = Centimeter.of(1)
        assertThat(Meter.of(cm)).transform { it.toDouble() }.isEqualTo(0.01)
    }

    @Test
    fun `Conversion of 1 Inch to Meter is 0,001`() {
        val mg = Inch.of(1)
        assertThat(Meter.of(mg)).transform { it.toDouble() }.isEqualTo(0.0254)
    }
}
