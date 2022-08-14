package com.cyberwort.everythinggithub.modules.topGithubRepo.details.viewmodels

import androidx.lifecycle.ViewModel
import com.cyberwort.everythinggithub.modules.topGithubRepo.details.data.repository.GithubRepoDetailsRepository
import javax.inject.Inject

class GithubRepoDetailsViewModel @Inject constructor(
        repository : GithubRepoDetailsRepository
    ) : ViewModel() {
}