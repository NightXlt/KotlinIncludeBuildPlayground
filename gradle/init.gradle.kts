
gradle.settingsEvaluated {
    this.dependencyResolutionManagement {
        repositories {
            google()
            mavenCentral()
        }
        versionCatalogs {
            create("common") {
                from(files("${rootDir.path}/gradle/common.versions.toml"))
            }
            create("framework") {
                from(files( "${rootDir.path}/gradle/framework.versions.toml"))
            }

        }
    }
}