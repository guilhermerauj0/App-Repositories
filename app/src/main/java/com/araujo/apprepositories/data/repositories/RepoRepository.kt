package com.araujo.apprepositories.data.repositories

import com.araujo.apprepositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String) : Flow<List<Repo>>
}