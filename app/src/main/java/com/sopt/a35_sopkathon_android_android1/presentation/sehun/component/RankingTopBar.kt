package com.sopt.a35_sopkathon_android_android1.presentation.sehun.component

import androidx.compose.foundation.clickable
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.sopt.a35_sopkathon_android_android1.R.drawable.ic_arrow_left
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme.colors
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme.typography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RankingTopBar(
    partName: String,
    onBackPressed: () -> Unit,
    modifier: Modifier = Modifier,
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "$partName 파트 랭킹",
                style = typography.head3Bold,
                color = colors.black,
            )
        },
        navigationIcon = {
            Icon(
                imageVector = ImageVector.vectorResource(ic_arrow_left),
                contentDescription = null,
                modifier = Modifier.clickable {
                    onBackPressed()
                },
            )
        },
        modifier = modifier,
    )
}

@Preview
@Composable
private fun RankingTopBarPreview() {
    JJanPicialTheme {
        RankingTopBar(
            partName = "디자인",
            onBackPressed = {}
        )
    }
}
