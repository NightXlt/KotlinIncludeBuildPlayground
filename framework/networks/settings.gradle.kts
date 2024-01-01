pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

if (gradle.parent == null) {
    val initScriptFile = File("${rootDir}/gradle/init.gradle.kts")
    apply(from = initScriptFile.absolutePath)
}
include(":core")
include(":protobuf")