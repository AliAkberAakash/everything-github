package com.cyberwort.everythinggithub.di

import com.cyberwort.everythinggithub.modules.topGithubRepo.details.data.repository.GithubRepoDetailsRepository
import com.cyberwort.everythinggithub.modules.topGithubRepo.details.data.repository.GithubRepoDetailsRepositoryImpl
import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.repository.GithubRepoListRepository
import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.repository.GithubRepoListRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    @Singleton
    fun bindGithubRepoListRepository(repo : GithubRepoListRepositoryImpl)
        : GithubRepoListRepository

    @Binds
    @Singleton
    fun bindGithubRepoDetailsRepository(repo : GithubRepoDetailsRepositoryImpl)
        : GithubRepoDetailsRepository

}