package com.sopt.a35_sopkathon_android_android1.data.dto.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RankingResponseDto(
    @SerialName("loginUser")
    val loginUser: Ranking,
    @SerialName("rankings")
    val rankings: List<Ranking>,
) {
    @Serializable
    data class Ranking(
        @SerialName("name")
        val name: String,
        @SerialName("imageUrl")
        val imageUrl: String,
        @SerialName("part")
        val part: String,
        @SerialName("ranking")
        val ranking: Int,
        @SerialName("jpLevel")
        val jpLevel: Double,
        @SerialName("jbti")
        val jbti: String,
        @SerialName("isLoginUser")
        val isLoginUser: Boolean,
    )
}
