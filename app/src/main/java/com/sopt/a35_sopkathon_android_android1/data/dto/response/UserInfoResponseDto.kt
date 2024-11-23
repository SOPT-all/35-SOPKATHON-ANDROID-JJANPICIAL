package com.sopt.a35_sopkathon_android_android1.data.dto.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserInfoResponseDto(
    @SerialName("jpLevel") val jpLevel: Double,
    @SerialName("jbti") val jbti: String
)