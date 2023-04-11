package net.octosystems.foodversity.model.common.numeric

import assertk.assertAll
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test
import kotlin.math.pow

class NumericDoubleTest {
    @Test
    fun `Unary Plus of Numeric has same result as Double implementation`() {
        assertThat(NumericDouble(5.0).unaryPlus()).transform { it.toDouble() }.isEqualTo(5.0.unaryPlus())
    }

    @Test
    fun `Unary Minus of Numeric has same result as Double implementation`() {
        assertThat(NumericDouble(5.0).unaryMinus()).transform { it.toDouble() }.isEqualTo(5.0.unaryMinus())
    }

    @Test
    fun `Increment of Numeric has same result as Double implementation`() {
        assertThat(NumericDouble(5.0).inc()).transform { it.toDouble() }.isEqualTo(5.0.inc())
    }

    @Test
    fun `Decrement of Numeric has same result as Double implementation`() {
        assertThat(NumericDouble(5.0).dec()).transform { it.toDouble() }.isEqualTo(5.0.dec())
    }

    @Test
    fun `Subtraction of Numeric has same result as Double implementation`() {
        assertThat(NumericDouble(5.0) - NumericDouble(4.0)).transform { it.toDouble() }.isEqualTo(5.0 - 4.0)
    }

    @Test
    fun `Addition of Numeric has same result as Double implementation`() {
        assertThat(NumericDouble(5.0) + NumericDouble(4.0)).transform { it.toDouble() }.isEqualTo(5.0 + 4.0)
    }

    @Test
    fun `Multiplication of Numeric has same result as Double implementation`() {
        assertThat(NumericDouble(5.0) * NumericDouble(4.0)).transform { it.toDouble() }.isEqualTo(5.0 * 4.0)
    }

    @Test
    fun `Division of Numeric has same result as Double implementation`() {
        assertThat(NumericDouble(5.0) / NumericDouble(4.0)).transform { it.toDouble() }.isEqualTo(5.0 / 4.0)
    }

    @Test
    fun `Mod of Numeric has same result as Double implementation`() {
        assertThat(NumericDouble(5.0) % NumericDouble(4.0)).transform { it.toDouble() }.isEqualTo(5.0 % 4.0)
    }

    @Test
    fun `Power of Numeric has same result as Double implementation`() {
        assertThat(
            NumericDouble(5.0).pow(NumericDouble(4.0)),
        )
            .transform { it.toDouble() }
            .isEqualTo(
                (5.0).toDouble().pow((4.0).toDouble()),
            )
    }

    @Test
    fun `Comparison of Numeric has same result as Double implementation`() {
        assertAll {
            assertThat(NumericDouble(5.0) == (NumericDouble(5.0))).isEqualTo(5.0 == 5.0)
            assertThat(NumericDouble(5.0) > (NumericDouble(5.0))).isEqualTo(5.0 > 5.0)
            assertThat(NumericDouble(6.0) > (NumericDouble(5.0))).isEqualTo(6.0 > 5.0)
            assertThat(NumericDouble(5.0) < (NumericDouble(5.0))).isEqualTo(5.0 < 5.0)
            assertThat(NumericDouble(4.0) < (NumericDouble(5.0))).isEqualTo(4.0 < 5.0)
        }
    }
}
