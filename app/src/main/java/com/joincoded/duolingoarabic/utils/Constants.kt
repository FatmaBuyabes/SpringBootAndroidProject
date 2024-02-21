package com.joincoded.duolingoarabic.utils

class Constants {
    companion object {
        const val baseUrl = "http://10.0.2.2:8080/api/v1/" //change it
        const val baseChapter = "chapter" // here the path for the chapter
        const val baseAuth = "auth"

        // here we will go to a specific chapter
        const val baseProgress = "/progress"
        const val questionsEndpoint = "/user/question/all-questions"
        const val userEndpoint = "user"
        const val lessonsEndpoint = "/lessons"
        const val accountInfo = "accountInfo"
        const val authorization = "Authorization"
        const val signupEndpoint = "${baseAuth}/signup"
        const val loginEndpoint = "${baseAuth}/login"
        const val chapterEndpoint = "${baseChapter}/chapters"
        const val progressEndpoint = "${baseProgress}/save"


    }
}