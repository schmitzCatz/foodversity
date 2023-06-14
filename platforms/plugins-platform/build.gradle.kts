plugins {
    id("java-platform")
}

group = "net.octosystems.foodversity.platform"

dependencies {
    constraints {
        api("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:1.8.22")
        api("org.springframework.boot:org.springframework.boot.gradle.plugin:2.7.5")
    }
}
