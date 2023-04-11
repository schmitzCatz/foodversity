package net.octosystems.foodversity.model.user

import net.octosystems.foodversity.model.common.string.NotEmptyString

@JvmInline
value class Password(val value: NotEmptyString) : CharSequence by value {

    init {
        require(value.length > 7) {
            "'$value' should be at least 8 Characters long!"
        }
    }

    companion object {
        fun of(value: String) = Password(NotEmptyString(value))
    }
}
