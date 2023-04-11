plugins {
    id("java-platform")
}

group = "net.octosystems.foodversity.platform"

dependencies {
    constraints {
        api("io.arrow-kt:arrow-core:1.1.5")
        api("com.android.tools.build:gradle:7.3.1")
        api("org.jetbrains.kotlin.android:org.jetbrains.kotlin.android.gradle.plugin:1.8.10")
        api("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:1.8.10")
        api("org.springframework.boot:org.springframework.boot.gradle.plugin:2.7.5")
    }
}
