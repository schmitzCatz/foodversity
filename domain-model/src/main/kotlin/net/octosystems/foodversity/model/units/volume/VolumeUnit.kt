package net.octosystems.foodversity.model.units.volume

import net.octosystems.foodversity.model.units.UnitOfMeasure

interface VolumeUnit : UnitOfMeasure {

    /** International System of Units for volume. */
    fun toCubicMeter(): CubicMeter

    /** [Liter] is a metric unit for volume. */
    fun toLiter(): Liter

    /** [MilliLiter] is a metric unit for volume */
    fun toMilliLiter(): MilliLiter

    /** An international metric tablespoon is exactly equal to 5 ml */
    fun toTeaSpoon(): TeaSpoon

    /** An international metric tablespoon is exactly equal to 15 ml */
    fun toTableSpoon(): TableSpoon
}
