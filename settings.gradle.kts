rootProject.name = "Velocity"

pluginManagement {
    repositories {
        mavenLocal()
    }
}

if (File(rootDir, "Velocity").exists()) {
    includeBuild("Velocity")
}
