package com.example.rickandmortywiki.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.rickandmortywiki.data.local.entities.CharacterEntity
import com.example.rickandmortywiki.data.local.entities.EpisodeEntity
import com.example.rickandmortywiki.data.local.entities.LocationEntity

@Database(
    entities = [
        CharacterEntity::class,
        LocationEntity::class,
        EpisodeEntity::class
    ],
    version = 1
)
abstract class RickAndMortyDatabase() : RoomDatabase() {

    abstract val dao: RickAndMortyDao

}