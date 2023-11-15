package com.example.midterm_2.data.repository

import com.example.midterm_2.data.remote.ApiService

class UserRepository(private val apiService: ApiService) {

    suspend fun getUsers() = apiService.getUsers()
}