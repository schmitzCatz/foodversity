package net.octosystems.foodversity.model.user.person

import net.octosystems.foodversity.model.common.units.length.Meter

data class Details(
    val dayOfBirth: DayOfBirth,
    val sex: Sex,
    val height: net.octosystems.foodversity.model.common.units.length.Meter, //TODO: think about a measurement table?
)