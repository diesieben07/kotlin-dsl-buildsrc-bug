import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension // <- this is an error

fun KotlinProjectExtension.configureMyKotlinStuff() {
    sourceSets.all {
        println("hooray! ")
    }
}