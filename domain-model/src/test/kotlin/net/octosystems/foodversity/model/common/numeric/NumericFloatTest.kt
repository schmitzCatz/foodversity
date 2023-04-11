package net.octosystems.foodversity.model.common.numeric

import assertk.assertAll
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test
import kotlin.math.pow

class NumericFloatTest {
    @Test
    fun `Unary Plus of Numeric has same result as Float implementation`() {
        assertThat(NumericFloat(5f).unaryPlus()).transform { it.toFloat() }.isEqualTo(5f.unaryPlus())
    }

    @Test
    fun `Unary Minus of Numeric has same result as Float implementation`() {
        assertThat(NumericFloat(5f).unaryMinus()).transform { it.toFloat() }.isEqualTo(5f.unaryMinus())
    }

    @Test
    fun `Increment of Numeric has same result as Float implementation`() {
        assertThat(NumericFloat(5f).inc()).transform { it.toFloat() }.isEqualTo(5f.inc())
    }

    @Test
    fun `Decrement of Numeric has same result as Float implementation`() {
        assertThat(NumericFloat(5f).dec()).transform { it.toFloat() }.isEqualTo(5f.dec())
    }

    @Test
    fun `Subtraction of Numeric has same result as Float implementation`() {
        assertThat(NumericFloat(5f) - NumericFloat(4f)).transform { it.toFloat() }.isEqualTo(5f - 4f)
    }

    @Test
    fun `Addition of Numeric has same result as Float implementation`() {
        assertThat(NumericFloat(5f) + NumericFloat(4f)).transform { it.toFloat() }.isEqualTo(5f + 4f)
    }

    @Test
    fun `Multiplication of Numeric has same result as Float implementation`() {
        assertThat(NumericFloat(5f) * NumericFloat(4f)).transform { it.toFloat() }.isEqualTo(5f * 4f)
    }

    @Test
    fun `Division of Numeric has same result as Float implementation`() {
        assertThat(NumericFloat(5f) / NumericFloat(4f)).transform { it.toFloat() }.isEqualTo(5f / 4f)
    }

    @Test
    fun `Mod of Numeric has same result as Float implementation`() {
        assertThat(NumericFloat(5f) % NumericFloat(4f)).transform { it.toFloat() }.isEqualTo(5f % 4f)
    }

    @Test
    fun `Power of Numeric has same result as Float implementation`() {
        assertThat(
            NumericFloat(5f).pow(NumericFloat(4f)),
        )
            .transform { it.toDouble() }
            .isEqualTo(
                (5f).toDouble().pow((4f).toDouble()),
            )
    }

    @Test
    fun `Comparison of Numeric has same result as Float implementation`() {
        assertAll {
            assertThat(NumericFloat(5f) == (NumericFloat(5f))).isEqualTo(5f == 5f)
            assertThat(NumericFloat(5f) > (NumericFloat(5f))).isEqualTo(5f > 5f)
            assertThat(NumericFloat(6f) > (NumericFloat(5f))).isEqualTo(6f > 5f)
            assertThat(NumericFloat(5f) < (NumericFloat(5f))).isEqualTo(5f < 5f)
            assertThat(NumericFloat(4f) < (NumericFloat(5f))).isEqualTo(4f < 5f)
        }
    }
}
