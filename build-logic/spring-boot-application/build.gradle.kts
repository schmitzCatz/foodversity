plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(platform("net.octosystems.foodversity.platform:plugins-platform"))
    implementation(project(":commons"))
    implementation("org.springframework.boot:org.springframework.boot.gradle.plugin")
}
