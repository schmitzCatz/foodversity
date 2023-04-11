plugins {
    id("java")
    id("net.octosystems.foodversity.jacoco")
}

group = "net.octosystems.foodversity"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

dependencies {
    implementation(platform("net.octosystems.foodversity.platform:product-platform"))

    testImplementation(platform("net.octosystems.foodversity.platform:test-platform"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.willowtreeapps.assertk:assertk-jvm")
}

tasks.test {
    useJUnitPlatform()
}
