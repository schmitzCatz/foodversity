package net.octosystems.foodversity.model.units.weight

import net.octosystems.foodversity.model.units.UnitOfMeasure

/**
 * Interface of weight units
 */
interface WeightUnit : UnitOfMeasure {

    /**
     * Converts Unit to [Gram]
     * @return Unit value converted to [Gram]
     */
    fun toGram(): Gram

    /**
     * Converts Unit to reverence unit [Kilogram]
     * @return Unit value converted to [Kilogram]
     */
    fun toKilogram(): Kilogram

    /**
     * Converts Unit to [Milligram]
     * @return Unit value converted to [Milligram]
     */
    fun toMilligram(): Milligram

    /**
     * Converts Unit to [Pound]
     * @return Unit value converted to [Pound]
     */
    fun toPound(): Pound
}
