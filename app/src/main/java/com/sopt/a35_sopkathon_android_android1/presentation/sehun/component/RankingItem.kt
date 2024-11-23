package com.sopt.a35_sopkathon_android_android1.presentation.sehun.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Bottom
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme.colors
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme.typography

@Composable
fun RankingItem(
    rank: Int,
    isLogin: Boolean,
    name: String,
    jbti: String,
    imageUrl: String,
    jpLevel: Double,
    partName: String,
    onBattleClick: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Bottom,
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = if (isLogin) colors.primaryBlack1 else colors.gray100,
                shape = RoundedCornerShape(size = 8.dp)
            )
            .padding(
                horizontal = 12.dp,
                vertical = 14.dp,
            ),
    ) {

        AsyncImage(
            model = imageUrl,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(size = 72.dp)
                .clip(shape = CircleShape),
        )
        Spacer(modifier = Modifier.width(width = 16.dp))
        Column {
            Text(
                text = "$rank. $name",
                style = typography.body1Bold,
                color = if (isLogin) Color.White else colors.gray950,
            )
            Spacer(modifier = Modifier.height(height = 8.dp))
            Text(
                text = "JP 지수",
                style = typography.body3Regular,
                color = if (isLogin) Color.White else colors.gray950,
            )
            Spacer(modifier = Modifier.height(height = 8.dp))
            Text(
                text = "파트",
                style = typography.body3Regular,
                color = if (isLogin) Color.White else colors.gray950,
            )
        }
        Spacer(modifier = Modifier.width(width = 8.dp))
        Column {
            Text(
                text = jbti,
                style = typography.body4Regular,
                color = if (isLogin) colors.gray300 else colors.gray700,
            )
            Spacer(modifier = Modifier.height(height = 8.dp))
            Text(
                text = jpLevel.toString(),
                style = typography.body4Regular,
                color = colors.primaryGreen1,
            )
            Spacer(modifier = Modifier.height(height = 8.dp))
            Text(
                text = partName,
                style = typography.body4Regular,
                color = colors.primaryGreen1,
            )
        }
        Spacer(modifier = Modifier.weight(weight = 1f))
        Text(
            text = "배틀신청",
            style = typography.body4Regular,
            maxLines = 1,
            color = colors.gray25,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(size = 4.dp))
                .background(color = colors.primaryGreen1)
                .padding(
                    horizontal = 10.dp,
                    vertical = 6.dp,
                ).clickable {
                    onBattleClick(name)
                },
        )
    }
}

@Preview
@Composable
private fun RankingItemPreview() {
    JJanPicialTheme {
        RankingItem(
            rank = 2,
            isLogin = false,
            name = "TODO()",
            jbti = "TODO()",
            jpLevel = 3.5,
            partName = "TODO()",
            onBattleClick = {},
            imageUrl = "",
        )
    }
}
