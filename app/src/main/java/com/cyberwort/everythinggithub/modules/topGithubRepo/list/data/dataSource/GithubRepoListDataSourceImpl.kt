package com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.dataSource

import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.model.GithubRepoListResponse
import javax.inject.Inject

class GithubRepoListDataSourceImpl @Inject constructor(
        val service: GithubRepoListService
    ) : GithubRepoListDataSource {

        override suspend fun getGuithubRepoList() : GithubRepoListResponse {
            return service.getGithubRepoList(
                keyword = "Android",
                perPage = 10,
            )
        }

}