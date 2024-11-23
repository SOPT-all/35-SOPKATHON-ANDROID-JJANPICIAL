package com.sopt.a35_sopkathon_android_android1.data.service

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.sopt.a35_sopkathon_android_android1.BuildConfig
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

object ApiFactory {
    private val BASE_URL: String = BuildConfig.BASE_URL
    private val json = Json {
        ignoreUnknownKeys = true
    }
    private val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private val client = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .build()

    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
            .build()
    }

    inline fun <reified T> create(): T = retrofit.create(T::class.java)
}

object ServicePool {
    val exampleService = ApiFactory.create<ExampleService>()
    val rankingService: RankingService by lazy { ApiFactory.create() }
    val homeService = ApiFactory.create<HomeService>()
}
