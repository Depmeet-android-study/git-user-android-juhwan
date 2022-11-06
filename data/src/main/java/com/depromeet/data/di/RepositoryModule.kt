package com.depromeet.data.di

import com.depromeet.data.api.GitApi
import com.depromeet.data.datasource.GitDataSource
import com.depromeet.data.repository.GitRepositoryImpl
import com.depromeet.domain.repository.GitRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {
    @Provides
    @Singleton
    fun provideGitRemoteRepository(
        gitApi: GitApi,
        gitDataSource: GitDataSource
    ): GitRepository {
        return GitRepositoryImpl(gitApi, gitDataSource)
    }
}
