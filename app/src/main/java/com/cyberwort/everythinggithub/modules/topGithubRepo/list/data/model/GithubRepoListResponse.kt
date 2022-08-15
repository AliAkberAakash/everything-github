package com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.model

data class GithubRepoListResponse (
    val totalCount: Long? = null,
    val incompleteResults: Boolean? = null,
    val items: List<GithubRepo>? = null
)