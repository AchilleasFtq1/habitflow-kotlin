package com.api.habitflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.api.habitflow.HabitTrackerApp
import com.api.habitflow.ui.theme.HabitFiveTheme
import com.api.habitflow.viewmodel.HabitViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val viewModel: HabitViewModel = viewModel()
            HabitFiveTheme {
                HabitTrackerApp(viewModel)
            }
        }
    }
}
