package com.sopt.a35_sopkathon_android_android1.presentation.minseo.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme

@Composable
fun RankingButton(
    modifier: Modifier = Modifier,
    part: String,
    onClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }

    Column(
        modifier = modifier
            .padding(bottom = 8.dp)
            .fillMaxWidth()
            .aspectRatio(160f / 73f)
            .background(color = JJanPicialTheme.colors.gray100, shape = RoundedCornerShape(8.dp))
            .clickable(
                interactionSource = interactionSource,
                indication = null
            ) {
                onClick
            },
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = part,
            style = JJanPicialTheme.typography.title2Medium,
            color = JJanPicialTheme.colors.gray950
        )
    }
}
