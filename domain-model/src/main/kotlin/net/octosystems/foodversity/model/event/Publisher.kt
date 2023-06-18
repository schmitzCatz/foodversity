package net.octosystems.foodversity.model.event

abstract class Publisher<T:Event>(private val eventBus: EventBus) {

    suspend fun publish(event:T) = eventBus.publish(event)
}