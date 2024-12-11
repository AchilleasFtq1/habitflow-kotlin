package com.api.habitflow.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material.Text
import com.api.habitflow.data.database.Habit

@Composable
fun HabitCard(habit: Habit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray, RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Text(habit.name, color = Color.Black)
        Spacer(modifier = Modifier.height(4.dp))
        Text(habit.reason, color = Color.DarkGray)
    }
}
