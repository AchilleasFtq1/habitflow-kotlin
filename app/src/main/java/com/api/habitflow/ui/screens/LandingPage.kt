package com.api.habitflow.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.api.habitflow.ui.components.HabitCard
import com.api.habitflow.viewmodel.HabitViewModel

@Composable
fun LandingPage(viewModel: HabitViewModel, onCreateHabit: () -> Unit) {
    val habits = viewModel.allHabits.collectAsState(initial = emptyList()).value

    Column(modifier = Modifier.padding(16.dp)) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(habits) { habit ->
                HabitCard(habit = habit)
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}
