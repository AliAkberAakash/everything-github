package com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.repository

import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.dataSource.GithubRepoListDataSource
import javax.inject.Inject

class GithubRepoListRepositoryImpl @Inject constructor(
        networkSource : GithubRepoListDataSource
    ) : GithubRepoListRepository {
}