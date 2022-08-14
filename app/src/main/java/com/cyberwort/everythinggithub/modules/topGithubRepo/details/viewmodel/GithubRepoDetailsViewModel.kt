package com.cyberwort.everythinggithub.modules.topGithubRepo.details.viewmodel

import com.cyberwort.everythinggithub.core.viewmodel.BaseViewModel
import com.cyberwort.everythinggithub.modules.topGithubRepo.details.data.repository.GithubRepoDetailsRepository
import javax.inject.Inject

class GithubRepoDetailsViewModel @Inject constructor(
        repository : GithubRepoDetailsRepository
    ) : BaseViewModel() {
}