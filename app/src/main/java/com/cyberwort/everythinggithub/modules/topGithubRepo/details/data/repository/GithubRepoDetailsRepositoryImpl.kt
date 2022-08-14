package com.cyberwort.everythinggithub.modules.topGithubRepo.details.data.repository

import com.cyberwort.everythinggithub.modules.topGithubRepo.details.data.dataSource.GithubRepoDetailsDataSource
import javax.inject.Inject

class GithubRepoDetailsRepositoryImpl @Inject constructor(
        dataSource: GithubRepoDetailsDataSource
    ) : GithubRepoDetailsRepository {
}