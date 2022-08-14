package com.cyberwort.everythinggithub.di

import com.cyberwort.everythinggithub.modules.topGithubRepo.details.data.dataSource.GithubRepoDetailsService
import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.dataSource.GithubRepoListService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun bindGithubRepoListService() = GithubRepoListService()

    @Provides
    @Singleton
    fun bindGithubRepoDetailsService() = GithubRepoDetailsService()

}