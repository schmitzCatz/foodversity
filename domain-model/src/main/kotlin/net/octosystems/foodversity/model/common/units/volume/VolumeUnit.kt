package net.octosystems.foodversity.model.common.units.volume

import net.octosystems.foodversity.model.common.units.UnitOfMeasure

interface VolumeUnit : net.octosystems.foodversity.model.common.units.UnitOfMeasure {

    /** International System of Units for volume. */
    fun toCubicMeter(): net.octosystems.foodversity.model.common.units.volume.CubicMeter

    /** [Liter] is a metric unit for volume. */
    fun toLiter(): net.octosystems.foodversity.model.common.units.volume.Liter

    /** [MilliLiter] is a metric unit for volume */
    fun toMilliLiter(): net.octosystems.foodversity.model.common.units.volume.MilliLiter

    /** An international metric tablespoon is exactly equal to 5 ml */
    fun toTeaSpoon(): net.octosystems.foodversity.model.common.units.volume.TeaSpoon

    /** An international metric tablespoon is exactly equal to 15 ml */
    fun toTableSpoon(): net.octosystems.foodversity.model.common.units.volume.TableSpoon
}
