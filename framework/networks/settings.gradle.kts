pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

val rootGradle = gradle.parent
if (rootGradle == null) {
    val initScriptFile = File("${rootDir}/gradle/init.gradle.kts")
    apply(from = initScriptFile.absolutePath)
}
include(":core")
include(":protobuf")

val extra = rootGradle?.extra
val isSyncStage = extra?.has("isSyncStage") ?: false && extra?.get("isSyncStage") as Boolean
if (isSyncStage) {
    println("create sync task")
    gradle.rootProject {
        val task = tasks.register("syncTask")
    }
}