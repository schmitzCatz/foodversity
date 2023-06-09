package net.octosystems.foodversity.model.user

import net.octosystems.foodversity.model.person.Person

data class User(
    val person: Person,
    val credentials: Credentials,
    val profile: UserProfile
)
