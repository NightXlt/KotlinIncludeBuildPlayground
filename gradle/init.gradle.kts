
gradle.settingsEvaluated {
    this.dependencyResolutionManagement {
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