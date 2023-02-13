pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "News"
include(":app")
include(":core:designsystem")
include(":core:model")
include(":core:ui")
include(":core:domain")
include(":niacatalog")
