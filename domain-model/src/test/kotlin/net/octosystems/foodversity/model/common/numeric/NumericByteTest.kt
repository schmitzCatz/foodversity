package net.octosystems.foodversity.model.common.numeric

import assertk.assertAll
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test
import kotlin.math.pow

class NumericByteTest {

    @Test
    fun `Unary Plus of Numeric has same result as Byte implementation`() {
        assertThat(NumericByte(5).unaryPlus()).transform { it.toInt() }.isEqualTo(5.unaryPlus())
    }

    @Test
    fun `Unary Minus of Numeric has same result as Byte implementation`() {
        assertThat(NumericByte(5).unaryMinus()).transform { it.toInt() }.isEqualTo(5.unaryMinus())
    }

    @Test
    fun `Increment of Numeric has same result as Byte implementation`() {
        assertThat(NumericByte(5).inc()).transform { it.toByte() }.isEqualTo((5.toByte()).inc())
    }

    @Test
    fun `Decrement of Numeric has same result as Byte implementation`() {
        assertThat(NumericByte(5).dec()).transform { it.toByte() }.isEqualTo((5.toByte()).dec())
    }

    @Test
    fun `Subtraction of Numeric has same result as Byte implementation`() {
        assertThat(NumericByte(5) - NumericByte(4)).transform { it.toInt() }.isEqualTo(5 - 4)
    }

    @Test
    fun `Addition of Numeric has same result as Byte implementation`() {
        assertThat(NumericByte(5) + NumericByte(4)).transform { it.toInt() }.isEqualTo(5 + 4)
    }

    @Test
    fun `Multiplication of Numeric has same result as Byte implementation`() {
        assertThat(NumericByte(5) * NumericByte(4)).transform { it.toInt() }.isEqualTo(5 * 4)
    }

    @Test
    fun `Division of Numeric has same result as Byte implementation`() {
        assertThat(NumericByte(5) / NumericByte(4)).transform { it.toInt() }.isEqualTo(5 / 4)
    }

    @Test
    fun `Mod of Numeric has same result as Byte implementation`() {
        assertThat(NumericByte(5) % NumericByte(4)).transform { it.toInt() }.isEqualTo(5 % 4)
    }

    @Test
    fun `Power of Numeric has same result as Byte implementation`() {
        assertThat(
            NumericByte(5).pow(NumericByte(4)),
        )
            .transform { it.toDouble() }
            .isEqualTo(
                5.toDouble().pow((4).toDouble()),
            )
    }

    @Test
    fun `Comparison of Numeric has same result as Byte implementation`() {
        assertAll {
            assertThat(NumericByte(5) == (NumericByte(5))).isEqualTo(5 == 5)
            assertThat(NumericByte(5) > (NumericByte(5))).isEqualTo(5 > 5)
            assertThat(NumericByte(6) > (NumericByte(5))).isEqualTo(6 > 5)
            assertThat(NumericByte(5) < (NumericByte(5))).isEqualTo(5 < 5)
            assertThat(NumericByte(4) < (NumericByte(5))).isEqualTo(4 < 5)
        }
    }
}
