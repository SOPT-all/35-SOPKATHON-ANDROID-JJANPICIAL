package com.sopt.a35_sopkathon_android_android1.presentation.sehun

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sopt.a35_sopkathon_android_android1.data.service.ServicePool
import com.sopt.a35_sopkathon_android_android1.presentation.minseo.RankingUiState
import com.sopt.a35_sopkathon_android_android1.presentation.minseo.toUi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RankingDetailViewModel : ViewModel() {
    private val _uiState: MutableStateFlow<RankingUiState> = MutableStateFlow(RankingUiState())
    val uiState: StateFlow<RankingUiState> get() = _uiState.asStateFlow()

    fun getPartRanking(partName: String) {
        viewModelScope.launch {
            runCatching {
                ServicePool.rankingService.getExampleData(
                    partName
                )
            }.onSuccess {
                _uiState.value = it.toUi()
            }.onFailure {
                _uiState.value = uiState.value.copy(isError = true)
            }
        }
    }
}
