package com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.repository

import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.model.GithubRepoListResponse

interface GithubRepoListRepository {
    suspend fun getGithubRepoList() : GithubRepoListResponse
}