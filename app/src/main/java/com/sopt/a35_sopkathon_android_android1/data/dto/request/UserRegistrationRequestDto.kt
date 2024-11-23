package com.sopt.a35_sopkathon_android_android1.data.dto.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserRegistrationRequestDto(
    @SerialName("name") val name: String,
    @SerialName("level") val level: Int,
    @SerialName("part") val part: String,
    @SerialName("jbti") val jbti: String,
    @SerialName("soju") val soju: Double,
    @SerialName("beer") val beer: Double,
    @SerialName("makgeolli") val makgeolli: Double,
    @SerialName("wine") val wine: Double,
)