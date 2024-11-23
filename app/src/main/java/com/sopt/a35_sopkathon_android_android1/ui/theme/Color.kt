package com.sopt.a35_sopkathon_android_android1.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Black = Color(0xFF000000)
val White = Color(0xFFFFFFFF)

// Primary
val PrimaryGreen1 = Color(0x00C911FF)
val PrimaryBlack1 = Color(0x1F2A37FF)

// Secondary
val SubGreen1 = Color(0x00810DFF)
val SubGreen2 = Color(0xB0E742FF)

// Gray Scale
val Gray25 = Color(0xFCFCFDFF)
val Gray50 = Color(0xF9FAFBFF)
val Gray100 = Color(0xF3F4F6FF)
val Gray200 = Color(0xE5E7EBFF)
val Gray300 = Color(0xD2D6DBFF)
val Gray400 = Color(0x9DA4AEFF)
val Gray500 = Color(0x6C737FFF)
val Gray600 = Color(0x4D5761FF)
val Gray700 = Color(0x384250FF)
val Gray800 = Color(0x1F2A37FF)
val Gray900 = Color(0x111927FF)
val Gray950 = Color(0x0D121CFF)

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
