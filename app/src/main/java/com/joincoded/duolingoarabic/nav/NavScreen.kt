package com.joincoded.duolingoarabic.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.joincoded.duolingoarabic.utils.Routes

@Composable
fun NavScreen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.onBoardingRoute) {
        composable(Routes.onBoardingRoute) {
        }

        composable(Routes.loginRoute) {
        }

        composable(Routes.signupRoute){
        }

        composable(Routes.chaptersRoute){
        }

        composable(Routes.lessonsRoute){
        }

        composable(Routes.progressRoute){
        }

        composable(Routes.userRoute){
        }
    }
}