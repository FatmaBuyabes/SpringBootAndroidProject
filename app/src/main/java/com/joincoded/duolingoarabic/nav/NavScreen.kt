package com.joincoded.duolingoarabic.nav

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.joincoded.duolingoarabic.viewModel.AccountViewModel
import com.joincoded.duolingoarabic.viewModel.ArabicViewModel

@Composable
fun NavScreen() {
    val navController = rememberNavController()
    val viewModel: ArabicViewModel = viewModel()
    val viewModelAccount : AccountViewModel = viewModel()


    var startDestination = onboardingRoute
    if (viewModel.token?.token != null) {
        startDestination = loginRoute
        navController.navigate(loginRoute)
    }


//
//
//    NavHost(navController = navController, startDestination = startDestination) {
//        composable(onboardingRoute) {
//            WelcomeScreen(navController = navController, viewModel)
//        }
//
//        composable(loginRoute) {
//            loginRoute(viewModel)
//        }
//
//        composable(loginRoute){
//            BankMainScreen(navController = navController, viewModel)
//        }
//
//    }
}