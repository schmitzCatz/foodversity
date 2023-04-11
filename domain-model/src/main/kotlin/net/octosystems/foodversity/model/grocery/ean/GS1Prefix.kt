package net.octosystems.foodversity.model.grocery.ean

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.PositiveNumber
import java.text.DecimalFormat

@JvmInline
value class GS1Prefix(val value: PositiveNumber): Numeric by value {
    override fun toString(): String = DecimalFormat("###").format(value.toInt())
}