package com.sopt.a35_sopkathon_android_android1.ui.theme

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

object JJanPicialTheme {
    val colors: JJanPicialColors
        @Composable
        @ReadOnlyComposable
        get() = LocalJJanPicalColors.current

    val typography: JJanPicialTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalJJanPicialTypography.current
}

@Composable
fun provideJJanPicialColorsAndTypography(
    colors: JJanPicialColors,
    typography: JJanPicialTypography,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalJJanPicalColors provides colors,
        LocalJJanPicialTypography provides typography,
        content = content,
    )
}

@Composable
fun JJanPicialTheme(content: @Composable () -> Unit) {
    val color = defaultJJanPicialColors
    val typography = defaultJJanPicialTypography

    provideJJanPicialColorsAndTypography(
        colors = color,
        typography = typography
    ){
        val view = LocalView.current
        if (!view.isInEditMode) {
            SideEffect {
                val window = (view.context as Activity).window
                window.statusBarColor = Color.White.toArgb()
                WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars =
                    true
            }
        }
        MaterialTheme(content = content)
    }
}
