plugins {
    id("java-platform")
}

group = "net.octosystems.foodversity.platform"

javaPlatform.allowDependencies()

dependencies {
    api(platform("org.springframework.boot:spring-boot-dependencies:2.7.5"))

    constraints {
        api("org.liquibase:liquibase-core:4.19.1")
    }
}
