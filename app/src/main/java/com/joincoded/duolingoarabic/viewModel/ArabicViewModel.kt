package com.joincoded.duolingoarabic.viewModel

import android.app.Application
import android.content.Context

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.joincoded.duolingoarabic.data.Chapter
import com.joincoded.duolingoarabic.data.Lesson
import com.joincoded.duolingoarabic.data.Progress
import com.joincoded.duolingoarabic.data.Question
import com.joincoded.duolingoarabic.data.User
import com.joincoded.duolingoarabic.data.response.TokenResponse
import com.joincoded.duolingoarabic.singelton.RetrofitHelper


class ArabicViewModel : ViewModel() {
    private val chapters = mutableListOf<Chapter>()
    private val lessons = mutableListOf<Lesson>()
    private val questions = mutableListOf<Question>()
    private val userProgress = mutableMapOf<String, Progress>()
    private val apiService = RetrofitHelper.getInstance().create(ArabicViewModel::class.java)
    var token: TokenResponse? by mutableStateOf(null)
    var currentUser: User? by mutableStateOf(null)
    private val sharedPreferencesKey = "user_token"
    var application: Application? = null


    // add a new chapter
    fun addChapter(imageUrl: String?) {
        chapters.add(Chapter(imageUrl))
    }

    // update a lesson
    fun updateLesson(title: String, score: Int) {
        val lesson = lessons.find { it.title == title }
        lesson?.score = score
    }

    // delete a lesson
    fun deleteLesson(title: String) {
        lessons.removeIf { it.title == title }
    }

    // update user progress
    fun updateUserProgress(username: String, score: Int) {
        val progress = userProgress[username]
        progress?.score = score
    }

    // add a new question
    fun addQuestion(title: String, options: String, answer: String, score: Int) {
        questions.add(Question(title, options, answer, score))
    }

    // update a question
    fun updateQuestion(title: String, options: String, answer: String, score: Int) {
        val question = questions.find { it.title == title }
        question?.apply {
            this.options = options
            this.answer = answer
            this.score = score
        }
    }

    // delete a question
    fun deleteQuestion(title: String) {
        questions.removeIf { it.title == title }
    }

    init {
        retrieveToken()
    }

    private val sharedPreferences = application?.getSharedPreferences(
        "Saved account", Context.MODE_PRIVATE
    )

    // Retrieve the token from SharedPreferences
    fun retrieveToken(): String? {
        return sharedPreferences?.getString(sharedPreferencesKey, null)
    }

    // Save the token to SharedPreferences
    private fun saveToken(token: String?) {
        sharedPreferences?.edit()?.putString(sharedPreferencesKey, token)?.commit()
    }

    fun signup(username: String, password: String, name: String = "", email: String = "") {
        viewModelScope.launch {
            try {
                val response = apiService.signup(User(username, password, null))
                token = response.body()
                saveToken(token?.token)
                getAccountInfo()
            } catch (e: Exception) {
                println("Error $e")
            }

        }
    }

    fun login(username: String, password: String) {
        viewModelScope.launch {
            try {
                val response = apiService.login(User(username, password))
                println(response.code())
                println(response.message())
                println(response.body())
                token = response.body()
                saveToken(token?.token)
                getAccountInfo()
            } catch (e: Exception) {
                println("Error $e")
            }
        }
    }


    fun getAccountInfo() {
        viewModelScope.launch {
            try {
                currentUser = apiService.getAccountInfo(token?.getBearerToken())
                println(currentUser?.username)
            } catch (e: Exception) {
                println("Error $e")
            }
        }
    }


}