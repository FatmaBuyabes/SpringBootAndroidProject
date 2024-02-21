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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joincoded.duolingoarabic.R
import com.joincoded.duolingoarabic.composable.OnBoard.OnBoardingQuestion

@Composable

fun ChapterScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()

    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray)
        ) {
            Image(
                painter = painterResource(id = R.drawable.street),
                contentDescription = "Image",
                modifier = Modifier
                    .wrapContentHeight()
            )

            Text(
                text = " اختر الحرف لتبدا",
                textAlign = TextAlign.Center,
                fontSize = 35.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(34.dp)
                    .background(color = Color.Gray)
            )

        }
    }
    val imageList = listOf(
        R.drawable.a,   ///back end
        R.drawable.a,
        R.drawable.a,
    )

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    )
    {
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(imageList) { image ->
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    modifier = Modifier.size(420.dp)
                )
            }
        }
    }
}

