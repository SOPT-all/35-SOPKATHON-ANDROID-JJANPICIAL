package com.sopt.a35_sopkathon_android_android1.data.service

import com.sopt.a35_sopkathon_android_android1.data.dto.response.RankingResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface RankingService {

    @GET("api/ranking")
    suspend fun getExampleData(
        @Query("part") part: String,
    ): RankingResponseDto
}
