package com.backtocoding.composenewsapplication.domain.di

import com.backtocoding.composenewsapplication.data.network.ApiService
import com.backtocoding.composenewsapplication.data.repository.GetNewsArticleRepoImpl
import com.backtocoding.composenewsapplication.domain.repository.GetNewsArticleRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {
    @Provides
    fun provideGetNewsRepo(apiService: ApiService): GetNewsArticleRepo {
        return GetNewsArticleRepoImpl(apiService = apiService)
    }
}