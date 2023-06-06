package net.octosystems.foodversity.model.units.length

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class InchTest {

    @Test
    fun `Symbol of Inch should be 'in'`() {
        assertThat(net.octosystems.foodversity.model.common.units.length.Inch.of(5).getSymbol().toString()).isEqualTo("in")
    }

    @Test
    fun `Conversion of 1 Meter to Inch is 39,3701`() {
        val m = net.octosystems.foodversity.model.common.units.length.Meter.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.length.Inch.of(m)).transform { it.toDouble() }.isEqualTo(39.3701)
    }

    @Test
    fun `Conversion of 1 Centimeter to Inch is 0,393701`() {
        val cm = net.octosystems.foodversity.model.common.units.length.Centimeter.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.length.Inch.of(cm)).transform { it.toDouble() }.isEqualTo(0.393701)
    }
}
