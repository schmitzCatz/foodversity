package net.octosystems.foodversity.model.units.volume

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class MilliLiterTest {

    @Test
    fun `Symbol of MilliLiter should be 'ml'`() {
        assertThat(net.octosystems.foodversity.model.common.units.volume.MilliLiter.of(5).getSymbol().toString()).isEqualTo("ml")
    }

    @Test
    fun `Conversion of 1 CubicMeter to MilliLiter is 1000000`() {
        val cubicMeter = net.octosystems.foodversity.model.common.units.volume.CubicMeter.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.volume.MilliLiter.of(cubicMeter)).transform { it.toDouble() }.isEqualTo(1000000.0)
    }

    @Test
    fun `Conversion of 1 MilliLiter to Liter is 1000`() {
        val l = net.octosystems.foodversity.model.common.units.volume.Liter.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.volume.MilliLiter.of(l)).transform { it.toDouble() }.isEqualTo(1000.0)
    }

    @Test
    fun `Conversion of 1 TeaSpoon to MilliLiter is 4,9289`() {
        val tsp = net.octosystems.foodversity.model.common.units.volume.TeaSpoon.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.volume.MilliLiter.of(tsp)).transform { it.toDouble() }.isEqualTo(5.0)
    }

    @Test
    fun `Conversion of 1 TableSpoon to MilliLiter is 14,7868`() {
        val tbs = net.octosystems.foodversity.model.common.units.volume.TableSpoon.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.volume.MilliLiter.of(tbs)).transform { it.toDouble() }.isEqualTo(15.0)
    }
}
