package com.joincoded.duolingoarabic.composable.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.joincoded.duolingoarabic.R
import com.joincoded.duolingoarabic.viewModel.AuthAccountViewModel
import com.joincoded.duolingoarabic.viewModel.GameViewModel


@Composable
fun PictureQuestion(viewModel: GameViewModel, authViewModel: AuthAccountViewModel){
    val question = viewModel.questions.value!![viewModel.currentQuestion.value]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.backround_question_image),
                contentScale = ContentScale.FillBounds
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = question.questionText,
            contentDescription = "Question",
            modifier = Modifier
        )
        Spacer(modifier = Modifier.height(36.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            AsyncImage(
                model = question.correctAnswerText,
                contentDescription = "Image",
                modifier = Modifier.clickable {/* img */ }
            )
            Spacer(modifier = Modifier.height(36.dp))

            AsyncImage(
                model = question.firstOption,
                contentDescription = "Image",
                modifier = Modifier.clickable {/* img */ }
            )
        }

        Spacer(modifier = Modifier.height(45.dp))

        AsyncImage(
            model = question.secondOption,
            contentDescription = "Image",
            modifier = Modifier.clickable {/* img */ }

        )

    }
}


