package com.sopt.a35_sopkathon_android_android1.data.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse<T>(
    val status: Int,
    val message: String,
    val data: T? = null,
)
