package com.sopt.a35_sopkathon_android_android1.minseo

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MinseoRoute() {
    MinseoScreen()
}

@Composable
fun MinseoScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "민서 스크린"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ShowMinseoScreen() {
    MinseoScreen()
}