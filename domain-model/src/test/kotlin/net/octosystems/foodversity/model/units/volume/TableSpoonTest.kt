package net.octosystems.foodversity.model.units.volume

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class TableSpoonTest {

    @Test
    fun `Symbol of TableSpoon should be 'ml'`() {
        assertThat(net.octosystems.foodversity.model.common.units.volume.TableSpoon.of(5).getSymbol().toString()).isEqualTo("tsp")
    }

    @Test
    fun `Conversion of 1 CubicMeter to TableSpoon is 67628,03`() {
        val cubicMeter = net.octosystems.foodversity.model.common.units.volume.CubicMeter.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.volume.TableSpoon.of(cubicMeter)).transform { it.toDouble() }.isEqualTo(67628.03)
    }

    @Test
    fun `Conversion of 1 MilliLiter to TableSpoon is 0,067628`() {
        val ml = net.octosystems.foodversity.model.common.units.volume.MilliLiter.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.volume.TableSpoon.of(ml)).transform { it.toDouble() }.isEqualTo(0.067628)
    }

    @Test
    fun `Conversion of 1 TeaSpoon to TableSpoon is 0,333333`() {
        val tsp = net.octosystems.foodversity.model.common.units.volume.TeaSpoon.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.volume.TableSpoon.of(tsp)).transform { it.toDouble() }.isEqualTo(0.333333)
    }

    @Test
    fun `Conversion of 1 Liter to TableSpoon is 67,628`() {
        val l = net.octosystems.foodversity.model.common.units.volume.Liter.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.volume.TableSpoon.of(l)).transform { it.toDouble() }.isEqualTo(67.628)
    }
}
