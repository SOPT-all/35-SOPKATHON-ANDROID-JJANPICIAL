package com.sopt.a35_sopkathon_android_android1.presentation.jiwon.homeScreenComponent

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialColors
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme

@Composable
fun homeScreenChip(
    modifier: Modifier = Modifier,
    content: String,
    onClick: () -> Unit
){

    Box(
        modifier = Modifier
            .clickable {onClick()}
            .clip(RoundedCornerShape(8.dp))
            .background(JJanPicialTheme.colors.white)
            .padding(vertical = 4.dp, horizontal = 8.dp),
    ){
        Text(
            text = content,
            style = JJanPicialTheme.typography.body3Regular,
            color = JJanPicialTheme.colors.gray700,
        )
    }
}

@Preview
@Composable
fun homeScreenChipPreview(){
    homeScreenChip(
        onClick = {},
        modifier = Modifier,
        content = "전체랭킹 >"
    )
}