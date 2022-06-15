package com.example.rickandmortywiki.data.remote

import com.example.rickandmortywiki.data.remote.dto.CharacterDTO
import com.example.rickandmortywiki.data.remote.dto.EpisodeDTO
import com.example.rickandmortywiki.data.remote.dto.LocationDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface RickAndMortyApi {

    @GET("character?")
    suspend fun getCharacters(
        @Query("page") page: Int
    ): CharacterDTO

    @GET("episode?")
    suspend fun getEpisodes(
        @Query("page") page: Int
    ): EpisodeDTO

    @GET("location?")
    suspend fun getLocations(
        @Query("page") page: Int
    ): LocationDTO

    companion object {
        const val BASE_URL = "https://rickandmortyapi.com/api/"
    }
}