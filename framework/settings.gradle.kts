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
if (gradle.parent == null) {
    val initScriptFile = File("${rootDir}/gradle/init.gradle.kts")
    apply(from = initScriptFile.absolutePath)
}
include(":network")

