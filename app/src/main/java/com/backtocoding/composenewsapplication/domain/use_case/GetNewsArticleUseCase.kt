package com.backtocoding.composenewsapplication.domain.use_case

import com.backtocoding.composenewsapplication.common.utils.Resource
import com.backtocoding.composenewsapplication.domain.model.Article
import com.backtocoding.composenewsapplication.domain.repository.GetNewsArticleRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetNewsArticleUseCase @Inject constructor(private val getNewsArticleRepo: GetNewsArticleRepo) {

    operator fun invoke(): Flow<Resource<List<Article>>> = flow {
        emit(Resource.Loading(""))
        try {
            emit(Resource.Success(getNewsArticleRepo.getNewsArticle()))
        } catch (e: Exception) {
            emit(Resource.Error(e.message))
        }
    }
}