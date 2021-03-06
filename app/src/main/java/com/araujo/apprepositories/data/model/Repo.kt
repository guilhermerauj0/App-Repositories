package com.araujo.apprepositories.data.model

data class Repo (
    val id: Long,
    val name: String,
    val fullName: String,
    val private: Boolean,
    val owner: Owner,
    val htmlURL: String,
    val description: String,
    val stargazersCount: Long,
    val language: String
)



