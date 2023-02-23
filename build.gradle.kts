/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds/
 */

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
  kotlin("jvm") version "1.4.31"
  id("com.github.johnrengelman.shadow") version "6.1.0"
  java
}

repositories {

  mavenCentral()

  jcenter()

  maven {
    url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
  }
  maven {
    url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
    url = uri("https://jitpack.io")

  }
}

dependencies {
  implementation(kotlin("stdlib"))
  implementation("org.reflections:reflections:0.10.2")
  implementation("com.github.retrooper:packetevents:1.8.4")
  implementation("com.maxmind.geoip2:geoip2:2.0.0")
  implementation("org.apache.commons:commons-math3:3.5")
  implementation("org.spigotmc:spigot-api:1.17-R0.1-SNAPSHOT")

}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "1.8"
}
