package com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.repository

import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.dataSource.GithubRepoListDataSource
import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.model.GithubRepoListResponse
import javax.inject.Inject

class GithubRepoListRepositoryImpl @Inject constructor(
        val networkSource : GithubRepoListDataSource
    ) : GithubRepoListRepository {

      override suspend fun getGithubRepoList() : GithubRepoListResponse {
          return networkSource.getGuithubRepoList()
      }
}