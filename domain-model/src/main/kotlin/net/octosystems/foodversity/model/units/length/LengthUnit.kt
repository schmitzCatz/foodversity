package net.octosystems.foodversity.model.units.length

import net.octosystems.foodversity.model.units.UnitOfMeasure

/**
 * Interface of length units
 */
interface LengthUnit : UnitOfMeasure {

    /**
     * Converts Unit to reference unit [Meter]
     * @return Unit value converted to [Meter]
     */
    fun toMeter(): Meter

    /**
     * Converts Unit to [Centimeter]
     * @return Unit value converted to [Centimeter]
     */
    fun toCentimeter(): Centimeter

    /**
     * Converts Unit to [Inch]
     * @return Unit value converted to [Inch]
     */
    fun toInch(): Inch
}
