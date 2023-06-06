package net.octosystems.foodversity.app.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
open class ServerApplication {

    @GetMapping
    fun index():String{
        return "Hello World!"
    }
}

fun main() {
    runApplication<ServerApplication>()
}