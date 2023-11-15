package com.example.midterm_2.data.remote

import com.example.midterm_2.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}