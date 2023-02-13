package com.hapkiduki.model.data

/**
 * Class summarizing user interest data
 */
data class UserData(
    val bookmarkedNewsResources: Set<String>,
    val followedTopics: Set<String>,
    val themeBrand: ThemeBrand,
    val darkThemeConfig: DarkThemeConfig,
    val useDynamicColor: Boolean,
    val shouldHideOnboarding: Boolean,
)