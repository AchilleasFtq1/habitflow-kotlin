package com.api.habitflow.data.database

import androidx.room.*
import com.api.habitflow.data.database.Habit
import kotlinx.coroutines.flow.Flow

@Dao
interface HabitDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertHabit(habit: Habit)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLog(log: Log)

    @Query("SELECT * FROM Habit")
    fun getAllHabits(): Flow<List<Habit>>

    @Query("SELECT * FROM Log WHERE habitId = :habitId AND date = :date")
    suspend fun getLog(habitId: Int, date: String): Log?
}
