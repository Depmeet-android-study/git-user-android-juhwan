package com.depromeet.data.repository

import com.depromeet.data.api.GitApi
import com.depromeet.data.datasource.GitDataSource
import com.depromeet.domain.repository.GitRepository
import kotlinx.coroutines.flow.Flow

class GitRepositoryImpl (
    private val gitApi: GitApi,
    private val gitDataSource: GitDataSource
) : GitRepository {

    override fun getUserList(): Flow<PagingData<User>> {

    }

    override suspend fun getUser(username: String): Result<User> {

    }

    companion object {
        const val GIT_USER_PAGE_SIZE = 10
    }
}
