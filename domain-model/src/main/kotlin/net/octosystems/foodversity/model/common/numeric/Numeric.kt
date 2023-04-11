package net.octosystems.foodversity.model.common.numeric

import java.lang.IllegalStateException

interface Numeric : Comparable<Number> {

    operator fun unaryPlus(): Numeric
    operator fun unaryMinus(): Numeric

    operator fun inc(): Numeric
    operator fun dec(): Numeric

    operator fun minus(num: Numeric): Numeric
    operator fun minus(num: Number): Numeric

    operator fun plus(num: Numeric): Numeric
    operator fun plus(num: Number): Numeric

    operator fun times(num: Numeric): Numeric
    operator fun times(num: Number): Numeric

    operator fun div(num: Numeric): Numeric
    operator fun div(num: Number): Numeric

    operator fun rem(num: Numeric): Numeric
    operator fun rem(num: Number): Numeric

    operator fun compareTo(other: Numeric): Int
    override operator fun compareTo(other: Number): Int

    fun pow(num: Numeric): Numeric
    fun pow(num: Number): Numeric

    fun getValue(): Number

    fun toDouble(): Double
    fun toFloat(): Float
    fun toLong(): Long
    fun toInt(): Int
    fun toShort(): Short
    fun toByte(): Byte

    companion object {
        fun of(value: Number): Numeric = when (value) {
            is Byte -> NumericByte(value)
            is Short -> NumericShort(value)
            is Int -> NumericInt(value)
            is Long -> NumericLong(value)
            is Float -> NumericFloat(value)
            is Double -> NumericDouble(value)
            else -> throw IllegalStateException("Unknown type ${value::class.simpleName}")
        }
    }
}
