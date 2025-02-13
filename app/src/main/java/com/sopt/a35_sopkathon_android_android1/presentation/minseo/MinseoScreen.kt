package com.sopt.a35_sopkathon_android_android1.presentation.minseo

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme

@Composable
fun MinseoRoute(
    onBattleClick: (String) -> Unit,
    navigateToSehun: (String) -> Unit,
) {
    RankingScreen(
        onBattleClick = onBattleClick,
        navigateToSehun = navigateToSehun
    )
}

@Composable
fun RankingScreen(
    onBattleClick: (String) -> Unit,
    navigateToSehun: (String) -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var isPartClicked by remember {
            mutableStateOf(true)
        }
        var isAllClicked by remember {
            mutableStateOf(false)
        }

        val interactionSource = remember { MutableInteractionSource() }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(46.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "랭킹",
                style = JJanPicialTheme.typography.head3Bold,
                color = JJanPicialTheme.colors.black
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(42.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clickable(
                        interactionSource = interactionSource,
                        indication = null
                    ) {
                        isPartClicked = true
                        isAllClicked = false
                    },
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "파트별",
                        color = if (isPartClicked) {
                            JJanPicialTheme.colors.black
                        } else {
                            JJanPicialTheme.colors.gray400
                        },
                        style = JJanPicialTheme.typography.body2Medium
                    )
                }
                HorizontalDivider(
                    modifier = Modifier.fillMaxWidth(),
                    thickness = 2.dp,
                    color = if (isPartClicked) {
                        JJanPicialTheme.colors.primaryGreen1
                    } else {
                        JJanPicialTheme.colors.gray400
                    }
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clickable(
                        interactionSource = interactionSource,
                        indication = null
                    ) {
                        isPartClicked = false
                        isAllClicked = true
                    },
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "전체",
                        color = if (isAllClicked) {
                            JJanPicialTheme.colors.black
                        } else {
                            JJanPicialTheme.colors.gray400
                        },
                        style = JJanPicialTheme.typography.body2Medium
                    )
                }
                HorizontalDivider(
                    modifier = Modifier.fillMaxWidth(),
                    thickness = 2.dp,
                    color = if (isAllClicked) {
                        JJanPicialTheme.colors.primaryGreen1
                    } else {
                        JJanPicialTheme.colors.gray400
                    }
                )
            }
        }

        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            if (isPartClicked) {
                RankingPartScreen(navigateToSehun = navigateToSehun)
            } else {
                RankingAllScreen(
                    onBattleClick = onBattleClick,
                )
            }
        }
    }
}
