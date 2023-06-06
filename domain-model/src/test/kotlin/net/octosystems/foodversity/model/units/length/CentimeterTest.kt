package net.octosystems.foodversity.model.units.length

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class CentimeterTest {

    @Test
    fun `Symbol of Centimeter should be 'cm'`() {
        assertThat(net.octosystems.foodversity.model.common.units.length.Centimeter.of(5).getSymbol().toString()).isEqualTo("cm")
    }

    @Test
    fun `Conversion of 1 Meter to Centimeter is 100`() {
        val m = net.octosystems.foodversity.model.common.units.length.Meter.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.length.Centimeter.of(m)).transform { it.toDouble() }.isEqualTo(100.0)
    }

    @Test
    fun `Conversion of 1 Inch to Centimeter is 2,54`() {
        val inch = net.octosystems.foodversity.model.common.units.length.Inch.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.length.Centimeter.of(inch)).transform { it.toDouble() }.isEqualTo(2.54)
    }
}
