package com.sopt.a35_sopkathon_android_android1.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.sopt.a35_sopkathon_android_android1.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

@Immutable
data class JJanPicialTypography(
    val head1Bold: TextStyle,
    val head2Bold: TextStyle,
    val head3Bold: TextStyle,
    val title1Bold: TextStyle,
    val title2Medium: TextStyle,
    val body1Bold: TextStyle,
    val body2Medium: TextStyle,
    val body3Regular: TextStyle,
    val body4Regular: TextStyle,
    val caption1Medium: TextStyle,
    val caption2Regular: TextStyle,
)

val defaultJJanPicialTypography = JJanPicialTypography(
    head1Bold = TextStyle(
        fontFamily = FontFamily(Font(R.font.pretendard_bold)),
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        lineHeight = 30.sp,
        letterSpacing = (-1).sp
    ),
    head2Bold = TextStyle(
        fontFamily = FontFamily(Font(R.font.pretendard_bold)),
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 26.sp,
        letterSpacing = (-1).sp
    ),
    head3Bold = TextStyle(
        fontFamily = FontFamily(Font(R.font.pretendard_bold)),
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        lineHeight = 26.sp,
        letterSpacing = (-1).sp
    ),
    title1Bold = TextStyle(
        fontFamily = FontFamily(Font(R.font.pretendard_bold)),
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        lineHeight = 22.sp,
        letterSpacing = (-1).sp
    ),
    title2Medium = TextStyle(
        fontFamily = FontFamily(Font(R.font.pretendard_medium)),
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        lineHeight = 22.sp,
        letterSpacing = (-1).sp
    ),
    body1Bold = TextStyle(
        fontFamily = FontFamily(Font(R.font.pretendard_bold)),
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = (-1).sp
    ),
    body2Medium = TextStyle(
        fontFamily = FontFamily(Font(R.font.pretendard_medium)),
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = (-1).sp
    ),
    body3Regular = TextStyle(
        fontFamily = FontFamily(Font(R.font.pretendard_regular)),
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = (-1).sp
    ),
    body4Regular = TextStyle(
        fontFamily = FontFamily(Font(R.font.pretendard_regular)),
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = (-1).sp
    ),
    caption1Medium = TextStyle(
        fontFamily = FontFamily(Font(R.font.pretendard_medium)),
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        letterSpacing = (-1).sp
    ),
    caption2Regular = TextStyle(
        fontFamily = FontFamily(Font(R.font.pretendard_regular)),
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        letterSpacing = (-1).sp
    )
)

val LocalJJanPicialTypography = staticCompositionLocalOf { defaultJJanPicialTypography }
