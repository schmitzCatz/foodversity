package net.octosystems.foodversity.model.person

import net.octosystems.foodversity.model.units.length.Meter

data class Details(
    val dayOfBirth: DayOfBirth,
    val sex: Sex,
    val height: Meter,
)