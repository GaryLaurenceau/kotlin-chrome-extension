plugins {
    kotlin("js")
}

group = "com.template"
version = "0.1.0"

dependencies {
    implementation(project(":background"))
    implementation(project(":content"))
    implementation(project(":popup"))
}

kotlin {
    js(IR)
}

tasks {
    // Copy js scripts
    val background = ":background:browserDistribution"
    val content = ":content:browserDistribution"
    val popup = ":popup:browserDistribution"
    val extensionFolder = "$projectDir/build/extension"
    val copyBundleFile = register<Copy>("copyBundleFile") {
        dependsOn(background, content, popup)
        from(
            "$projectDir/../build/distributions/background.js",
            "$projectDir/../build/distributions/content.js",
            "$projectDir/../build/distributions/popup.js",
        )
        into(extensionFolder)
    }

    // Copy resources
    val copyResources = register<Copy>("copyResources") {
        val resourceFolder = "src/main/resources"
        from(
            "$resourceFolder/manifest.json",
            "$resourceFolder/icons",
            "$resourceFolder/html",
            "$resourceFolder/css"
        )
        into(extensionFolder)
    }

    // Build modules
    val buildExtension = register("buildExtension") {
        dependsOn(copyBundleFile, copyResources)
    }

    // Zip extension
    val packageExtension = register<Zip>("packageExtension") {
        dependsOn(buildExtension)
        from(extensionFolder)
    }
}
