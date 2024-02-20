package com.joincoded.duolingoarabic.viewModel

import androidx.lifecycle.ViewModel
import com.joincoded.duolingoarabic.data.Chapter
import com.joincoded.duolingoarabic.data.Lesson
import com.joincoded.duolingoarabic.data.Progress
import com.joincoded.duolingoarabic.data.Question

class GameViewModel : ViewModel() {
    private val chapter = mutableListOf<Chapter>()

    private val question = mutableListOf<Question>()

    private val lesson = mutableListOf<Lesson>()

    private val userProgress = mutableMapOf<String, Progress>()

    fun updateUserProgress(username: String, score: Int) {
        val progress = userProgress[username]
        progress?.score = score
    }

}