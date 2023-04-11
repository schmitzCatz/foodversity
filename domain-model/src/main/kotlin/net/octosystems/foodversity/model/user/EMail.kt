package net.octosystems.foodversity.model.user

import net.octosystems.foodversity.model.common.string.NotEmptyString

@JvmInline
value class EMail(val value: NotEmptyString) : CharSequence by value {
    init {
        require(value.contains('@')) {
            "'$value' should contain @-Symbol!"
        }
    }

    companion object {
        fun of(value: String) = EMail(NotEmptyString(value))
    }
}
