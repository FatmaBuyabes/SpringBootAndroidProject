package com.joincoded.duolingoarabic.utils

class Constants {
    companion object {
        const val baseUrl = "localhost:8080/api/v1" //change it
        const val baseChapter ="/chapter" // here the path for the chapter
        const val signupEndpoint = "/signup"
        const val loginEndpoint = "/signin"
        const val cahpterEndpoint = "${baseChapter}/chapters" // here we will go to a specific chapter
        const val lessonsEndpoint = "/lesson"
        const val progressEndpoint = "/progress"
        const val userEndpoint = "/user"
        const val authorization = "/Authorization"
        const val onboardingEndpoint = "/onboarning"

    }

}
