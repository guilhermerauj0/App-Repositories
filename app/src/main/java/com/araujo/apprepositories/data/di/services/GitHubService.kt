package com.araujo.apprepositories.data.di.services

import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user : String) : List<Repo>
}