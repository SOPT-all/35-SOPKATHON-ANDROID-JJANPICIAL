package com.sopt.a35_sopkathon_android_android1.presentation.sehun

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sopt.a35_sopkathon_android_android1.data.dto.response.RankingResponseDto
import com.sopt.a35_sopkathon_android_android1.data.service.ServicePool
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RankingViewModel : ViewModel() {
    private val _uiState: MutableStateFlow<RankingUiState> = MutableStateFlow(RankingUiState())
    val uiState: StateFlow<RankingUiState> get() = _uiState.asStateFlow()

    fun getPartRanking() {
        viewModelScope.launch {
            runCatching {
                ServicePool.rankingService.getExampleData("all")
            }.onSuccess {
                _uiState.value = it.toUi()
            }.onFailure {
                _uiState.value = uiState.value.copy(isError = true)
            }
        }
    }
}

data class RankingUiState(
    val isError: Boolean = false,
    val isLoading: Boolean = true,
    val loginUser: Ranking? = null,
    val ranking: List<Ranking> = emptyList(),
) {
    data class Ranking(
        val name: String,
        val imageUrl: String,
        val ranking: Int,
        val part: String,
        val jpLevel: Double,
        val jbti: String,
        val isLoginUser: Boolean,
    )
}

fun RankingResponseDto.toUi(): RankingUiState = RankingUiState(
    loginUser = loginUser.toUi(),
    ranking = rankings.map { it.toUi() }
)

fun RankingResponseDto.Ranking.toUi(): RankingUiState.Ranking = RankingUiState.Ranking(
    name = name,
    imageUrl = imageUrl,
    ranking = ranking,
    jpLevel = jpLevel,
    part = part,
    jbti = jbti,
    isLoginUser = isLoginUser,
)
