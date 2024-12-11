package com.api.habitflow

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.api.habitflow.navigation.NavGraph
import com.api.habitflow.viewmodel.HabitViewModel

@Composable
fun HabitTrackerApp(viewModel: HabitViewModel) {
    val navController = rememberNavController()
    NavGraph(navController = navController, viewModel = viewModel)
}
