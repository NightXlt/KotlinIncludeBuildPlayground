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
    println("includebuild framework")
    includeBuild("../framework")
}
include(":shared-logic")
include(":lib")