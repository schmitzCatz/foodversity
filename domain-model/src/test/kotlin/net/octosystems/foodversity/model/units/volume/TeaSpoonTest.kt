package net.octosystems.foodversity.model.units.volume

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class TeaSpoonTest {

    @Test
    fun `Symbol of TeaSpoon should be 'ml'`() {
        assertThat(net.octosystems.foodversity.model.common.units.volume.TeaSpoon.of(5).getSymbol().toString()).isEqualTo("tbsp")
    }

    @Test
    fun `Conversion of 1 CubicMeter to TeaSpoon is 202884,1`() {
        val cubicMeter = net.octosystems.foodversity.model.common.units.volume.CubicMeter.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.volume.TeaSpoon.of(cubicMeter)).transform { it.toDouble() }.isEqualTo(202884.1)
    }

    @Test
    fun `Conversion of 1 MilliLiter to TeaSpoon is 0,202884`() {
        val ml = net.octosystems.foodversity.model.common.units.volume.MilliLiter.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.volume.TeaSpoon.of(ml)).transform { it.toDouble() }.isEqualTo(0.202884)
    }

    @Test
    fun `Conversion of 1 TableSpoon to TeaSpoon is 3`() {
        val tsp = net.octosystems.foodversity.model.common.units.volume.TableSpoon.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.volume.TeaSpoon.of(tsp)).transform { it.toDouble() }.isEqualTo(3.0433)
    }

    @Test
    fun `Conversion of 1 Liter to TeaSpoon is 202,88`() {
        val l = net.octosystems.foodversity.model.common.units.volume.Liter.of(1)
        assertThat(net.octosystems.foodversity.model.common.units.volume.TeaSpoon.of(l)).transform { it.toDouble() }.isEqualTo(202.88)
    }
}
