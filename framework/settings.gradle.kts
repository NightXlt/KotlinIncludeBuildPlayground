pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

if (gradle.parent == null) {
    val initScriptFile = File("${rootDir}/gradle/init.gradle.kts")
    includeBuild("networks")
    apply(from = initScriptFile.absolutePath)
    settings.gradle.startParameter.initScripts = settings.gradle.startParameter.initScripts + initScriptFile
}
include(":imageloader")

