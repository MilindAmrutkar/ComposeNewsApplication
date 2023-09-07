package com.backtocoding.composenewsapplication.domain.repository

import com.backtocoding.composenewsapplication.domain.model.Article

interface GetNewsArticleRepo {
    suspend fun getNewsArticle(): List<Article>
}