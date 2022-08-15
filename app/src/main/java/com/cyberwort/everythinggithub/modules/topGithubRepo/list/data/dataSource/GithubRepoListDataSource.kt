package com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.dataSource

import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.model.GithubRepoListResponse

interface GithubRepoListDataSource {
    suspend fun getGuithubRepoList() : GithubRepoListResponse
}