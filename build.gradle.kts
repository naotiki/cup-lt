import org.jetbrains.compose.reload.ComposeHotRun
import org.jetbrains.kotlin.compose.compiler.gradle.ComposeFeatureFlag

repositories {
    maven("https://packages.jetbrains.team/maven/p/firework/dev")
}

plugins {
    kotlin("multiplatform")
    kotlin("plugin.compose")
    id("org.jetbrains.compose")
    id("org.jetbrains.compose-hot-reload")
    id("net.kodein.cup") version "1.0.0-Beta-09"
}
java{
    toolchain {
        vendor.set(JvmVendorSpec.JETBRAINS)
        version=JavaLanguageVersion.of(21)
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}
cup {
    targetDesktop()

    // TODO: If you comment this (you don't want to export your presentation as a web page),
    //  you must remove the .github/workflows/pages.yml file as well.
    targetWeb()
}
composeCompiler {
    featureFlags.add(ComposeFeatureFlag.OptimizeNonSkippingGroups)
}

tasks.register<ComposeHotRun>("runHot") {
    mainClass.set("MainKt")
}

kotlin {
    sourceSets.commonMain {
        dependencies {
            // Includes Source Code highlighting & animations.
            implementation(cup.sourceCode)

            // TODO: Select plugins (comment or uncomment function of your needs)

            // Secondary window with preview & speaker notes.
            implementation(cup.plugin.speakerWindow)

            // Allows to draw over the presentation on the main window.
            // This tool is also part of the Speaker Mode window.
            implementation(cup.plugin.laser)

            // TODO: Select material or material3 (for composables such as Text).
//            implementation(compose.material)
//            implementation(cup.widgets.material)
            implementation(compose.material3)
            implementation(cup.widgets.material3)

//            implementation("org.kodein.emoji:emoji-compose-m2:2.1.0")
            implementation("org.kodein.emoji:emoji-compose-m3:2.0.1")
            /*
            *             implementation("io.sellmair:evas:1.1.0")
                    implementation("io.sellmair:evas-compose:1.1.0")
            * */
        }
    }
}
