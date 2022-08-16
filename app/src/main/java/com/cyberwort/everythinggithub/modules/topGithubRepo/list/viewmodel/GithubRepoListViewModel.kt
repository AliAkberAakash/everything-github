package com.cyberwort.everythinggithub.modules.topGithubRepo.list.viewmodel

import com.cyberwort.everythinggithub.core.viewmodel.BaseViewModel
import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.repository.GithubRepoListRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GithubRepoListViewModel @Inject constructor(
        val repository : GithubRepoListRepository
    ) : BaseViewModel(){

      fun getGithubRepList() = runZoneGuarded{
          repository.getGithubRepoList()
      }
}