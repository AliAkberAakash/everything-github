package com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.repository

import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.dataSource.GithubRepoListDataSource
import javax.inject.Inject

class GithubRepoListRepositoryImpl @Inject constructor(
        val networkSource : GithubRepoListDataSource
    ) : GithubRepoListRepository {

      override suspend fun getGithubRepoList() = runZonedGuarded {
          networkSource.getGuithubRepoList()
      }
}