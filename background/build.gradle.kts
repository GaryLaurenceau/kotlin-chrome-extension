plugins {
    kotlin("js")
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(project(":chrome"))
    implementation(project(":data"))
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
