package net.octosystems.foodversity.model.user

import net.octosystems.foodversity.model.common.CrudRepository
import java.util.UUID

interface UserRepository : CrudRepository<UUID, User> {

}
