package com.sopt.a35_sopkathon_android_android1.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

object JJanfficialTheme {
    val colors : JJanfficialColors
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
){
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

    provideJJanfficialColorsAndTypography(color, /*typography*/) {
        val view = LocalView.current
        if (!view.isInEditMode) {
            SideEffect {
                val window = (view.context as Activity).window
                window.statusBarColor = Color.White.toArgb() // 상태 표시줄 색상을 흰색으로 설정
                WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = true // 상태 표시줄 아이콘 색상을 항상 검정색으로 설정
            }
        }
        MaterialTheme(content = content)
    }
}
