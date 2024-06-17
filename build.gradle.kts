plugins {
    kotlin("jvm") version "1.9.23"
}

group = "dev.thelecrafter"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}

kotlin {
    jvmToolchain(21)
}