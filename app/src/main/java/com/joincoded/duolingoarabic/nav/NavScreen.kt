package com.joincoded.duolingoarabic.nav

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.joincoded.duolingoarabic.composable.OnBoard.OnBoardingQuestion
import com.joincoded.duolingoarabic.composable.component.PictureQuestion
import com.joincoded.duolingoarabic.composable.component.Progress
import com.joincoded.duolingoarabic.composable.screen.ChapterScreen
import com.joincoded.duolingoarabic.composable.screen.LoginScreen
import com.joincoded.duolingoarabic.composable.screen.PhaseScreen
import com.joincoded.duolingoarabic.data.User
import com.joincoded.duolingoarabic.utils.Routes
import com.joincoded.duolingoarabic.viewModel.AuthAccountViewModel
import com.joincoded.duolingoarabic.viewModel.GameViewModel
import com.joincoded.duolingoarabic.viewModel.OnboardingViewModel


@Composable
fun NavScreen() {
    val navController = rememberNavController()
    val viewModelAccount: AuthAccountViewModel = viewModel()
    val viewModelGame: GameViewModel = viewModel()
    val viewModel: OnboardingViewModel = viewModel()

    NavHost(navController = navController, startDestination = Routes.onBoardingRoute) {
        composable(Routes.onBoardingRoute) {
            OnBoardingQuestion(viewModel)
        }

        composable(Routes.loginRoute) {
            LoginScreen(viewModelAccount)
        }

        composable(Routes.chaptersRoute) {
            ChapterScreen(viewModelGame, viewModelAccount)
        }

        composable(Routes.lessonsRoute) {
            PhaseScreen(viewModelGame) {
                viewModelGame.currentLesson.value = it
                viewModelGame.fetchQuestionsByLessonId(viewModelAccount.token?.token, it)
                navController.navigate(Routes.questionsRoute)
            }
        }

        composable(Routes.progressRoute) {
            Progress(viewModelGame)
        }

        composable(Routes.questionsRoute) {
            PictureQuestion(viewModelGame)
        }
    }
}
