package net.octosystems.foodversity.model.event

abstract class Subscriber<T : Event>(eventBus: EventBus) {

    abstract fun notify(event: T)
}
