plugins {
    `java`
    `java-library`
    `maven-publish`
}

group = "dev.dubsky"
version = "0.1.3"
description = "A library that offers neat logging utilities like color-coding, pre-formatting etc."

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    api(libs.commons.math3)
    implementation(libs.guava)
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/DubskySteam/AdvancedLog")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
            }
        }
    }
    publications {
        register<MavenPublication>("gpr") {
            from(components["java"])

            pom {
                name.set("AdvancedLog")
                description.set(project.description)
                url.set("https://github.com/DubskySteam/AdvancedLog")
                licenses {
                    license {
                        name.set("GNU General Public License v3.0")
                        url.set("https://www.gnu.org/licenses/gpl-3.0.html")
                        distribution.set("repo")
                    }
                }
                developers {
                    developer {
                        id.set("DubskySteam")
                        name.set("DubskySteam")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/DubskySteam/AdvancedLog.git")
                    developerConnection.set("scm:git:ssh://github.com:DubskySteam/AdvancedLog.git")
                    url.set("https://github.com/DubskySteam/AdvancedLog")
                }
            }
        }
    }
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter("5.10.2")
        }
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}
