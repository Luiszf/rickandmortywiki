package com.example.rickandmortywiki

import android.app.Application
import com.example.rickandmortywiki.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class RickAndMortyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin {
            androidLogger()
            androidContext(this@RickAndMortyApplication)
            modules(appModule)
        }
    }
}