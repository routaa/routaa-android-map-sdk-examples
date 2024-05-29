pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url  = uri("https://repo.routaa.ir/repository/maven-routaa-public")
            credentials {
                username = System.getenv("ROUTAA_MAVEN_USERNAME") as String
                password = System.getenv("ROUTAA_MAVEN_PASSWORD") as String
            }
        }
    }
}

rootProject.name = "Routaa-Map Android SDK Examples"
include(":app")
 
