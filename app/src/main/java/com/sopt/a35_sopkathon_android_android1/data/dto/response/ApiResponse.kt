package com.sopt.a35_sopkathon_android_android1.data.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse<T>(
    val status: Int? = 0,
    val message: String? = null,
    val data: T? = null
)