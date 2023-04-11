package net.octosystems.foodversity.model.common.location

import net.octosystems.foodversity.model.common.numeric.PositiveNumber
import net.octosystems.foodversity.model.common.numeric.Numeric

@JvmInline
value class ZipCode(val value: PositiveNumber) : Numeric by value