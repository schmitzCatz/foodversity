package net.octosystems.foodversity.model.common.string

@JvmInline
value class NotEmptyString(val value: String) : CharSequence by value {
    init {
        require(value.isNotBlank()) {
            "'$value' should not be empty!"
        }
    }

    override fun toString(): String = value
}
