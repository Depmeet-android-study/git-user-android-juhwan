package com.depromeet.data.api

import com.depromeet.data.model.UserDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GitApi {
    @GET("users?per_page=10")
    suspend fun getUserList(
        @Query("since") since: String
    ): Response<List<UserDto>>

    @GET("users/{username}")
    suspend fun getUser(
        @Path("username") username: String
    ): Response<UserDto>
}
