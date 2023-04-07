plugins {
    kotlin("js")
    id("org.jetbrains.compose")
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(project(":chrome"))
    implementation(project(":data"))
    implementation(compose.web.core)
    implementation(compose.runtime)
    implementation(Deps.Kotlin.serialization)
}

kotlin {
    js(IR) {
        binaries.executable()
        browser {
            distribution {
                directory = File("$rootDir/build/distributions/")
            }
        }
    }
}
