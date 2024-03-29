package com.joincoded.duolingoarabic.composable.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.joincoded.duolingoarabic.R
import com.joincoded.duolingoarabic.viewModel.AuthAccountViewModel
import com.joincoded.duolingoarabic.viewModel.GameViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LessonScreen(
                 authViewModel: AuthAccountViewModel,
                 gameViewModel: GameViewModel,
                 navigateToQuestionsScreen: (Int) -> Unit) {
    if (authViewModel.token?.token != null) {
        //gameViewModel. fetchChapters(authViewModel.token?.token)
        gameViewModel.fetchQuestionsByLessonId(authViewModel.token?.token,gameViewModel.currentLesson.value)
    }
    Text(text = ":P")
//    Column(
//        modifier = Modifier
//            .fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        TopAppBar(
//            title = { },
//            navigationIcon = {
//                IconButton(onClick = { }) {
//                    Icon(Icons.Default.ArrowBack, contentDescription = "Back")
//                }
//            },
//        )
//
//        Box(modifier = Modifier)
//
//        Image(
//            painter = painterResource(id = R.drawable.phase3),
//            contentDescription = "Image",
//            modifier = Modifier
//                .clickable { navigateToQuestionsScreen(3) }
//                .size(220.dp)
//                .align(Alignment.Start),
//
//
//            )
//        Spacer(modifier = Modifier.height(36.dp))
//
//        Image(
//            painter = painterResource(id = R.drawable.phase2),
//            contentDescription = "Image",
//            modifier = Modifier
//                .clickable { navigateToQuestionsScreen(2) }
//                .size(220.dp)
//                .align(Alignment.CenterHorizontally),
//
//            )
//        Spacer(modifier = Modifier.height(36.dp))
//        Image(
//            painter = painterResource(id = R.drawable.phase1),
//            contentDescription = "Image",
//            modifier = Modifier
//                .clickable { navigateToQuestionsScreen(1) }
//                .size(220.dp)
//                .align(Alignment.End),
//
//            )
//
//    }
}


