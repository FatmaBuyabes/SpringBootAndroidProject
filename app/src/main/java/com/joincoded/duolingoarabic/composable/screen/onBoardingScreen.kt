package com.joincoded.duolingoarabic.composable.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joincoded.duolingoarabic.R
import com.joincoded.duolingoarabic.viewModel.OnboardingViewModel


@Composable
fun onBoardingScreen(viewModel: OnboardingViewModel){

    Surface(
        modifier = Modifier
            .fillMaxSize()

    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .paint(
                    painterResource(id = R.drawable.street),
                    contentScale = ContentScale.FillBounds
                ),
        ) {
            Button(
                onClick = { /*Handle sign up info here*/ },
                modifier = Modifier
                    .width(250.dp)
                    .height(130.dp)
                    .align(Alignment.Center)




            ) {
                Text(" ابدأ", fontSize = 80.sp)

            }

        }
    }
}