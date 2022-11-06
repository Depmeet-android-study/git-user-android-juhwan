package com.depromeet.data.datasource

import com.depromeet.data.api.GitApi
import retrofit2.Response

class GitRemoteDataSourceImpl (
    private val gitApi: GitApi
) : GitDataSource {

    override suspend fun getUser(username: String): Response<UserEntity> {
        return gitApi.getUser(username)
    }
}
