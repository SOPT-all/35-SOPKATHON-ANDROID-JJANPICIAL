package com.sopt.a35_sopkathon_android_android1.presentation.minjae

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme

@Composable
fun MinjaeRoute() {
    MinjaeScreen()
}

@Composable
fun MinjaeScreen(

) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "민재 스크린"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ShowMinjaeScreen() {
    JJanPicialTheme {
        MinjaeScreen()
    }
}