package net.octosystems.foodversity.model.common.units.length

import net.octosystems.foodversity.model.common.units.UnitOfMeasure

/**
 * Interface of length units
 */
interface LengthUnit : net.octosystems.foodversity.model.common.units.UnitOfMeasure {

    /**
     * Converts Unit to reference unit [Meter]
     * @return Unit value converted to [Meter]
     */
    fun toMeter(): net.octosystems.foodversity.model.common.units.length.Meter

    /**
     * Converts Unit to [Centimeter]
     * @return Unit value converted to [Centimeter]
     */
    fun toCentimeter(): net.octosystems.foodversity.model.common.units.length.Centimeter

    /**
     * Converts Unit to [Inch]
     * @return Unit value converted to [Inch]
     */
    fun toInch(): net.octosystems.foodversity.model.common.units.length.Inch
}
