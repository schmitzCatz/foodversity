package net.octosystems.foodversity.model.common.location

import net.octosystems.foodversity.model.common.string.NotEmptyString

@JvmInline
value class StreetNumber(val value: NotEmptyString) : CharSequence by value