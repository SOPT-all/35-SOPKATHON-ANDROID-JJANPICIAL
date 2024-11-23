package com.sopt.a35_sopkathon_android_android1.data.service

import com.sopt.a35_sopkathon_android_android1.data.dto.request.ExampleRequestDto
import com.sopt.a35_sopkathon_android_android1.data.dto.response.ApiResponse
import com.sopt.a35_sopkathon_android_android1.data.dto.response.ExampleResponseDto
import com.sopt.a35_sopkathon_android_android1.data.dto.response.ResponseUserDto
import retrofit2.http.Body
import retrofit2.http.GET

interface HomeService {
    @GET("api/user")
    suspend fun getUserData(): ResponseUserDto

}