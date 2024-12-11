package com.api.habitflow.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Habit(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,               // Name of the habit
    val reason: String,             // Why the user wants this habit
    val trackingMode: String,       // Tracking mode (e.g., Yes/No, Count, Time, List)
    val frequency: String,          // Frequency (Daily, Weekly, Monthly)
    val targetValue: Int            // Target value for tracking (if applicable)
)
