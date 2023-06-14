plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(platform("net.octosystems.foodversity.platform:plugins-platform"))
    implementation(project(":commons"))
    implementation("org.springframework.boot:org.springframework.boot.gradle.plugin")
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin")
}
