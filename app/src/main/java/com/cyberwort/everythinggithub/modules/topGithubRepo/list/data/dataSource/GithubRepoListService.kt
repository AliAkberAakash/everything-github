package com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.dataSource

import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.model.GithubRepoListResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubRepoListService {

    @GET("search/repositories")
    suspend fun getGithubRepoList(
        @Query("q") keyword : String,
        @Query("per_page") perPage : Int,
    ) : GithubRepoListResponse

}