package com.cyberwort.everythinggithub.modules.topGithubRepo.list.viewmodel

import com.cyberwort.everythinggithub.core.viewmodel.BaseViewModel
import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.repository.GithubRepoListRepository
import javax.inject.Inject

class GithubRepoListViewModel @Inject constructor(
        repository : GithubRepoListRepository
    ) : BaseViewModel(){
}