package com.cyberwort.everythinggithub.di

import com.cyberwort.everythinggithub.modules.topGithubRepo.details.data.dataSource.GithubRepoDetailsDataSource
import com.cyberwort.everythinggithub.modules.topGithubRepo.details.data.dataSource.GithubRepoDetailsDataSourceImpl
import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.dataSource.GithubRepoListDataSource
import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.dataSource.GithubRepoListDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DataSourceModule {

    @Binds
    @Singleton
    fun bindGitHubRepoListDataSource(dataSource: GithubRepoListDataSourceImpl) : GithubRepoListDataSource

    @Binds
    @Singleton
    fun provideGitHubRepoDetailsDataSource(dataSource: GithubRepoDetailsDataSourceImpl) : GithubRepoDetailsDataSource

}