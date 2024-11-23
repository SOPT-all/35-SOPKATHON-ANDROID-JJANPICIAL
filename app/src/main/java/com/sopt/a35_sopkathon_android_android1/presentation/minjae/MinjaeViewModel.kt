package com.sopt.a35_sopkathon_android_android1.presentation.minjae

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sopt.a35_sopkathon_android_android1.data.dto.request.UserRegistrationRequestDto
import com.sopt.a35_sopkathon_android_android1.data.service.ServicePool
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class MinjaeViewModel : ViewModel() {
    private val userRegistrationService by lazy { ServicePool.userRegistrationService }

    private val _userName = MutableStateFlow("")
    val username: StateFlow<String> = _userName

    private val _userPart = MutableStateFlow("")
    val userPart: StateFlow<String> = _userPart

    val isButton1Enabled: StateFlow<Boolean> = combine(_userName, _userPart) { userName, userPart ->
        userName.isNotEmpty() && userPart.isNotEmpty()
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = false
    )

    private val _sojuBottle = MutableStateFlow(0.0)
    val sojuBottle: StateFlow<Double> = _sojuBottle

    private val _beerBottle = MutableStateFlow(0.0)
    val beerBottle: StateFlow<Double> = _beerBottle

    private val _makgeolliBottle = MutableStateFlow(0.0)
    val makgeolliBottle: StateFlow<Double> = _makgeolliBottle

    private val _wineBottle = MutableStateFlow(0.0)
    val wineBottle: StateFlow<Double> = _wineBottle

    private val _isButton2Enabled = MutableStateFlow(false)
    val isButton2Enabled: StateFlow<Boolean> = _isButton2Enabled

    private val _isButton3Enabled = MutableStateFlow(false)
    val isButton3Enabled: StateFlow<Boolean> = _isButton3Enabled

    private val _isButton4Enabled = MutableStateFlow(false)
    val isButton4Enabled: StateFlow<Boolean> = _isButton4Enabled

    private val _userJpLevel = MutableStateFlow(0.0)
    val userJpLevel: StateFlow<Double> = _userJpLevel

    private val _userJbti = MutableStateFlow("")
    val userJbti: StateFlow<String> = _userJbti

    fun setUserName(newValue: String) {
        _userName.value = newValue
    }

    fun setUserPart(newValue: String) {
        _userPart.value = newValue
    }

    fun increaseSojuBottle() {
        _sojuBottle.value += 0.5
        updateButtonState()
    }

    fun decreaseSojuBottle() {
        if (_sojuBottle.value > 0) {
            _sojuBottle.value -= 0.5
            updateButtonState()
        }
    }

    fun increaseBeerBottle() {
        _beerBottle.value += 0.5
        updateButtonState()
    }

    fun decreaseBeerBottle() {
        if (_beerBottle.value > 0) {
            _beerBottle.value -= 0.5
            updateButtonState()
        }
    }

    fun increaseMakgeolliBottle() {
        _makgeolliBottle.value += 0.5
        updateButtonState()
    }

    fun decreaseMakgeolliBottle() {
        if (_makgeolliBottle.value > 0) {
            _makgeolliBottle.value -= 0.5
            updateButtonState()
        }
    }

    fun increaseWineBottle() {
        _wineBottle.value += 0.5
        updateButtonState()
    }

    fun decreaseWineBottle() {
        if (_wineBottle.value > 0) {
            _wineBottle.value -= 0.5
            updateButtonState()
        }
    }

    private fun updateButtonState() {
        _isButton2Enabled.value =
            _sojuBottle.value > 0 || _beerBottle.value > 0 || _makgeolliBottle.value > 0 || _wineBottle.value > 0
    }

    fun postUserRegistration() {
        viewModelScope.launch {
            runCatching {
                userRegistrationService.postUserRegistration(
                    UserRegistrationRequestDto(
                        name = _userName.value,
                        level = 35,
                        part = _userPart.value,
                        jbti = "배부른 솝부기",
                        soju = _sojuBottle.value,
                        beer = _beerBottle.value,
                        makgeolli = _makgeolliBottle.value,
                        wine = _wineBottle.value
                    )
                )
            }.onSuccess { response ->
                if (response != null) {
                    Log.d("MinjaeViewModel", "Registration successful: $response")
                } else {
                    Log.e("MinjaeViewModel", "Server returned an empty response.")
                }
            }.onFailure { throwable ->
                Log.e("MinjaeViewModel", "Failed to post user registration", throwable)
            }
        }
    }

    fun getUserInfo() {
        viewModelScope.launch {
            runCatching {
                userRegistrationService.getUserInfo()
            }.onSuccess { response ->
                _userJpLevel.value = response.jpLevel
                _userJbti.value = response.jbti
            }.onFailure { throwable ->
                Log.e("MinjaeViewModel", "Failed to get user info", throwable)
            }
        }
    }
}


