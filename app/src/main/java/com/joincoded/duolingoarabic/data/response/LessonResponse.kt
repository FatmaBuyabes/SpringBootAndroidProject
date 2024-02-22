package com.joincoded.duolingoarabic.data.response

data class LessonResponse( val title: String, val imageUrl: String, val chapter: ChapterEntity){
data class ChapterEntity(val id: Int,val imageUrl: String)}

