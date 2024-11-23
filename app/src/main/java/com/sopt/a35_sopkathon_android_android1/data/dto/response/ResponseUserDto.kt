package com.sopt.a35_sopkathon_android_android1.data.dto.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseUserDto(
    @SerialName("name")
    val name: String,
    @SerialName("jpLevel")
    val jpLevel: Double,
    @SerialName("cumulative")
    val cumulative: Int,
    @SerialName("part")
    val part: String,
    @SerialName("jbti")
    val jbti: String,
    @SerialName("ranking")
    val ranking: Int,
    @SerialName("partRanking")
    val partRanking: Int
)