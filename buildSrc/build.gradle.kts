plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${rootProject.properties["kotlin.version"]}")
    implementation("org.jetbrains.kotlin:kotlin-serialization:${rootProject.properties["kotlin.version"]}")
    implementation("org.jetbrains.compose:compose-gradle-plugin:${rootProject.properties["compose.version"]}")
}
