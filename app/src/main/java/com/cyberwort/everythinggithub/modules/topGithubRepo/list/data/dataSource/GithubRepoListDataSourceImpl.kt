package com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.dataSource

import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.model.GithubRepoListResponse
import com.orhanobut.logger.Logger
import java.lang.Exception
import javax.inject.Inject

class GithubRepoListDataSourceImpl @Inject constructor(
        val service: GithubRepoListService
    ) : GithubRepoListDataSource {

        override suspend fun getGuithubRepoList() : GithubRepoListResponse {
           try {
               return service.getGithubRepoList(
                   keyword = "Android",
                   perPage = 10,
               )
           }catch (e : Exception){
               Logger.d(e)
               throw e
           }
        }

}