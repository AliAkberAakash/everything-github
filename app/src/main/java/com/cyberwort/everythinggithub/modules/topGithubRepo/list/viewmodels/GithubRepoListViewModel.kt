package com.cyberwort.everythinggithub.modules.topGithubRepo.list.viewmodels

import androidx.lifecycle.ViewModel
import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.repository.GithubRepoListRepository
import javax.inject.Inject

class GithubRepoListViewModel @Inject constructor(
        repository : GithubRepoListRepository
    ) : ViewModel(){
}