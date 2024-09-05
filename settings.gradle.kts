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
    }
}

rootProject.name = "EffectiveMobile"
include(":app")
include(":core_navigation")
include(":core_ui")
include(":auth")
include(":auth:feauture_auth")
include(":vacancies")
include(":vacancies:feature_vacancies")
include(":data")
include(":data:core_database")
include(":data:core_network")
include(":vacancies:core_vacancies")
include(":vacancies:core_vacancies:core_vacancies_api")
include(":vacancies:core_vacancies:core_vacancies_impl")
