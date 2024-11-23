package com.sopt.a35_sopkathon_android_android1.presentation.sehun

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sopt.a35_sopkathon_android_android1.presentation.minseo.RankingUiState
import com.sopt.a35_sopkathon_android_android1.presentation.sehun.component.RankingItem
import com.sopt.a35_sopkathon_android_android1.presentation.sehun.component.RankingMyInfoBox
import com.sopt.a35_sopkathon_android_android1.presentation.sehun.component.RankingTopBar
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme.colors
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme.typography

@Composable
fun SehunRoute(
    onBackPressed: () -> Unit,
    onBattleClick: (String) -> Unit,
    rankingDetailViewModel: RankingDetailViewModel = viewModel(),
    partName: String,
) {
    val partDetailName by remember { mutableStateOf(partName.replace("{", "").replace("}", "")) }
    LaunchedEffect(Unit) {
        rankingDetailViewModel.getPartRanking(partDetailName)
    }

    val uiState = rankingDetailViewModel.uiState.collectAsStateWithLifecycle()

    SehunScreen(
        name = uiState.value.loginUser?.name.orEmpty(),
        jbti = uiState.value.loginUser?.jbti.orEmpty(),
        jpLevel = uiState.value.loginUser?.jpLevel ?: 0.0,
        myPartName = uiState.value.loginUser?.part.orEmpty(),
        partName = when (partDetailName) {
            "plan" -> "기획"
            "design" -> "디자인"
            "server" -> "서버"
            "android" -> "안드로이드"
            "ios" -> "아요"
            "web" -> "웹"
            else -> "안드로이드"
        },
        imageUrl = uiState.value.loginUser?.imageUrl.orEmpty(),
        users = uiState.value.ranking,
        onBattleClick = onBattleClick,
        onBackPressed = onBackPressed,
    )
}

@Composable
fun SehunScreen(
    name: String,
    jbti: String,
    jpLevel: Double,
    imageUrl: String,
    users: List<RankingUiState.Ranking>,
    onBattleClick: (String) -> Unit,
    onBackPressed: () -> Unit,
    myPartName: String,
    partName: String,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
    ) {
        RankingTopBar(
            partName = partName,
            onBackPressed = onBackPressed,
        )
        Spacer(modifier = Modifier.height(height = 16.dp))
        Text(
            text = "나의 정보",
            style = typography.head3Bold,
            color = colors.gray950,
        )
        Spacer(modifier = Modifier.height(height = 10.dp))
        RankingMyInfoBox(
            name = name,
            jbti = jbti,
            jpLevel = jpLevel,
            partName = myPartName,
            imageUrl = imageUrl,
        )
        Spacer(modifier = Modifier.height(height = 24.dp))
        Text(
            text = "$partName 파트 리스트",
            style = typography.head3Bold,
            color = colors.gray950,
        )
        Spacer(modifier = Modifier.height(height = 10.dp))
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(space = 8.dp),
        ) {
            items(users) { user ->
                RankingItem(
                    rank = user.ranking,
                    isLogin = user.isLoginUser,
                    name = user.name,
                    jbti = user.jbti,
                    jpLevel = user.jpLevel,
                    partName = user.part,
                    imageUrl = user.imageUrl,
                    onBattleClick = onBattleClick,
                )
            }
        }
    }
}
