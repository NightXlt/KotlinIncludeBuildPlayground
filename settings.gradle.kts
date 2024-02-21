import org.gradle.initialization.IncludedBuildSpec

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "KotlinIncludeBuildPlayground"

val initScriptFile = File("${rootDir}/gradle/init.gradle.kts")
apply(from = initScriptFile.absolutePath)

includeBuild("framework")
includeBuild("common")
includeBuild("framework/networks")

include(":app")


settings.gradle.startParameter.initScripts = settings.gradle.startParameter.initScripts + initScriptFile

gradle.extra.set("isSyncStage", isSyncStage())

fun isSyncStage(): Boolean {
    val fromIde = gradle.startParameter.projectProperties["android.injected.invoked.from.ide"]?.toBoolean()
    return fromIde == true && gradle.startParameter.taskNames.isEmpty()
}