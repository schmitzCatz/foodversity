package net.octosystems.foodversity.model.meal.recipe

import net.octosystems.foodversity.model.common.string.NotEmptyString

@JvmInline
value class Description(val value: NotEmptyString) {

    init {
        require(value.length < 255) {
            "'$value' is longer than 255 Characters"
        }
    }

    companion object {
        fun of(value: String) = Description(NotEmptyString(value))
    }
}
