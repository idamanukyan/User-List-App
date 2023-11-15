package com.example.midterm_2.di

import com.example.midterm_2.data.remote.ApiService
import com.example.midterm_2.data.repository.UserRepository
import com.example.midterm_2.viewmodel.UserViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
class AppContainer {

    @Singleton
    @Provides
    fun provideApiService(): ApiService {
        return createApiService()
    }

    @Singleton
    @Provides
    fun provideUserRepository(apiService: ApiService): UserRepository {
        return UserRepository(apiService)
    }

    @Singleton
    @Provides
    fun provideUserViewModel(userRepository: UserRepository): UserViewModel {
        return UserViewModel(userRepository)
    }

    private fun createApiService(): ApiService {
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}
