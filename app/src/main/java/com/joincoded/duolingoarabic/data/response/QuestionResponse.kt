package com.joincoded.duolingoarabic.data.response

import com.joincoded.duolingoarabic.data.Chapter
import com.joincoded.duolingoarabic.data.Question

data class QuestionResponse(
    val questionText: String, val correctAnswer: String,
    val firstOption: String, val secondOption: String, val lessonEntity: LessonEntity
)

data class LessonEntity(val title: String, val imageUrl: String, val chapter: ChapterEntity)

data class ChapterEntity(val id: Int,val imageUrl: String)
