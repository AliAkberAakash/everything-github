package com.cyberwort.everythinggithub.di

import android.content.Context
import com.cyberwort.everythinggithub.core.data.network.NetworkFactory
import com.cyberwort.everythinggithub.modules.topGithubRepo.details.data.dataSource.GithubRepoDetailsService
import com.cyberwort.everythinggithub.modules.topGithubRepo.list.data.dataSource.GithubRepoListService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideGithubRepoListService(@ApplicationContext context: Context) : GithubRepoListService {
        return NetworkFactory.createService(context, GithubRepoListService::class.java)
    }

    @Provides
    @Singleton
    fun provideGithubRepoDetailsService(@ApplicationContext context: Context) : GithubRepoDetailsService {
        return NetworkFactory.createService(context, GithubRepoDetailsService::class.java)
    }
}