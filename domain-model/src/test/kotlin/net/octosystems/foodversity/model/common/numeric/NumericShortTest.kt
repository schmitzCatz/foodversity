package net.octosystems.foodversity.model.common.numeric

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test
import kotlin.math.pow

class NumericShortTest {

    @Test
    fun `Unary Plus of Numeric has same result as Short implementation`() {
        assertThat(NumericShort(5).unaryPlus()).transform { it.toInt() }.isEqualTo(5.unaryPlus())
    }

    @Test
    fun `Unary Minus of Numeric has same result as Short implementation`() {
        assertThat(NumericShort(5).unaryMinus()).transform { it.toInt() }.isEqualTo(5.unaryMinus())
    }

    @Test
    fun `Increment of Numeric has same result as Short implementation`() {
        assertThat(NumericShort(5).inc()).transform { it.toShort() }.isEqualTo(5.toShort().inc())
    }

    @Test
    fun `Decrement of Numeric has same result as Short implementation`() {
        assertThat(NumericShort(5).dec()).transform { it.toShort() }.isEqualTo(5.toShort().dec())
    }

    @Test
    fun `Subtraction of Numeric has same result as Short implementation`() {
        assertThat(NumericShort(5) - NumericShort(4)).transform { it.toInt() }.isEqualTo(5 - 4)
    }

    @Test
    fun `Addition of Numeric has same result as Short implementation`() {
        assertThat(NumericShort(5) + NumericShort(4)).transform { it.toInt() }.isEqualTo(5 + 4)
    }

    @Test
    fun `Multiplication of Numeric has same result as Short implementation`() {
        assertThat(NumericShort(5) * NumericShort(4)).transform { it.toInt() }.isEqualTo(5 * 4)
    }

    @Test
    fun `Division of Numeric has same result as Short implementation`() {
        assertThat(NumericShort(5) / NumericShort(4)).transform { it.toInt() }.isEqualTo(5 / 4)
    }

    @Test
    fun `Mod of Numeric has same result as Short implementation`() {
        assertThat(NumericShort(5) % NumericShort(4)).transform { it.toInt() }.isEqualTo(5 % 4)
    }

    @Test
    fun `Power of Numeric has same result as Short implementation`() {
        assertThat(
            NumericShort(5).pow(NumericShort(4)),
        )
            .transform { it.toDouble() }
            .isEqualTo(
                (5).toDouble().pow((4).toDouble()),
            )
    }

    @Test
    fun `Comparison of Numeric has same result as Short implementation`() {
        assertk.assertAll {
            assertThat(NumericShort(5) == (NumericShort(5))).isEqualTo(5 == 5)
            assertThat(NumericShort(5) > (NumericShort(5))).isEqualTo(5 > 5)
            assertThat(NumericShort(6) > (NumericShort(5))).isEqualTo(6 > 5)
            assertThat(NumericShort(5) < (NumericShort(5))).isEqualTo(5 < 5)
            assertThat(NumericShort(4) < (NumericShort(5))).isEqualTo(4 < 5)
        }
    }
}
