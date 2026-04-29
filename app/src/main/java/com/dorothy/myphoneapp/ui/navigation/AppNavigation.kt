package com.dorothy.myphoneapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dorothy.myphoneapp.ui.screens.onboarding.OnboardingScreen
import com.dorothy.myphoneapp.ui.screens.authentication.login.LoginScreen


@Composable
fun AppNavigation(navController: NavHostController, modifier: Modifier){
    NavHost(
        navController = navController,
        startDestination = ROUTES.Onboarding.name
    ) {
        composable (ROUTES.Onboarding.name){ OnboardingScreen(navController) }
        composable (ROUTES.Login.name){ LoginScreen(navController, modifier) }
    }
}