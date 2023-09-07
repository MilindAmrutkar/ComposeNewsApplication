package com.backtocoding.composenewsapplication.data.repository

import com.backtocoding.composenewsapplication.common.toDomain
import com.backtocoding.composenewsapplication.common.utils.SafeApiRequest
import com.backtocoding.composenewsapplication.data.network.ApiService
import com.backtocoding.composenewsapplication.domain.model.Article
import com.backtocoding.composenewsapplication.domain.repository.GetNewsArticleRepo
import javax.inject.Inject

class GetNewsArticleRepoImpl @Inject constructor(private val apiService: ApiService) :
    GetNewsArticleRepo, SafeApiRequest() {
    override suspend fun getNewsArticle(): List<Article> {
        val response = safeApiRequest { apiService.getNewsArticles() }
        return response.articles?.toDomain()!!
    }
}