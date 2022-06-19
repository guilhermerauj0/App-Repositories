package com.araujo.apprepositories

import android.app.Application
import com.araujo.apprepositories.data.di.DataModule
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate(){
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
    }
}