plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
}

kotlin {
    js(IR) {
        binaries.executable()
        browser {}
    }

    sourceSets {
        named("commonMain") {
            dependencies {
                implementation(Deps.Kotlin.serialization)
            }
        }
        named("jsMain") {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
    }
}
