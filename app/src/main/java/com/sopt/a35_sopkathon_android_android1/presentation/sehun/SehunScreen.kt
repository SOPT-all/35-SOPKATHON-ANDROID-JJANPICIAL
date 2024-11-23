package com.sopt.a35_sopkathon_android_android1.presentation.sehun

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanfficialTheme

@Composable
fun SehunRoute() {
    SehunScreen()
}

@Composable
fun SehunScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "세훈 스크린"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ShowSehunScreen() {
    JJanfficialTheme {
        SehunScreen()
    }
}