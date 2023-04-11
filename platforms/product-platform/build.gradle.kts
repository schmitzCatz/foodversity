plugins {
    id("java-platform")
}

group = "net.octosystems.foodversity.platform"

javaPlatform.allowDependencies()

dependencies {
    api(platform("org.springframework.boot:spring-boot-dependencies:2.7.5"))

    constraints {
        api("org.apache.juneau:juneau-marshall:8.2.0")
    }
}
