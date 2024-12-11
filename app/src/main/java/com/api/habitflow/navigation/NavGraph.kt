package com.api.habitflow.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.api.habitflow.ui.screens.CreateHabitScreen
import com.api.habitflow.ui.screens.LandingPage
import com.api.habitflow.viewmodel.HabitViewModel

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object CreateHabit : Screen("create_habit")
}

@Composable
fun NavGraph(navController: NavHostController, viewModel: HabitViewModel) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            LandingPage(viewModel = viewModel, onCreateHabit = {
                navController.navigate(Screen.CreateHabit.route)
            })
        }
        composable(Screen.CreateHabit.route) {
            CreateHabitScreen(
                onSave = { habit ->
                    viewModel.addHabit(habit)
                    navController.popBackStack()
                },
                onCancel = {
                    navController.popBackStack()
                }
            )
        }
    }
}
