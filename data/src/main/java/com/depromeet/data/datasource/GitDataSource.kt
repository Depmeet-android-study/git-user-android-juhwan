package com.depromeet.data.datasource

import retrofit2.Response

interface GitDataSource {
    suspend fun getUser(username: String): Response<UserEntity>
}
