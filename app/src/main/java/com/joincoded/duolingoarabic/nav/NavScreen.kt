package com.joincoded.duolingoarabic.nav

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.joincoded.duolingoarabic.composable.component.Progress
import com.joincoded.duolingoarabic.composable.screen.LessonScreen
import com.joincoded.duolingoarabic.composable.screen.LoginScreen
import com.joincoded.duolingoarabic.composable.screen.OnBoardingQuestion
import com.joincoded.duolingoarabic.composable.screen.onBoardingScreen
import com.joincoded.duolingoarabic.data.User
import com.joincoded.duolingoarabic.utils.Routes
import com.joincoded.duolingoarabic.viewModel.AuthAccountViewModel
import com.joincoded.duolingoarabic.viewModel.GameViewModel

@Composable
fun NavScreen() {
    @Composable
    fun NavScreen() {
        val navController = rememberNavController()
        val viewModelAccount: AuthAccountViewModel = viewModel()
        val viewModelGame: GameViewModel= viewModel()

        NavHost(navController = navController, startDestination = Routes.onBoardingRoute) {
            composable(Routes.onBoardingRoute) {
                OnBoardingQuestion()
            }

            composable(Routes.loginRoute) {
                LoginScreen()
            }

            composable(Routes.chaptersRoute){
                //
            }

            composable(Routes.lessonsRoute){
                LessonScreen()
            }

            composable(Routes.progressRoute){
                Progress()
            }
            composable(Routes.userRoute){
                User()
            }
        }
    }
}