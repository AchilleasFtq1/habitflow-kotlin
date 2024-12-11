package com.api.habitflow.data.repository

import com.api.habitflow.data.database.Habit
import com.api.habitflow.data.database.HabitDao
import com.api.habitflow.data.database.Log

import kotlinx.coroutines.flow.Flow

class HabitRepository(private val habitDao: HabitDao) {
    val allHabits: Flow<List<Habit>> = habitDao.getAllHabits()

    suspend fun insertHabit(habit: Habit) = habitDao.insertHabit(habit)

    suspend fun insertLog(log: Log) = habitDao.insertLog(log)

    suspend fun getLog(habitId: Int, date: String) = habitDao.getLog(habitId, date)
}
