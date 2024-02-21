package com.joincoded.duolingoarabic.composable.OnBoard


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joincoded.duolingoarabic.R



@Composable
fun onBoardingScreen(){

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
                Text(" ابدا", fontSize = 80.sp)

            }

        }
    }
}
