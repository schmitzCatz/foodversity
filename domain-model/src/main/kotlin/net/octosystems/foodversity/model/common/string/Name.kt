package net.octosystems.foodversity.model.common.string

@JvmInline
value class Name(val value: NotEmptyString) : CharSequence by value {

    companion object {
        fun of(value: String) = Name(NotEmptyString(value))
    }
}
