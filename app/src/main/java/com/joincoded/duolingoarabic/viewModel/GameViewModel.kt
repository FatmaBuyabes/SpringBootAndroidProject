package com.joincoded.duolingoarabic.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.joincoded.duolingoarabic.data.Chapter
import com.joincoded.duolingoarabic.data.Lesson
import com.joincoded.duolingoarabic.data.Progress
import com.joincoded.duolingoarabic.data.Question
import com.joincoded.duolingoarabic.data.User
import com.joincoded.duolingoarabic.interfaceAPI.ApplicationApiService
import com.joincoded.duolingoarabic.singelton.RetrofitHelper
import kotlinx.coroutines.launch

class GameViewModel : ViewModel() {
    private val apiService = RetrofitHelper.getInstance().create(ApplicationApiService::class.java)

    private var chapters: List<Chapter>? by mutableStateOf(null)
    private var lessons: List<Lesson>? by mutableStateOf(null)
    private var currentProgress: Progress? by mutableStateOf(null)
    private var currentQuestion: Question? by mutableStateOf(null)
    private var question: List<Question>? by mutableStateOf(null)
    private var currentLesson: Lesson? by mutableStateOf(null)
    private val userProgress = mutableMapOf<String, Progress>()



    fun getAllChapters(token: String?) {
        viewModelScope.launch {
            try {
                chapters = apiService.getAllChapters(token)
                println(chapters!![0].imageUrl)
            } catch (e: Exception) {
                println("Error $e")
            }
        }

    }

    fun getAllLessonsOfChapter(token: String) {
        viewModelScope.launch {
            try {
                lessons = apiService.getAllLessonsOfChapter(token)
                println(lessons!![0].imageUrl)
            } catch (e: Exception) {
                println("Error $e")
            }
        }

    }

    fun getQuestion(question: String, answer: String,){

    }


    fun updateUserProgress(username: String, score: Int) {
        viewModelScope.launch {
            try {
                // Assuming userProgress is a map of username to Progress object
                val progress = userProgress[username] ?: Progress(0)
                progress.score = score
                // Update user progress via API service
            } catch (e: Exception) {
                println("Error $e")
            }
        }
    }

    fun getCurrentQuestion() {

    }

    fun getCurrentLesson() {

    }

}