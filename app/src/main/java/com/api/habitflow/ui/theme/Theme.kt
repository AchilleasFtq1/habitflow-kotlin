package com.api.habitflow.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.api.habitflow.ui.theme.PrimaryColor
import com.api.habitflow.ui.theme.SecondaryColor

private val DarkColorPalette = darkColors(
    primary = PrimaryColor,
    secondary = SecondaryColor
)

private val LightColorPalette = lightColors(
    primary = PrimaryColor,
    secondary = SecondaryColor
)

@Composable
fun HabitFiveTheme(content: @Composable () -> Unit) {
    val colors = if (isSystemInDarkTheme()) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
    MaterialTheme(colors = colors, content = content)
}
