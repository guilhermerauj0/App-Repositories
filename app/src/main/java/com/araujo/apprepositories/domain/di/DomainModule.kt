package com.araujo.apprepositories.domain.di

import com.araujo.apprepositories.data.di.DataModule
import com.araujo.apprepositories.domain.ListUserRepositoriesUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load(){
        loadKoinModules(useCaseModule())
    }

    private fun useCaseModule(): Module{
        return module {
            factory { ListUserRepositoriesUseCase(get()) }
        }
    }
}