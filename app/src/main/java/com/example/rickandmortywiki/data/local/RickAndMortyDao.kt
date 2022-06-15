package com.example.rickandmortywiki.data.local

import androidx.room.*
import com.example.rickandmortywiki.data.local.entities.CharacterEntity
import com.example.rickandmortywiki.data.local.entities.EpisodeEntity
import com.example.rickandmortywiki.data.local.entities.LocationEntity

@Dao
interface RickAndMortyDao {

    @Update
    suspend fun updateCharacter(character: CharacterEntity)

    @Update
    suspend fun updateEpisode(episode: EpisodeEntity)

    @Update
    suspend fun updateLocation(location: LocationEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCharacters(
        characters: List<CharacterEntity>
    )

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEpisodes(
        episodes: List<EpisodeEntity>
    )

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLocations(
        locations: List<LocationEntity>
    )

    @Query(
        "SELECT * FROM CharacterEntity WHERE LOWER(name) LIKE '%' || LOWER(:searchQuery) || '%' AND (favorite = :getFavorites or favorite = 1)"
    )
    fun getCharacters(searchQuery: String, getFavorites: Boolean): List<CharacterEntity>

    @Query(
        "SELECT * FROM EpisodeEntity WHERE LOWER(name) LIKE '%' || LOWER(:searchQuery) || '%' AND (favorite = :getFavorites or favorite = 1)"
    )
    fun getEpisodes(searchQuery: String, getFavorites: Boolean): List<EpisodeEntity>

    @Query(
        "SELECT * FROM LocationEntity WHERE LOWER(name) LIKE '%' || LOWER(:searchQuery) || '%' AND (favorite = :getFavorites or favorite = 1)"
    )
    fun getLocations(searchQuery: String, getFavorites: Boolean): List<LocationEntity>


}