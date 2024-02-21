package com.joincoded.duolingoarabic.interfaceAPI

import com.joincoded.duolingoarabic.data.Chapter
import com.joincoded.duolingoarabic.data.Lesson
import com.joincoded.duolingoarabic.data.Progress
import com.joincoded.duolingoarabic.data.Question
import com.joincoded.duolingoarabic.data.User
import com.joincoded.duolingoarabic.data.response.LoginResponse
import com.joincoded.duolingoarabic.utils.Constants
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path

interface ApplicationApiService {

    @POST(Constants.signupEndpoint)
    suspend fun signup(@Body user: User): String

    @POST(Constants.loginEndpoint)
    suspend fun login(@Body user: User): Response<LoginResponse>

    @POST(Constants.progressEndpoint)
    suspend fun saveProgress(
        @Header(Constants.authorization) token: String?,
        @Body user: User,
        question: Question,
        lesson: Lesson,
        chapter: Chapter
    ): Response<LoginResponse>

    @POST(Constants.progressEndpoint)
    suspend fun CurrentQuestion(@Header(Constants.authorization) token: String?) //viewmodel

    @POST(Constants.progressEndpoint)
    suspend fun CurrentLesson(@Header(Constants.authorization) token: String?)

    @GET(Constants.chapterEndpoint)
    suspend fun getAllChapters(@Header(Constants.authorization) token: String?): List<Chapter>

    @GET(Constants.accountInfo)
    suspend fun getAccountInfo(@Header(Constants.authorization) token: String?): User

    @GET(Constants.lessonsEndpoint)
    suspend fun getAllLessonsOfChapter(@Header(Constants.authorization) token: String?): List<Lesson>

    @GET(Constants.questionsEndpoint)
    suspend fun getAllQuestionsAndAnswers(@Header(Constants.authorization) token: String?): List<Question>

    @GET("${Constants.baseChapter}/chapters/{chapterId}")
    suspend fun getChapterById(@Header(Constants.authorization) token: String?, @Path("chapterId") chapterId: String): Chapter

    @GET("${Constants.baseChapter}/lessons/{lessonId}")
    suspend fun getLessonById(@Header(Constants.authorization) token: String?, @Path("lessonId") lessonId: String): Lesson

    @GET("${Constants.questionsEndpoint}/{lessonId}")
    suspend fun getQuestionsByLessonId(@Header(Constants.authorization) token: String?, @Path("lessonId") lessonId: String): List<Question>
    @POST(Constants.progressEndpoint)
    suspend fun saveProgress(
        @Header(Constants.authorization) token: String?,
        @Body progressData: Progress
    ): Response<Any>
}
