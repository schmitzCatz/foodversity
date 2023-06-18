plugins {
    id("net.octosystems.foodversity.commons")
    id("org.jetbrains.kotlin.jvm")
    id("java-library")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
    runtimeOnly("org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm")
}
