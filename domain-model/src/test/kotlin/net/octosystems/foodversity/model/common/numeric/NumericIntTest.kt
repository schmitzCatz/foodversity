package net.octosystems.foodversity.model.common.numeric

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test
import kotlin.math.pow

class NumericIntTest {
    @Test
    fun `Unary Plus of Numeric has same result as Int implementation`() {
        assertThat(NumericInt(5).unaryPlus()).transform { it.toInt() }.isEqualTo(5.unaryPlus())
    }

    @Test
    fun `Unary Minus of Numeric has same result as Int implementation`() {
        assertThat(NumericInt(5).unaryMinus()).transform { it.toInt() }.isEqualTo(5.unaryMinus())
    }

    @Test
    fun `Increment of Numeric has same result as Int implementation`() {
        assertThat(NumericInt(5).inc()).transform { it.toInt() }.isEqualTo(5.inc())
    }

    @Test
    fun `Decrement of Numeric has same result as Int implementation`() {
        assertThat(NumericInt(5).dec()).transform { it.toInt() }.isEqualTo(5.dec())
    }

    @Test
    fun `Subtraction of Numeric has same result as Int implementation`() {
        assertThat(NumericInt(5) - NumericInt(4)).transform { it.toInt() }.isEqualTo(5 - 4)
    }

    @Test
    fun `Addition of Numeric has same result as Int implementation`() {
        assertThat(NumericInt(5) + NumericInt(4)).transform { it.toInt() }.isEqualTo(5 + 4)
    }

    @Test
    fun `Multiplication of Numeric has same result as Int implementation`() {
        assertThat(NumericInt(5) * NumericInt(4)).transform { it.toInt() }.isEqualTo(5 * 4)
    }

    @Test
    fun `Division of Numeric has same result as Int implementation`() {
        assertThat(NumericInt(5) / NumericInt(4)).transform { it.toInt() }.isEqualTo(5 / 4)
    }

    @Test
    fun `Mod of Numeric has same result as Int implementation`() {
        assertThat(NumericInt(5) % NumericInt(4)).transform { it.toInt() }.isEqualTo(5 % 4)
    }

    @Test
    fun `Power of Numeric has same result as Int implementation`() {
        assertThat(
            NumericInt(5).pow(NumericInt(4)),
        )
            .transform { it.toDouble() }
            .isEqualTo(
                5.toDouble().pow(4.toDouble()),
            )
    }

    @Test
    fun `Comparison of Numeric has same result as Int implementation`() {
        assertk.assertAll {
            assertThat(NumericInt(5) == (NumericInt(5))).isEqualTo(5 == 5)
            assertThat(NumericInt(5) > (NumericInt(5))).isEqualTo(5 > 5)
            assertThat(NumericInt(6) > (NumericInt(5))).isEqualTo(6 > 5)
            assertThat(NumericInt(5) < (NumericInt(5))).isEqualTo(5 < 5)
            assertThat(NumericInt(4) < (NumericInt(5))).isEqualTo(4 < 5)
        }
    }
}
