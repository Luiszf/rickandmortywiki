package com.example.rickandmortywiki.di

import androidx.room.Room
import com.example.rickandmortywiki.data.local.RickAndMortyDatabase
import com.example.rickandmortywiki.data.remote.RickAndMortyApi
import com.example.rickandmortywiki.data.repository.RickAndMortyRepositoryImp
import com.example.rickandmortywiki.domain.repository.RickAndMortyRepository
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.create

val appModule = module {

    single<RickAndMortyApi> {
        Retrofit.Builder()
            .baseUrl(RickAndMortyApi.BASE_URL)
            .build()
            .create()
    }

    single<RickAndMortyDatabase> {
        Room.databaseBuilder(
            get(),
            RickAndMortyDatabase::class.java,
            "rickandmortydb.db"
        ).build()
    }

    single<RickAndMortyRepository> { RickAndMortyRepositoryImp(get(), get()) }
}