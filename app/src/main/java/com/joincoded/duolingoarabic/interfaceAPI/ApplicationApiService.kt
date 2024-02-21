package com.joincoded.duolingoarabic.interfaceAPI

import com.joincoded.duolingoarabic.data.Chapter
import com.joincoded.duolingoarabic.data.Lesson
import com.joincoded.duolingoarabic.data.Question
import com.joincoded.duolingoarabic.data.User
import com.joincoded.duolingoarabic.data.response.LoginResponse
import com.joincoded.duolingoarabic.utils.Constants
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApplicationApiService {

    @POST(Constants.signupEndpoint)
    suspend fun signup(@Body user: User): String

    @POST(Constants.loginEndpoint)
    suspend fun login(@Body user: User): Response<LoginResponse>

    @GET(Constants.chapterEndpoint)
    suspend fun getAllChapters(@Header(Constants.authorization) token: String?): List<Chapter>

    @GET(Constants.accountInfo)
    suspend fun getAccountInfo(@Header(Constants.authorization) token: String?): User

    @GET(Constants.lessonsEndpoint)
    suspend fun getAllLessonsOfChapter(@Header(Constants.authorization) token: String?): List<Lesson>

    @GET(Constants.questionsEndpoint)
    suspend fun getAllQuestionsAndAnswers(@Header(Constants.authorization) token: String?): List<Question>

    @POST(Constants.progressEndpoint)
    suspend fun saveProgress(@Header(Constants.authorization)token: String?,@Body user: User,question: Question, lesson: Lesson,chapter: Chapter): Response<LoginResponse>

}


