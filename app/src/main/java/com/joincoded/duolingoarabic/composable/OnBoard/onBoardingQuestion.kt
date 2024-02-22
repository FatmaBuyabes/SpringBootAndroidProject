package com.joincoded.duolingoarabic.composable.OnBoard


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
import com.joincoded.duolingoarabic.R
import com.joincoded.duolingoarabic.viewModel.OnboardingViewModel


@Composable
fun OnBoardingQuestion(viewModel: OnboardingViewModel, navigateToLoginScreen: (Int) -> Unit){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.street),
                contentScale = ContentScale.FillBounds
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

            Image(
                painter = painterResource(id = R.drawable.onboardingquestion),
                contentDescription = "The image for the question",
                modifier = Modifier
            )
            Spacer(modifier = Modifier.height(36.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Image(
                    painter = painterResource(id = R.drawable.onboardingquestion_correct_answer),
                    contentDescription = "The image for the correct answer",
                    modifier = Modifier.clickable {
                        navigateToLoginScreen
                    }
                )
                Spacer(modifier = Modifier.height(36.dp))

                Image(
                    painter = painterResource(id = R.drawable.onboardingquestion___wrong_answer__1),
                    contentDescription = "The image for the wrong answer #1",
                    modifier = Modifier.clickable {
                        navigateToLoginScreen
                    }
                )
            }

            Spacer(modifier = Modifier.height(45.dp))

            Image(
                painter = painterResource(id = R.drawable.onboardingquestion___wrong_answer__2),
                contentDescription = "The image for the wrong answer #2",
                modifier = Modifier.clickable {
                    navigateToLoginScreen
                }

            )

        }

}

//@Preview
//@Composable
//fun onBoardingQuestionPreview() {
//    OnBoardingQuestion()
//}