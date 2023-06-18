package net.octosystems.foodversity.model.common

interface CrudRepository<Identifier, Entity> {

    fun create(entity: Entity): Entity
    fun read(identifier: Identifier): Entity
    fun update(entity: Entity)
    fun delete(identifier: Identifier)
    fun delete(entity: Entity)

}