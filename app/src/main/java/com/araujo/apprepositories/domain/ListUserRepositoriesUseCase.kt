package com.araujo.apprepositories.domain

import com.araujo.apprepositories.UseCase
import com.araujo.apprepositories.data.model.Repo
import com.araujo.apprepositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(private val repository: RepoRepository): UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}