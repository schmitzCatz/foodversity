package net.octosystems.foodversity.model.grocery.ean

import net.octosystems.foodversity.model.common.numeric.Numeric
import net.octosystems.foodversity.model.common.numeric.PositiveNumber

@JvmInline
value class ManufacturerCode(val value: PositiveNumber): Numeric by value