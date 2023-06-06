package net.octosystems.foodversity.model.user.person

import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.time.temporal.Temporal

@JvmInline
value class DayOfBirth(val value: Instant) : Temporal by value {
    init {
        require(value.isAfter(Instant.parse("1900-01-01T00:00:00.00Z"))) {
            "'$value' Should be after 1900"
        }
        require(value.isBefore(Instant.now())) {
            "'$value' Should be before today!"
        }
    }

    companion object {
        fun of(value: LocalDate, zone: ZoneId = ZoneId.systemDefault()) = DayOfBirth(value.atStartOfDay(zone).toInstant())
        fun of(value: String) = of(LocalDate.parse(value))
    }
}
