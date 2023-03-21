val pluginName: String by project

plugins {
    `java-library`
    id("io.papermc.paperweight.userdev") version "1.3.3"
}

dependencies {
    paperDevBundle("1.19.4-R0.1-SNAPSHOT")

    compileOnly("com.github.TownyAdvanced:towny:0.97.5.0")
    compileOnly("me.confuser:BarAPI:3.5")
}

tasks {
    processResources {
        filesMatching("plugin.yml") {
            expand(mapOf(
                "name" to pluginName,
                "version" to version,
            ))
        }
    }
}
