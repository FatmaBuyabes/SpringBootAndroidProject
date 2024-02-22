package com.joincoded.duolingoarabic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.findNavController
import com.joincoded.duolingoarabic.composable.screen.LoginScreen
import com.joincoded.duolingoarabic.nav.NavScreen
import com.joincoded.duolingoarabic.ui.theme.DuolingoArabicTheme
import com.joincoded.duolingoarabic.viewModel.AuthAccountViewModel
import com.joincoded.duolingoarabic.viewModel.GameViewModel
import com.joincoded.duolingoarabic.viewModel.OnboardingViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DuolingoArabicTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavScreen()
//                    val viewModelAccount: AuthAccountViewModel = viewModel()
//                    val viewModelGame: GameViewModel = viewModel()
//                    val viewModel: OnboardingViewModel = viewModel()
//
//                    viewModelAccount.login("af@gmail.com", "1234")
//                    Button(onClick = {
//                        viewModelGame.fetchLessonsByChapterId(
//                            viewModelAccount.token?.token,
//                            1
//                        )
//                    }) {
//                        Text(text = "${viewModelAccount.token?.token}")
//                    }
//                    NavScreen()


                }
            }
        }
    }
}