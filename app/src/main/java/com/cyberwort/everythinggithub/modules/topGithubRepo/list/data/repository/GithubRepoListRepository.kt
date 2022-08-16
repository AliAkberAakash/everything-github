package com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.repository

import com.cyberwort.everythinggithub.core.data.networkResult.NetworkResult
import com.cyberwort.everythinggithub.core.data.repository.BaseRepository
import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.model.GithubRepoListResponse

interface GithubRepoListRepository : BaseRepository{
    suspend fun getGithubRepoList() : NetworkResult<GithubRepoListResponse?>
}