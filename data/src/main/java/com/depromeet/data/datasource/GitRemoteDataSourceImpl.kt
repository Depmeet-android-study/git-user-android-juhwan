package com.depromeet.data.datasource

import com.depromeet.data.api.GitApi
import com.depromeet.data.model.UserDto
import retrofit2.Response

class GitRemoteDataSourceImpl (
    private val gitApi: GitApi
) : GitDataSource {

    override suspend fun getUser(username: String): Response<UserDto> {
        return gitApi.getUser(username)
    }
}
