package com.api.habitflow.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.api.habitflow.data.database.Habit
import com.api.habitflow.ui.components.CustomButton
import com.api.habitflow.ui.components.TextFieldInput

@SuppressLint("UnrememberedMutableState")
@Composable
fun CreateHabitScreen(onSave: (Habit) -> Unit, onCancel: () -> Unit) {
    var name by remember { mutableStateOf("") }
    var reason by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        TextFieldInput(value = mutableStateOf(name), label = "Habit Name")
        Spacer(modifier = Modifier.height(8.dp))
        TextFieldInput(value = mutableStateOf(reason), label = "Reason")
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            CustomButton(label = "Cancel", onClick = onCancel)
            Spacer(modifier = Modifier.width(8.dp))
            CustomButton(
                label = "Save",
                onClick = {
                    val habit = Habit(name = name, reason = reason, trackingMode = "Yes/No", frequency = "Daily", targetValue = 1)
                    onSave(habit)
                }
            )
        }
    }
}
