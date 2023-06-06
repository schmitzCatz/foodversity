package net.octosystems.foodversity.model.common.units

import net.octosystems.foodversity.model.common.numeric.Numeric

/** A Unit for a measurement. Contains a [UnitSymbol] and a [Numeric] value. */
interface UnitOfMeasure {

    /** Returns the [UnitSymbol] for a [UnitOfMeasure] */
    fun getSymbol(): net.octosystems.foodversity.model.common.units.UnitSymbol

    /** Returns a [Number] value for a [UnitOfMeasure] */
    fun getValue(): Number
}
