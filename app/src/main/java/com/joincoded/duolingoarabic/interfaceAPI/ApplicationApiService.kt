package com.joincoded.duolingoarabic.interfaceAPI

import com.joincoded.duolingoarabic.data.Chapter
import com.joincoded.duolingoarabic.data.User
import com.joincoded.duolingoarabic.data.response.TokenResponse
import com.joincoded.duolingoarabic.utils.Constants
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApplicationApiService {

    @POST(Constants.signupEndpoint)
    suspend fun signup(@Body user: User): Response<TokenResponse>

    @POST(Constants.loginEndpoint)
    suspend fun login(@Body user: User): Response<TokenResponse>

    @GET(Constants.cahptersEndpoint)
    suspend fun getAllChapters(): List<Chapter>


}


