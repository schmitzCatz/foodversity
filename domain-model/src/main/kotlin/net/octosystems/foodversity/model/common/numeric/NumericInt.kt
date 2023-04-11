package net.octosystems.foodversity.model.common.numeric

import java.lang.IllegalStateException
import kotlin.math.pow

data class NumericInt(val value: Int) : Numeric {

    override fun unaryPlus(): Numeric = Numeric.of(value.unaryPlus())
    override fun unaryMinus(): Numeric = Numeric.of(value.unaryMinus())

    override fun inc(): Numeric = Numeric.of(value.inc())
    override fun dec(): Numeric = Numeric.of(value.dec())

    override fun minus(num: Numeric): Numeric = this.minus(num.getValue())
    override fun minus(num: Number): Numeric = Numeric.of(value.minus(num))

    override fun plus(num: Numeric): Numeric = this.plus(num.getValue())
    override fun plus(num: Number): Numeric = Numeric.of(value.plus(num))

    override fun times(num: Numeric): Numeric = this.times(num.getValue())
    override fun times(num: Number): Numeric = Numeric.of(value.times(num))

    override fun div(num: Numeric): Numeric = this.div(num.getValue())
    override fun div(num: Number): Numeric = Numeric.of(value.div(num))

    override fun rem(num: Numeric): Numeric = this.rem(num.getValue())
    override fun rem(num: Number): Numeric = Numeric.of(value.rem(num))

    override fun pow(num: Numeric): Numeric = this.pow(num.getValue())
    override fun pow(num: Number): Numeric = Numeric.of(value.toDouble().pow(num.toDouble()))

    override fun compareTo(other: Numeric): Int = this.compareTo(other.getValue())
    override fun compareTo(other: Number): Int = when (other) {
        is Byte -> value.compareTo(other)
        is Short -> value.compareTo(other)
        is Int -> value.compareTo(other)
        is Long -> value.compareTo(other)
        is Float -> value.compareTo(other)
        is Double -> value.compareTo(other)
        else -> throw IllegalStateException("Unknown type ${other::class.simpleName}")
    }

    override fun getValue(): Number = value

    override fun toDouble(): Double = value.toDouble()
    override fun toFloat(): Float = value.toFloat()
    override fun toLong(): Long = value.toLong()
    override fun toInt(): Int = value
    override fun toShort(): Short = value.toShort()
    override fun toByte(): Byte = value.toByte()
}

private fun Int.rem(num: Number): Number = when (num) {
    is Byte -> this.rem(num)
    is Short -> this.rem(num)
    is Int -> this.rem(num)
    is Long -> this.rem(num)
    is Float -> this.rem(num)
    is Double -> this.rem(num)
    else -> throw IllegalStateException("Unknown type ${num::class.simpleName}")
}

private fun Int.div(num: Number): Number = when (num) {
    is Byte -> this.div(num)
    is Short -> this.div(num)
    is Int -> this.div(num)
    is Long -> this.div(num)
    is Float -> this.div(num)
    is Double -> this.div(num)
    else -> throw IllegalStateException("Unknown type ${num::class.simpleName}")
}

private fun Int.times(num: Number): Number = when (num) {
    is Byte -> this.times(num)
    is Short -> this.times(num)
    is Int -> this.times(num)
    is Long -> this.times(num)
    is Float -> this.times(num)
    is Double -> this.times(num)
    else -> throw IllegalStateException("Unknown type ${num::class.simpleName}")
}

private fun Int.plus(num: Number): Number = when (num) {
    is Byte -> this.plus(num)
    is Short -> this.plus(num)
    is Int -> this.plus(num)
    is Long -> this.plus(num)
    is Float -> this.plus(num)
    is Double -> this.plus(num)
    else -> throw IllegalStateException("Unknown type ${num::class.simpleName}")
}

private fun Int.minus(num: Number): Number = when (num) {
    is Byte -> this.minus(num)
    is Short -> this.minus(num)
    is Int -> this.minus(num)
    is Long -> this.minus(num)
    is Float -> this.minus(num)
    is Double -> this.minus(num)
    else -> throw IllegalStateException("Unknown type ${num::class.simpleName}")
}
