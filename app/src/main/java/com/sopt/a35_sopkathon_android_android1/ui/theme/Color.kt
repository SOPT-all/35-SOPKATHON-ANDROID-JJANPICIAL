package com.sopt.a35_sopkathon_android_android1.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Black = Color(0xFF000000)
val White = Color(0xFFFFFFFF)

// Primary
val PrimaryGreen1 = Color(0xFF00C911)
val PrimaryBlack1 = Color(0xFF1F2A37)

// Secondary
val SubGreen1 = Color(0xFF00810D)
val SubGreen2 = Color(0xFFB0E742)

// Gray Scale
val Gray25 = Color(0xFFFCFCFD)
val Gray50 = Color(0xFFF9FAFB)
val Gray100 = Color(0xFFF3F4F6)
val Gray200 = Color(0xFFE5E7EB)
val Gray300 = Color(0xFFD2D6DB)
val Gray400 = Color(0xFF9DA4AE)
val Gray500 = Color(0xFF6C737F)
val Gray600 = Color(0xFF4D5761)
val Gray700 = Color(0xFF384250)
val Gray800 = Color(0xFF1F2A37)
val Gray900 = Color(0xFF111927)
val Gray950 = Color(0xFF0D121C)

@Immutable
data class JJanfficialColors(
    val black: Color,
    val white: Color,
    val primaryGreen1: Color,
    val primaryBlack1: Color,
    val subGreen1: Color,
    val subGreen2: Color,
    val gray25: Color,
    val gray50: Color,
    val gray100: Color,
    val gray200: Color,
    val gray300: Color,
    val gray400: Color,
    val gray500: Color,
    val gray600: Color,
    val gray700: Color,
    val gray800: Color,
    val gray900: Color,
    val gray950: Color
)

val defaultJJanfficialColors = JJanfficialColors(
    black = Black,
    white = White,
    primaryGreen1 = PrimaryGreen1,
    primaryBlack1 = PrimaryBlack1,
    subGreen1 = SubGreen1,
    subGreen2 = SubGreen2,
    gray25 = Gray25,
    gray50 = Gray50,
    gray100 = Gray100,
    gray200 = Gray200,
    gray300 = Gray300,
    gray400 = Gray400,
    gray500 = Gray500,
    gray600 = Gray600,
    gray700 = Gray700,
    gray800 = Gray800,
    gray900 = Gray900,
    gray950 = Gray950
)

val LocalJJanfficalColors = staticCompositionLocalOf { defaultJJanfficialColors }
