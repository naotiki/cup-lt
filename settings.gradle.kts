// TODO: Change the name of your project here
rootProject.name = "cup-lt"

pluginManagement {
    plugins {
        id("org.jetbrains.compose-hot-reload") version "1.0.0-dev.31.8"
    }

    repositories {
        maven("https://packages.jetbrains.team/maven/p/firework/dev")
        mavenCentral()
        gradlePluginPortal()
    }

    plugins {

        kotlin("multiplatform") version "2.1.0-firework.31"
        kotlin("plugin.compose") version "2.1.0-firework.31"
        id("org.jetbrains.compose") version "1.7.1"
    }
}



dependencyResolutionManagement {
    repositories {
        maven("https://packages.jetbrains.team/maven/p/firework/dev")
        mavenCentral()
        google()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}