package com.bkozajda.androidplayground.common.network.di

import com.bkozajda.androidplayground.common.network.ApiConfig
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideApiConfig(): ApiConfig {
        return ApiConfig()
    }

    @Provides
    @Singleton
    fun provideRetrofit(apiConfig: ApiConfig): Retrofit {
        return Retrofit.Builder()
                .baseUrl(apiConfig.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }
}