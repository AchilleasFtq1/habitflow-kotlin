package com.api.habitflow.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Log(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val habitId: Int,               // Foreign key reference to the Habit ID
    val date: String,               // Date of the log entry (e.g., "2024-12-10")
    val value: String               // Tracked value (JSON, boolean, or count based on mode)
)
