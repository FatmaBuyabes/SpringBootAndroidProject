package com.joincoded.duolingoarabic.composable.screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.joincoded.duolingoarabic.R
import com.joincoded.duolingoarabic.viewModel.AuthAccountViewModel
import com.joincoded.duolingoarabic.viewModel.GameViewModel

@Composable
fun ChapterScreen(
    authViewModel: AuthAccountViewModel,
    gameViewModel: GameViewModel,
    navigateToLessonScreen: () -> Unit,
) {

    if (authViewModel.token?.token != null) {
        gameViewModel.fetchChapters(authViewModel.token?.token)
        //gameViewModel.fetchLessonsByChapterId(authViewModel.token?.token,gameViewModel.currentChapter.value)
    }

    Image(
        painter = painterResource(id = R.drawable.street),
        contentDescription = "Image",
        modifier = Modifier
            .wrapContentHeight(),
        contentScale = ContentScale.FillBounds
    )

    Column(
        modifier = Modifier
            .fillMaxSize(),
        Arrangement.SpaceEvenly
    )
    {

        Text(
            text = " اختر الحرف لتبدأ",
            textAlign = TextAlign.Center,
            fontSize = 35.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(34.dp)
                .background(color = Color.Gray)
        )

    }
    LazyRow {
        items(gameViewModel.chapters.value ?: listOf()) { chapter ->
            AsyncImage(
                model = chapter.imageUrl,
                contentDescription = null,
                modifier = Modifier.size(420.dp),
            )

        }

    }
}


