package com.cyberwort.everythinggithub.modules.topGithubRepo.list.viewmodel

import androidx.lifecycle.liveData
import com.cyberwort.everythinggithub.core.viewmodel.BaseViewModel
import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.repository.GithubRepoListRepository
import com.orhanobut.logger.Logger
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class GithubRepoListViewModel @Inject constructor(
        val repository : GithubRepoListRepository
    ) : BaseViewModel(){

      fun getGithubRepList() = liveData(Dispatchers.IO) {
          try {
              emit(repository.getGithubRepoList())
          } catch (exception: Exception) {
              Logger.d(exception)
          }
      }
}