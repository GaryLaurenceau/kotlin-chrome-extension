object Deps {

    object Gradle {
        private const val KOTLIN_VERSION = "1.8.0"
        const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
        private const val COMPOSE_VERSION = "1.3.0"
        const val composePlugin = "org.jetbrains.compose:compose-gradle-plugin:$COMPOSE_VERSION"
    }

    object Kotlin {
        private const val SERIALIZATION_VERSION = "1.5.0"
        const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:$SERIALIZATION_VERSION"

        object Coroutines {
            private const val VERSION = "1.6.4"
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${VERSION}"
            const val core_js = "org.jetbrains.kotlinx:kotlinx-coroutines-core-js:${VERSION}"
        }
    }

    object Network {
        object Ktor {
            private const val VERSION = "2.2.3"
            // Client
            const val client_core = "io.ktor:ktor-client-core:$VERSION"
            const val client_okhttp = "io.ktor:ktor-client-okhttp:$VERSION"
            const val client_js = "io.ktor:ktor-client-js:$VERSION"
            const val client_logging = "io.ktor:ktor-client-logging:$VERSION"
            const val client_json = "io.ktor:ktor-client-json:$VERSION"
            const val client_auth = "io.ktor:ktor-client-auth:$VERSION"
            const val client_serialization = "io.ktor:ktor-client-serialization:$VERSION"
            const val client_content_negotiation = "io.ktor:ktor-client-content-negotiation:$VERSION"
            const val client_cio = "io.ktor:ktor-client-cio:$VERSION"
            // Utils
            const val json = "io.ktor:ktor-serialization-kotlinx-json:$VERSION"
            // Test
            const val client_test = "io.ktor:ktor-client-mock:$VERSION"
        }
    }
}