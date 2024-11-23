package com.sopt.a35_sopkathon_android_android1.presentation.minjae

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sopt.a35_sopkathon_android_android1.presentation.util.clickableWithoutRipple
import com.sopt.a35_sopkathon_android_android1.presentation.util.roundedBackgroundWithBorder
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme

@Composable
fun OnboardingSelectableButton(
    title: String,
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    onClick: () -> Unit = {}
) {
    Box(
        modifier = modifier
            .roundedBackgroundWithBorder(
                cornerRadius = 6.dp,
                backgroundColor = JJanPicialTheme.colors.gray100,
                borderColor = if(isSelected) JJanPicialTheme.colors.subGreen1 else Color.Transparent,
                borderWidth = if(isSelected) 1.dp else 0.dp
            )
            .clickableWithoutRipple(
                onClick = onClick
            )
    ) {
        Text(
            text = title,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(vertical = 20.dp),
            color = if(isSelected) JJanPicialTheme.colors.subGreen1 else JJanPicialTheme.colors.black,
            style = JJanPicialTheme.typography.body3Regular
        )
    }
}