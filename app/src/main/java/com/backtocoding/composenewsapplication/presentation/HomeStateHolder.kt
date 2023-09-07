package com.backtocoding.composenewsapplication.presentation

import com.backtocoding.composenewsapplication.domain.model.Article

data class HomeStateHolder(
    val isLoading: Boolean = false,
    val data: List<Article>? = null,
    val error: String? = ""
)
