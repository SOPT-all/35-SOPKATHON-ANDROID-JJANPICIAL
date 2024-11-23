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

object JJanfficialTheme {
    val colors: JJanfficialColors
        @Composable
        @ReadOnlyComposable
        get() = LocalJJanfficalColors.current

//    val typography: JJanfficialTypography
//        @Composable
//        @ReadOnlyComposable
//        get() = LocalJJanfficialTypography.current
}

@Composable
fun provideJJanfficialColorsAndTypography(
    colors: JJanfficialColors,
    //typography: JJanfficialTypography,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalJJanfficalColors provides colors,
        //LocalJJanfficialTypography provides typography,
        content = content,
    )
}

@Composable
fun JJanfficialTheme(content: @Composable () -> Unit) {
    val color = defaultJJanfficialColors
    //val typography = defaultJJanfficialTypography

    provideJJanfficialColorsAndTypography(color /*typography*/) {
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
