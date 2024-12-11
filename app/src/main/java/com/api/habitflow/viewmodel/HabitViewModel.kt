package com.api.habitflow.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.api.habitflow.data.database.Habit
import com.api.habitflow.data.database.HabitDatabase
import com.api.habitflow.data.repository.HabitRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class HabitViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: HabitRepository
    val allHabits: Flow<List<Habit>>

    init {
        val habitDao = HabitDatabase.getInstance(application).habitDao()
        repository = HabitRepository(habitDao)
        allHabits = repository.allHabits
    }

    fun addHabit(habit: Habit) = viewModelScope.launch {
        repository.insertHabit(habit)
    }
}
