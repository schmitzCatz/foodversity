package net.octosystems.foodversity.model.common.numeric

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

import kotlin.math.pow

class NumericLongTest {
    @Test
    fun `Unary Plus of Numeric has same result as Long implementation`() {
        assertThat(NumericLong(5).unaryPlus()).transform { it.toLong() }.isEqualTo(5L.unaryPlus())
    }

    @Test
    fun `Unary Minus of Numeric has same result as Long implementation`() {
        assertThat(NumericLong(5).unaryMinus()).transform { it.toLong() }.isEqualTo(5L.unaryMinus())
    }

    @Test
    fun `Increment of Numeric has same result as Long implementation`() {
        assertThat(NumericLong(5).inc()).transform { it.toLong() }.isEqualTo(5L.inc())
    }

    @Test
    fun `Decrement of Numeric has same result as Long implementation`() {
        assertThat(NumericLong(5).dec()).transform { it.toLong() }.isEqualTo(5L.dec())
    }

    @Test
    fun `Subtraction of Numeric has same result as Long implementation`() {
        assertThat(NumericLong(5) - NumericLong(4)).transform { it.toLong() }.isEqualTo(5 - 4)
    }

    @Test
    fun `Addition of Numeric has same result as Long implementation`() {
        assertThat(NumericLong(5) + NumericLong(4)).transform { it.toLong() }.isEqualTo(5 + 4)
    }

    @Test
    fun `Multiplication of Numeric has same result as Long implementation`() {
        assertThat(NumericLong(5) * NumericLong(4)).transform { it.toLong() }.isEqualTo(5 * 4)
    }

    @Test
    fun `Division of Numeric has same result as Long implementation`() {
        assertThat(NumericLong(5) / NumericLong(4)).transform { it.toLong() }.isEqualTo(5 / 4)
    }

    @Test
    fun `Mod of Numeric has same result as Long implementation`() {
        assertThat(NumericLong(5) % NumericLong(4)).transform { it.toLong() }.isEqualTo(5 % 4)
    }

    @Test
    fun `Power of Numeric has same result as Long implementation`() {
        assertThat(
            NumericLong(5).pow(NumericLong(4)),
        )
            .transform { it.toDouble() }
            .isEqualTo(
                (5).toDouble().pow((4).toDouble()),
            )
    }

    @Test
    fun `Comparison of Numeric has same result as Long implementation`() {
        assertk.assertAll {
            assertThat(NumericLong(5) == (NumericLong(5))).isEqualTo(5 == 5)
            assertThat(NumericLong(5) > (NumericLong(5))).isEqualTo(5 > 5)
            assertThat(NumericLong(6) > (NumericLong(5))).isEqualTo(6 > 5)
            assertThat(NumericLong(5) < (NumericLong(5))).isEqualTo(5 < 5)
            assertThat(NumericLong(4) < (NumericLong(5))).isEqualTo(4 < 5)
        }
    }
}