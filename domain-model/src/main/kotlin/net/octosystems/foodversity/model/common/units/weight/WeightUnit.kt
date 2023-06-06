package net.octosystems.foodversity.model.common.units.weight

import net.octosystems.foodversity.model.common.units.UnitOfMeasure

/**
 * Interface of weight units
 */
interface WeightUnit : net.octosystems.foodversity.model.common.units.UnitOfMeasure {

    /**
     * Converts Unit to [Gram]
     * @return Unit value converted to [Gram]
     */
    fun toGram(): net.octosystems.foodversity.model.common.units.weight.Gram

    /**
     * Converts Unit to reverence unit [Kilogram]
     * @return Unit value converted to [Kilogram]
     */
    fun toKilogram(): net.octosystems.foodversity.model.common.units.weight.Kilogram

    /**
     * Converts Unit to [Milligram]
     * @return Unit value converted to [Milligram]
     */
    fun toMilligram(): net.octosystems.foodversity.model.common.units.weight.Milligram

    /**
     * Converts Unit to [Pound]
     * @return Unit value converted to [Pound]
     */
    fun toPound(): net.octosystems.foodversity.model.common.units.weight.Pound
}
