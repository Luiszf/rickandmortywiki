package com.example.rickandmortywiki.data.repository

import com.example.rickandmortywiki.data.local.RickAndMortyDatabase
import com.example.rickandmortywiki.data.mapper.*
import com.example.rickandmortywiki.data.remote.RickAndMortyApi
import com.example.rickandmortywiki.domain.model.Character
import com.example.rickandmortywiki.domain.model.Episode
import com.example.rickandmortywiki.domain.model.Location
import com.example.rickandmortywiki.domain.repository.RickAndMortyRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RickAndMortyRepositoryImp(
    val api: RickAndMortyApi,
    val db: RickAndMortyDatabase
) : RickAndMortyRepository {

    private val dao = db.dao
    override suspend fun getEpisodes(
        searchQuery: String,
        getFavorites: Boolean,
        page: Int
    ): Flow<List<Episode>> {
        return flow {
            emit(emptyList())
            val request = api.getEpisodes(page).results
            val list = request ?: emptyList()
            dao.insertEpisodes(list.map { it.toEpisodeEntity() })
            emit(dao.getEpisodes(searchQuery, getFavorites).map { it.toEpisode() })
        }
    }


    override suspend fun getCharacters(
        searchQuery: String,
        getFavorites: Boolean,
        page: Int
    ): Flow<List<Character>> {
        return flow {
            emit(emptyList())
            val request = api.getCharacters(page).results
            val list = request ?: emptyList()
            dao.insertCharacters(list.map { it.toCharacterEntity() })
            emit(dao.getCharacters(searchQuery, getFavorites).map { it.toCharacter() })
        }
    }

    override suspend fun getLocations(
        searchQuery: String,
        getFavorites: Boolean,
        page: Int
    ): Flow<List<Location>> {
        return flow {
            emit(emptyList())
            val request = api.getLocations(page).results
            val list = request ?: emptyList()
            dao.insertLocations(list.map { it.toLocationEntity() })
            emit(dao.getLocations(searchQuery, getFavorites).map { it.toLocation() })
        }
    }

    override suspend fun updateCharacter(character: Character) {
        dao.updateCharacter(character.toCharacterEntity())
    }

    override suspend fun updateLocation(location: Location) {
        dao.updateLocation(location.toLocationEntity())
    }

    override suspend fun updateEpisode(episode: Episode) {
        dao.updateEpisode(episode.toEpisodeEntity())
    }


}