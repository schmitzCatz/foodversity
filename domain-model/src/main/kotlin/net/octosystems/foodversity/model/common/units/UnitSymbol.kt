package net.octosystems.foodversity.model.common.units

import net.octosystems.foodversity.model.common.string.NotEmptyString

/** A unit symbol of a [UnitOfMeasure] */
@JvmInline
value class UnitSymbol(private val value: NotEmptyString) : CharSequence by value {

    override fun toString(): String = value.toString()

    companion object {
        fun of(value: String) = net.octosystems.foodversity.model.common.units.UnitSymbol(NotEmptyString(value))
    }
}
