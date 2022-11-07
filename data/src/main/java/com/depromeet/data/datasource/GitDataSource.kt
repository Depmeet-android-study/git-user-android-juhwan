package com.depromeet.data.datasource

import com.depromeet.data.model.UserDto
import retrofit2.Response

interface GitDataSource {
    suspend fun getUser(username: String): Response<UserDto>
}
