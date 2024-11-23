package com.sopt.a35_sopkathon_android_android1.presentation.minseo

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sopt.a35_sopkathon_android_android1.presentation.sehun.component.RankingItem
import com.sopt.a35_sopkathon_android_android1.presentation.sehun.component.RankingMyInfoBox
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme.colors
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme.typography

@Composable
fun RankingAllScreen(
    onBattleClick: () -> Unit,
    rankingViewModel: RankingViewModel = viewModel(),
) {
    LaunchedEffect(Unit) {
        rankingViewModel.getRanking()
    }

    val uiState = rankingViewModel.uiState.collectAsStateWithLifecycle()

    RankingAllScreen(
        name = uiState.value.loginUser?.name.orEmpty(),
        jbti = uiState.value.loginUser?.jbti.orEmpty(),
        jpLevel = uiState.value.loginUser?.jpLevel ?: 0.0,
        partName = uiState.value.loginUser?.part.orEmpty(),
        imageUrl = uiState.value.loginUser?.imageUrl.orEmpty(),
        users = uiState.value.ranking,
        onBattleClick = onBattleClick,
    )
}

@Composable
private fun RankingAllScreen(
    name: String,
    jbti: String,
    jpLevel: Double,
    imageUrl: String,
    users: List<RankingUiState.Ranking>,
    onBattleClick: () -> Unit,
    partName: String,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
    ) {
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
            partName = partName,
            imageUrl = imageUrl,
        )
        Spacer(modifier = Modifier.height(height = 24.dp))
        Text(
            text = "전체 ${users.size}명",
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
