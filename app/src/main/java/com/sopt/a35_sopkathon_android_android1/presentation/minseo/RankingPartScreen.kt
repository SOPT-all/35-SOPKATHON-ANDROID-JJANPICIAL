package com.sopt.a35_sopkathon_android_android1.presentation.minseo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sopt.a35_sopkathon_android_android1.R
import com.sopt.a35_sopkathon_android_android1.presentation.minseo.component.RankingButton
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme

@Composable
fun RankingPartScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 20.dp)
    ) {
        Row {
            Text(
                text = "과연 1위는?!",
                style = JJanPicialTheme.typography.head3Bold,
                color = JJanPicialTheme.colors.gray950
            )

            Text(
                text = "서버",
                style = JJanPicialTheme.typography.head3Bold,
                color = JJanPicialTheme.colors.primaryGreen1,
                modifier = Modifier.padding(start = 10.dp)
            )
        }
        Spacer(Modifier.height(10.dp))

        Image(
            painter = painterResource(R.drawable.img_ranking_graphic),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(328f/222f),
            contentScale = ContentScale.Crop
        )
        Spacer(Modifier.height(20.dp))

        Text(
            text = "파트별 랭킹 확인하기",
            style = JJanPicialTheme.typography.head3Bold,
            color = JJanPicialTheme.colors.gray950
        )
        Spacer(Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Box {
                    RankingButton(part = "기획", onClick = {})
                    Image(
                        painter = painterResource(R.drawable.img_chip_ranking_rank2),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(6.dp)
                            .size(34.dp)
                            .align(alignment = Alignment.TopEnd)
                    )
                }
                RankingButton(part = "웹", onClick = {})
                Box {
                    RankingButton(part = "안드", onClick = {})
                    Image(
                        painter = painterResource(R.drawable.img_chip_ranking_rank3),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(6.dp)
                            .size(34.dp)
                            .align(alignment = Alignment.TopEnd)
                    )
                }
            }
            Spacer(Modifier.width(8.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                RankingButton(part = "디자인", onClick = {})
                RankingButton(part = "아요", onClick = {})
                Box {
                    RankingButton(part = "서버", onClick = {})
                    Image(
                        painter = painterResource(R.drawable.img_chip_ranking_rank1),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(6.dp)
                            .size(34.dp)
                            .align(alignment = Alignment.TopEnd)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ShowRankingPartScreen() {
    JJanPicialTheme {
        RankingPartScreen()
    }
}