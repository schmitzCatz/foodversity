package net.octosystems.foodversity.model.event

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onEach

class EventBus {

    private val flow = MutableSharedFlow<Event>()
    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())

    suspend fun publish(event: Event) = flow.emit(event)
    fun subscribe(type: Class<Event>, subscriber: Subscriber<Event>) {
        flow.onEach { value -> subscriber.notify(value) }
            .onCompletion { }
            .catch { }
            .flowOn(Dispatchers.IO)
            .launchIn(scope)
    }
}
