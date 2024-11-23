package com.sopt.a35_sopkathon_android_android1.presentation.minjae

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sopt.a35_sopkathon_android_android1.presentation.util.clickableWithoutRipple
import com.sopt.a35_sopkathon_android_android1.presentation.util.roundedBackgroundWithBorder
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme

@Composable
fun OnboardingConfirmButton(
    title: String,
    enabled: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Box(
        modifier = modifier
            .roundedBackgroundWithBorder(
                cornerRadius = 4.dp,
                backgroundColor = if(enabled) JJanPicialTheme.colors.primaryGreen1 else JJanPicialTheme.colors.gray600,
            )
            .clickableWithoutRipple(
                enabled = enabled,
                onClick = onClick
            )
    ) {
        Text(
            text = title,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(vertical = 12.5.dp),
            color = JJanPicialTheme.colors.white,
            style = JJanPicialTheme.typography.body2Medium
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ShowOnboardingRoundedButton() {
    JJanPicialTheme {
    }
}