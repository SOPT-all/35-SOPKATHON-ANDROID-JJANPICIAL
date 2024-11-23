package com.sopt.a35_sopkathon_android_android1.presentation.jiwon

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sopt.a35_sopkathon_android_android1.R
import com.sopt.a35_sopkathon_android_android1.presentation.jiwon.homeScreenComponent.homeScreenChip
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme

@Composable
fun JiwonRoute(
    navigateToMinseo: () -> Unit,
) {
    JiwonScreen(
        navigateToMinseo = navigateToMinseo
    )
}

@Composable
fun JiwonScreen(
    homeScreenViewModel: HomeScreenViewModel = viewModel(),
    navigateToMinseo: () -> Unit,
    modifier: Modifier = Modifier
) {

    val userState = homeScreenViewModel.userState.value

    LaunchedEffect(Unit) {
        homeScreenViewModel.getUserData()
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = JJanPicialTheme.colors.white)
            .padding(top = 70.dp, start = 20.dp, end = 20.dp, bottom = 20.dp)
    ){
        Column(
            modifier = modifier,
        ){
            Row(
                modifier = modifier,
            ){
                Text(
                    text = "안녕하세요, ",
                    style = JJanPicialTheme.typography.head2Bold,
                    color = JJanPicialTheme.colors.black
                )
                Text(
                    text = "${userState?.name}",
                    style = JJanPicialTheme.typography.head2Bold,
                    color = JJanPicialTheme.colors.primaryGreen1
                )
                Text(
                    text = "님",
                    style = JJanPicialTheme.typography.head2Bold,
                    color = JJanPicialTheme.colors.black
                )
            }
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = "오늘도 재밌는 술 마셔봐요!",
                style = JJanPicialTheme.typography.head2Bold,
                color = JJanPicialTheme.colors.black
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(8.dp))
                .height(450.dp)
                .fillMaxWidth()
                .background(JJanPicialTheme.colors.primaryBlack1)
                .padding(top = 30.dp, bottom = 10.dp, start = 20.dp, end = 20.dp),
            verticalArrangement = Arrangement.Top
        ) {

            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = "나의 짠-피셜",
                    style = JJanPicialTheme.typography.head3Bold,
                    color = JJanPicialTheme.colors.white
                )
                Spacer(modifier = modifier.width(25.dp))
                Text(
                    text = "${userState?.jbti}",
                    style = JJanPicialTheme.typography.title1Bold,
                    color = JJanPicialTheme.colors.primaryGreen1
                )
            }
            Spacer(modifier = modifier.height(10.dp))

            Image(
                painter = painterResource(id = R.drawable.img_home_charcter),
                contentDescription = "술비티아이 캐릭터",
                modifier = Modifier
                    .size(300.dp)
                    .align(Alignment.CenterHorizontally)
            )

            //Spacer(modifier = modifier.height(10.dp))

            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(8.dp))
                    .background(JJanPicialTheme.colors.white)
                    .padding(vertical =18.dp, horizontal = 35.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Row(
                    modifier = modifier,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "JP지수",
                        style = JJanPicialTheme.typography.body1Bold,
                        color = JJanPicialTheme.colors.black
                    )
                    Spacer(modifier = modifier.width(10.dp))
                    Text(
                        text = "${userState?.jpLevel} JP",
                        style = JJanPicialTheme.typography.head3Bold,
                        color = JJanPicialTheme.colors.primaryGreen1
                    )
                }
                Spacer(modifier = modifier.height(20.dp))
                Row(
                    modifier = modifier,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "파트",
                        style = JJanPicialTheme.typography.body1Bold,
                        color = JJanPicialTheme.colors.black
                    )
                    Spacer(modifier = modifier.width(10.dp))
                    Text(
                        text = "${userState?.part}",
                        style = JJanPicialTheme.typography.head3Bold,
                        color = JJanPicialTheme.colors.primaryGreen1
                    )
                }
            }
        }

        Spacer(modifier = modifier.height(30.dp))

        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween

        ){
            Text(
                text = "나의 랭킹은요...",
                style = JJanPicialTheme.typography.head2Bold,
                color = JJanPicialTheme.colors.black
            )

            homeScreenChip(
                onClick = navigateToMinseo,
                modifier = Modifier,
                content = "랭킹 확인"
            )
        }

        Spacer(modifier = modifier.height(10.dp))

        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ){
            Column(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(8.dp))
                    .weight(1f)
                    .aspectRatio(1.5f)
                    .background(JJanPicialTheme.colors.primaryGreen1)
                    .padding(horizontal = 15.dp, vertical = 15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){

                    Text(
                        text = "개인 랭킹",
                        style = JJanPicialTheme.typography.head3Bold,
                        color = JJanPicialTheme.colors.white
                    )

                    Spacer(modifier = modifier.height(10.dp))

                    Text(
                        text = "${userState?.ranking}위",
                        style = JJanPicialTheme.typography.head1Bold,
                        color = JJanPicialTheme.colors.white
                    )
                }
            }

            Column(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(8.dp))
                    .weight(1f)
                    .aspectRatio(1.5f)
                    .background(JJanPicialTheme.colors.gray600)
                    .padding(horizontal = 15.dp, vertical = 15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){

                    Text(
                        text = "파트 랭킹",
                        style = JJanPicialTheme.typography.head3Bold,
                        color = JJanPicialTheme.colors.white
                    )

                    Spacer(modifier = modifier.height(10.dp))

                    Text(
                        text = "${userState?.partRanking}위",
                        style = JJanPicialTheme.typography.head1Bold,
                        color = JJanPicialTheme.colors.white
                    )
                }
            }


        }

    }
}


@Preview(showBackground = true)
@Composable
fun ShowJiwonScreen() {
    JJanPicialTheme {
        JiwonScreen(
            navigateToMinseo = {}
        )
    }
}
