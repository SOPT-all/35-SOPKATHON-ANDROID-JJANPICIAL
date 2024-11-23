package com.sopt.a35_sopkathon_android_android1.presentation.sehun.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme.colors
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme.typography

@Composable
fun RankingMyInfoBox(
    name: String,
    jbti: String,
    imageUrl: String,
    jpLevel: Double,
    partName: String,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = colors.primaryGreen1,
                shape = RoundedCornerShape(size = 8.dp)
            )
            .padding(all = 16.dp),
    ) {
        AsyncImage(
            model = imageUrl,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(size = 128.dp)
                .clip(shape = RoundedCornerShape(size = 8.dp)),
        )
        Spacer(modifier = Modifier.width(width = 12.dp))
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Row(
                verticalAlignment = CenterVertically,
            ) {
                Text(
                    text = name,
                    style = typography.head3Bold,
                    color = colors.white,
                )
                Spacer(modifier = Modifier.width(width = 12.dp))
                Text(
                    text = jbti,
                    style = typography.body1Bold,
                    color = colors.gray50,
                )
            }
            Spacer(modifier = Modifier.height(height = 16.dp))
            Row(
                verticalAlignment = CenterVertically,
            ) {
                Text(
                    text = "JP 지수",
                    style = typography.title2Medium,
                    color = colors.subGreen1,
                )
                Spacer(modifier = Modifier.width(width = 12.dp))
                Text(
                    text = jpLevel.toString(),
                    style = typography.body1Bold,
                    color = colors.primaryBlack1,
                )
            }
            Spacer(modifier = Modifier.height(height = 8.dp))
            Row(
                verticalAlignment = CenterVertically,
            ) {
                Text(
                    text = "파트",
                    style = typography.title2Medium,
                    color = colors.subGreen1,
                )
                Spacer(modifier = Modifier.width(width = 12.dp))
                Text(
                    text = partName,
                    style = typography.body1Bold,
                    color = colors.primaryBlack1,
                )
            }
        }
    }
}
