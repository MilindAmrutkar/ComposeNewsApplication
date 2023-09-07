package com.backtocoding.composenewsapplication.data.network

import com.backtocoding.composenewsapplication.data.model.NewsDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    // https://newsapi.org/v2/top-headlines?country=us&apiKey=API_KEY
    @GET("top-headlines")
    suspend fun getNewsArticles(
        @Query("country") country: String = "us",
        @Query("apiKey") apiKey: String = "YOUR_API_KEY"
    ): Response<NewsDTO>
}