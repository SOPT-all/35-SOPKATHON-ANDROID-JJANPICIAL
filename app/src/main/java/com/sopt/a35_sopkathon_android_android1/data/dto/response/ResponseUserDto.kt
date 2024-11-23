package com.sopt.a35_sopkathon_android_android1.data.dto.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseUserDto(
    @SerialName("id") //이건 JSON을 통해 들어오는 이름
    val id: Int,      //이건 우리가 사용할 이름
    @SerialName("name")
    val name: String,
    @SerialName("alcohollevel")
    val alcohollevel: Int,
    @SerialName("cumulative")
    val cumulative: Int,
    @SerialName("jbti")
    val jbti: String,
    @SerialName("ranking")
    val ranking: Int,
)