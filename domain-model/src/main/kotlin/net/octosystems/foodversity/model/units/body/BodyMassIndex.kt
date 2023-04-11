package net.octosystems.foodversity.model.units.body

import net.octosystems.foodversity.model.common.numeric.NumericDouble
import net.octosystems.foodversity.model.units.length.LengthUnit
import net.octosystems.foodversity.model.units.length.Meter
import net.octosystems.foodversity.model.units.weight.Kilogram
import net.octosystems.foodversity.model.units.weight.WeightUnit

/**
 * Body Mass Index calculated
 *
 * Metric calculation:
 *
 * `BMI = (Weight in Kilograms / (Height in Meters x Height in Meters))`
 */
data class BodyMassIndex(
    val weight: Kilogram,
    val height: Meter,
) {

    val value: NumericDouble
        get() = NumericDouble(weight / height.pow(2))

    companion object {
        fun of(weight: Double, height: Double) = BodyMassIndex(Kilogram.of(weight), Meter.of(height))
        fun of(weight: WeightUnit, height: LengthUnit) = BodyMassIndex(weight.toKilogram(), height.toMeter())
    }
}
