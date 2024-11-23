package com.sopt.a35_sopkathon_android_android1.data.service

import com.sopt.a35_sopkathon_android_android1.data.dto.request.UserRegistrationRequestDto
import com.sopt.a35_sopkathon_android_android1.data.dto.response.ApiResponse
import com.sopt.a35_sopkathon_android_android1.data.dto.response.UserInfoResponseDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface UserRegistrationService {
    @POST("/api/user")
    suspend fun postUserRegistration(
        @Body userRegistrationRequestDto: UserRegistrationRequestDto
    )

    @GET("api/auth-info")
    suspend fun getUserInfo(): UserInfoResponseDto
}