package com.joincoded.duolingoarabic.data


data class Question(
    var id: Int,
    val questionText: String,
    val correctAnswerText: String,
    val firstOption: String,
    val secondOption: String,
    val lessonEntity: LessonEntity,
    var score: Int
)

data class LessonEntity(val title: String, val imageUrl: String, val chapter: ChapterEntity)

data class ChapterEntity(val id: Int, val imageUrl: String)
