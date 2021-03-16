import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension // <- this works

plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:1.4.31")
}