package com.sopt.a35_sopkathon_android_android1.presentation.jiwon

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sopt.a35_sopkathon_android_android1.presentation.jiwon.homeScreenComponent.homeScreenChip
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme

@Composable
fun JiwonRoute(
    navigateToMinjae: () -> Unit,
    navigateToMinseo: () -> Unit,
) {
    JiwonScreen(
        navigateToMinjae = navigateToMinjae,
        navigateToMinseo = navigateToMinseo
    )
}

@Composable
fun JiwonScreen(
    navigateToMinjae: () -> Unit,
    navigateToMinseo: () -> Unit,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = JJanPicialTheme.colors.white)
            .padding(vertical = 50.dp, horizontal = 15.dp)
    ){
        Column(
            modifier = modifier,
        ){
            Text(
                text = "'솝트'님의 짠-피셜은?",
                color = JJanPicialTheme.colors.black
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(8.dp))
                .height(420.dp)
                .fillMaxWidth()
                .background(JJanPicialTheme.colors.gray200)
                .padding(horizontal = 15.dp, vertical = 15.dp),
            verticalArrangement = Arrangement.Top
        ) {
            //캐릭터 사진 들어가야 함
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .background(JJanPicialTheme.colors.gray300),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = "캐릭터 이미지",
                )
            }

            Spacer(modifier = modifier.height(20.dp))

            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(65.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.Top,
            ){
                Column(
                    modifier = modifier,
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start
                ){
                    Text(
                        text = "파트",
                    )
                    Spacer(modifier = modifier.height(10.dp))
                    Text(
                        text = "디자인",
                    )
                }

                Column(
                    modifier = modifier,
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start
                ){
                    Text(
                        text = "주량지수",
                    )
                    Spacer(modifier = modifier.height(10.dp))
                    Text(
                        text = "2.5 JP",
                    )
                }

                Column(
                    modifier = modifier,
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start
                ){
                    Text(
                        text = "짠-BTI",
                    )
                    Spacer(modifier = modifier.height(10.dp))
                    Text(
                        text = "배부른 거북이",
                    )
                }

            }
        }

        Spacer(modifier = modifier.height(30.dp))

        Column(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(8.dp))
                .height(200.dp)
                .fillMaxWidth()
                .background(JJanPicialTheme.colors.gray200)
                .padding(horizontal = 15.dp, vertical = 15.dp),
            verticalArrangement = Arrangement.Top
        ) {


            Row(
                modifier = modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceBetween
            ){

                Text(
                    text = "랭킹",
                )

                homeScreenChip(
                    modifier = modifier,
                    onClick = navigateToMinseo,
                    content = "전체랭킹 >"
                )

            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun ShowJiwonScreen() {
    JJanPicialTheme {
        JiwonScreen(
            navigateToMinjae = {},
            navigateToMinseo = {}
        )
    }
}