package com.sopt.a35_sopkathon_android_android1.data.service

import com.sopt.a35_sopkathon_android_android1.data.dto.request.ExampleRequestDto
import com.sopt.a35_sopkathon_android_android1.data.dto.response.ApiResponse
import com.sopt.a35_sopkathon_android_android1.data.dto.response.ExampleResponseDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ExampleService {
    @GET("api/v1/data")
    suspend fun getExampleData(): ApiResponse<ExampleResponseDto>

    @POST("api/v1/data")
    suspend fun postExampleData(
        @Body exampleRequestDto: ExampleRequestDto,
    ): ApiResponse<Unit>
}
