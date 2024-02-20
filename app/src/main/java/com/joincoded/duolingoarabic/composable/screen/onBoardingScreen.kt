package com.joincoded.duolingoarabic.composable.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.joincoded.duolingoarabic.composable.component.LetterQuestion
import com.joincoded.duolingoarabic.data.Question

@Composable
fun onBoardingScreen(){

    var questions by remember { mutableStateOf("هل السماء فوقك ؟") }
    var answer = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = questions
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)) {
            Text("اضغط هنا للإجابة")

        }

    }

}