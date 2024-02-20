package com.joincoded.duolingoarabic.composable.screen

import androidx.compose.runtime.Composable
import com.joincoded.duolingoarabic.composable.component.LetterQuestion
import com.joincoded.duolingoarabic.data.Question

@Composable
fun onBoardingScreen(){

    LetterQuestion(question = Question())
}