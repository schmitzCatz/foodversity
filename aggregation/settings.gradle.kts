rootProject.name = "aggregation"

includeBuild("../platforms")

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    includeBuild("../build-logic")
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include("test-coverage")
