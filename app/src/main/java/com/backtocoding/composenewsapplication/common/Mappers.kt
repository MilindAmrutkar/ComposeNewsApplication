package com.backtocoding.composenewsapplication.common

import com.backtocoding.composenewsapplication.data.model.ArticleDTO
import com.backtocoding.composenewsapplication.domain.model.Article

fun List<ArticleDTO>.toDomain(): List<Article> {
    return map {
        Article(
            content = it.content ?: "",
            description = it.description ?: "",
            title = it.title ?: "",
            urlToImage = it.urlToImage ?: ""
        )
    }
}