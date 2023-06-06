package net.octosystems.foodversity.model.common.units.body

import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.common.units.length.LengthUnit
import net.octosystems.foodversity.model.common.units.length.Meter
import net.octosystems.foodversity.model.common.units.weight.Kilogram
import net.octosystems.foodversity.model.common.units.weight.WeightUnit

/**
 * Body Mass Index calculated
 *
 * Metric calculation:
 *
 * `BMI = (Weight in Kilograms / (Height in Meters x Height in Meters))`
 */
data class BodyMassIndex(
    val weight: net.octosystems.foodversity.model.common.units.weight.Kilogram,
    val height: net.octosystems.foodversity.model.common.units.length.Meter,
) {

    val value: NumericDouble
        get() = NumericDouble(weight / height.pow(2))

    companion object {
        fun of(weight: Double, height: Double) = net.octosystems.foodversity.model.common.units.body.BodyMassIndex(
            net.octosystems.foodversity.model.common.units.weight.Kilogram.of(weight),
            net.octosystems.foodversity.model.common.units.length.Meter.of(height)
        )
        fun of(weight: net.octosystems.foodversity.model.common.units.weight.WeightUnit, height: net.octosystems.foodversity.model.common.units.length.LengthUnit) =
            net.octosystems.foodversity.model.common.units.body.BodyMassIndex(weight.toKilogram(), height.toMeter())
    }
}
