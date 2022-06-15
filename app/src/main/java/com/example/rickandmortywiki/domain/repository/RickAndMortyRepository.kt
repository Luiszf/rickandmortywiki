package com.example.rickandmortywiki.domain.repository


import com.example.rickandmortywiki.domain.model.Character
import com.example.rickandmortywiki.domain.model.Episode
import com.example.rickandmortywiki.domain.model.Location
import kotlinx.coroutines.flow.Flow

interface RickAndMortyRepository {

    suspend fun getEpisodes(
        searchQuery: String,
        getFavorites: Boolean,
        page: Int = 1
    ): Flow<List<Episode>>

    suspend fun getCharacters(
        searchQuery: String,
        getFavorites: Boolean,
        page: Int = 1
    ): Flow<List<Character>>

    suspend fun getLocations(
        searchQuery: String,
        getFavorites: Boolean,
        page: Int = 1
    ): Flow<List<Location>>

    suspend fun updateCharacter(character: Character)

    suspend fun updateLocation(location: Location)

    suspend fun updateEpisode(episode: Episode)
}