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
import com.joincoded.duolingoarabic.composable.screen.LoginScreen
import com.joincoded.duolingoarabic.ui.theme.DuolingoArabicTheme
import com.joincoded.duolingoarabic.viewModel.AuthAccountViewModel
import com.joincoded.duolingoarabic.viewModel.GameViewModel

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
                    val authViewMode: AuthAccountViewModel = viewModel()
                    val gameViewMode: GameViewModel = viewModel()

                    authViewMode.login(
                        "am@gmail.com",
                        "1234"
                    )

                    Text(text = "${authViewMode.token?.token}")
                    Button(onClick = { gameViewMode.getAllLessonsOfChapter(authViewMode.token) }) { //IT IS NOT WOORKKIINGGG

                    }


                }
            }
        }
    }
}