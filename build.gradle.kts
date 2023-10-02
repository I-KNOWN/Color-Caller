buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.1")
        classpath ("org.jetbrains.kotlin:kotlin-annotation-processing-gradle:1.8.10")
    }
    repositories {
        google()
        mavenCentral()
    }
}

plugins {
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
//    base
}

subprojects {
    repositories {
        mavenCentral()
        google()
        jcenter()
        maven { url = uri("https://www.jitpack.io" ) }
        maven { url = uri("https://plugins.gradle.org/m2/")}
    }


}