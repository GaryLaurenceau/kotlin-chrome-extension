plugins {
    kotlin("js")
    kotlin("plugin.serialization")
}

dependencies {
    implementation(kotlin("stdlib-js"))
    api(Deps.Kotlin.serialization)
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
