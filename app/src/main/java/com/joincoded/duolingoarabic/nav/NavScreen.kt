package com.joincoded.duolingoarabic.nav

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.joincoded.duolingoarabic.composable.screen.ChapterScreen
import com.joincoded.duolingoarabic.composable.screen.LessonScreen
import com.joincoded.duolingoarabic.composable.screen.LoginScreen
import com.joincoded.duolingoarabic.composable.screen.SignUpScreen
import com.joincoded.duolingoarabic.utils.Routes
import com.joincoded.duolingoarabic.viewModel.AuthAccountViewModel
import com.joincoded.duolingoarabic.viewModel.GameViewModel
import com.joincoded.duolingoarabic.viewModel.OnboardingViewModel


@Composable
fun NavScreen() {
    val navController = rememberNavController()
    val gameViewModel: GameViewModel = viewModel()
    val authViewModel: AuthAccountViewModel = viewModel()
    val onboardingViewModel: OnboardingViewModel = viewModel()


    NavHost(navController = navController, startDestination = Routes.loginRoute) {
        composable(Routes.loginRoute) {
            LoginScreen(authViewModel, gameViewModel,
                navigateToChapterScreen = {
                    navController.navigate(Routes.chaptersRoute)
                },
                navigateToSignupScreen = {
                    navController.navigate(Routes.signupRoute)
                })
        }
        composable(Routes.signupRoute) {
            SignUpScreen(authViewModel, gameViewModel) {
                navController.navigate(Routes.loginRoute) {
                    popUpTo(Routes.signupRoute) { inclusive = true }
                }
            }
        }
        composable(Routes.chaptersRoute) {
            ChapterScreen(authViewModel, gameViewModel,
                navigateToLessonScreen = {
                    navController.navigate(Routes.lessonsRoute)
                })
        }

        composable(Routes.questionsRoute) {

        }
        composable(Routes.lessonsRoute) {
            LessonScreen(
                authViewModel = authViewModel,
                gameViewModel = gameViewModel,
                navigateToQuestionsScreen = {
                    navController.navigate(Routes.lessonsRoute)
                }
            )
        }

    }
}


//    NavHost(navController = navController, startDestination = Routes.onBoardingRoute) {
//        composable(Routes.onBoardingRoute) {
//           OnBoardingQuestion(onboardingViewModel,authViewModel  )}
//
//
//                   composable(Routes.loginRoute) {
//                       LoginScreen(navController=navController,authViewModel,gameViewModel)
//                   }

//        composable(Routes.chaptersRoute) {
//            ChapterScreen( authViewModel,gameViewModel)
//                         .currentChapter = it
//                        gameViewModel.fetchLessonsByChapterId(authViewModel.token?.token,it)
//                         navController.navigate(Routes.lessonsRoute)
//                    ) }
//        }

//        composable(Routes.lessonsRoute) {
//            LessonScreen(navController = navController, authViewModel, gameViewModel) {
//                gameViewModel.currentLesson.value = it
//                gameViewModel.fetchQuestionsByLessonId(authViewModel.token?.token, it)
//                navController.navigate(Routes.questionsRoute)
//            }
//        }

//        composable(Routes.progressRoute) {
//            Progress(authViewModel,gameViewModel)
//        }

//        composable(Routes.questionsRoute) {
//            // PictureQuestion(uthViewModel,gameViewModel)
//        }




