plugins {
    id("java-platform")
}
group = "net.octosystems.foodversity.platform"
javaPlatform.allowDependencies()

dependencies {
    api(platform("org.junit:junit-bom:5.7.1"))
    api(platform("com.willowtreeapps.assertk:assertk-jvm:0.25"))
}
