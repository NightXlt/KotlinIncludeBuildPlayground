import org.gradle.initialization.IncludedBuildSpec

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "KotlinIncludeBuildPlayground"

val initScriptFile = File("${rootDir}/gradle/init.gradle.kts")
apply(from = initScriptFile.absolutePath)

includeBuild("framework")
includeBuild("common")

include(":app")


settings.gradle.startParameter.initScripts = settings.gradle.startParameter.initScripts + initScriptFile