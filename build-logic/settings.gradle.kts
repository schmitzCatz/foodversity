rootProject.name = "build-logic"

dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}
includeBuild("../platforms")

include("commons")
include("kotlin-library")
include("report-aggregation")
include("spring-boot-application")
