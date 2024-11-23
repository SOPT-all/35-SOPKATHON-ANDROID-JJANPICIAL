package com.sopt.a35_sopkathon_android_android1.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val Black = Color(0xFF000000)
val White = Color(0xFFFFFFFF)

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

val primarygreen1 = Color(0x00C911FF)
val primaryblack1 = Color(0x1F2A37FF)

val subgreen1 = Color(0x00810DFF)
val subgreen2 = Color(0xB0E742FF)


@Immutable
data class JJanfficialColors(
    val Black: Color,
    val White: Color,
    val Gray25: Color,
    val Gray50: Color,
    val Gray100: Color,
    val Gray200: Color,
    val Gray300: Color,
    val Gray400: Color,
    val Gray500: Color,
    val Gray600: Color,
    val Gray700: Color,
    val Gray800: Color,
    val Gray900: Color,
    val Gray950: Color
)

val defaultJJanfficialColors = JJanfficialColors(
    Black = Black,
    White = White,
    Gray25 = Gray25,
    Gray50 = Gray50,
    Gray100 = Gray100,
    Gray200 = Gray200,
    Gray300 = Gray300,
    Gray400 = Gray400,
    Gray500 = Gray500,
    Gray600 = Gray600,
    Gray700 = Gray700,
    Gray800 = Gray800,
    Gray900 = Gray900,
    Gray950 = Gray950
)

val LocalJJanfficalColors = staticCompositionLocalOf { defaultJJanfficialColors }
