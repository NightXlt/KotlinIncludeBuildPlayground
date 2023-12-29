import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("groovy")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(localGroovy())
}

afterEvaluate {
    tasks.named("compileGroovy", GroovyCompile::class.java).configure {
        this.classpath = sourceSets.main.get().compileClasspath
    }
    tasks.named("compileKotlin", KotlinCompile::class.java).configure {
        libraries.from(tasks.named("compileGroovy", GroovyCompile::class.java).get().destinationDirectory)
    }
}