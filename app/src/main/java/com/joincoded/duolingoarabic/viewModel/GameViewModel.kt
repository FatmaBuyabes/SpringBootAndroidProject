package com.joincoded.duolingoarabic.viewModel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.joincoded.duolingoarabic.data.Chapter
import com.joincoded.duolingoarabic.data.Lesson
import com.joincoded.duolingoarabic.data.Progress
import com.joincoded.duolingoarabic.data.Question
import com.joincoded.duolingoarabic.interfaceAPI.ApplicationApiService
import kotlinx.coroutines.launch

class GameViewModel(private val apiService: ApplicationApiService) : ViewModel() {
    var currentQuestion: MutableState<Int> = mutableStateOf(0)
    var currentChapter: MutableState<Int> = mutableStateOf(0)
    var currentLesson: MutableState<Int> = mutableStateOf(0)

    var chapters: MutableState<List<Chapter>?> = mutableStateOf(null)
        private set

    var lessons: MutableState<List<Lesson>?> = mutableStateOf(null)
        private set

    var questions: MutableState<List<Question>?> = mutableStateOf(null)
        private set

    var progress: MutableState<Progress?> = mutableStateOf(null)
        private set

    fun fetchChapters(token: String?) {
        viewModelScope.launch {
            try {
                chapters.value = apiService.getAllChapters(token)
            } catch (e: Exception) {
                println("Failed to fetch chapters: ${e.message}")            }
        }
    }

    fun fetchLessonsByChapterId(token: String?, chapterId: Int) {
        viewModelScope.launch {
            try {
                lessons.value = apiService.getAllLessonsOfChapter(token, chapterId)
            } catch (e: Exception) {
                println("Failed to fetch lessons: ${e.message}")
            }
        }
    }

    fun fetchQuestionsByLessonId(token: String?, lessonId: Int) {
        viewModelScope.launch {
            try {
                questions.value = apiService.getAllQuestionsByLessonId(token, lessonId)
            } catch (e: Exception) {
                println("Failed to fetch questions: ${e.message}")
            }
        }
    }

    fun saveProgress(token: String?, chapterId: String, lessonId: String, questionId: String, score: Int) {
        viewModelScope.launch {
            try {
                val progressData = Progress(chapterId, lessonId, questionId, score)
                val response = apiService.saveProgress(token, progressData)
                if (response.isSuccessful) {

                    progress.value = progressData
                } else {
                    // Handle unsuccessful progress saving
                }
            } catch (e: Exception) {
                println("Failed to fetch dave progress: ${e.message}")
            }
        }
    }
}
