package com.sopt.a35_sopkathon_android_android1.presentation.jiwon

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.sopt.a35_sopkathon_android_android1.data.service.ServicePool
import androidx.compose.runtime.State
import androidx.lifecycle.viewModelScope
import com.sopt.a35_sopkathon_android_android1.data.dto.response.ResponseUserDto
import kotlinx.coroutines.launch
import retrofit2.HttpException

class HomeScreenViewModel : ViewModel() {

    private val homeService by lazy { ServicePool.homeService }

    private val _userState = mutableStateOf<ResponseUserDto?>(null)
    val userState: State<ResponseUserDto?> get() = _userState

    fun getUserData() {
        viewModelScope.launch {
            runCatching {
                homeService.getUserData() // ApiResponse 대신 ResponseUserDto 반환
            }.onSuccess { user ->
                _userState.value = user
            }.onFailure { error ->
                Log.e("error", error.message.toString())
            }
        }
    }

}