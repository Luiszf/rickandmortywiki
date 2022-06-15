package com.example.rickandmortywiki.data.mapper

import com.example.rickandmortywiki.data.local.entities.CharacterEntity
import com.example.rickandmortywiki.data.local.entities.EpisodeEntity
import com.example.rickandmortywiki.data.local.entities.LocationEntity
import com.example.rickandmortywiki.data.remote.dto.CharacterResult
import com.example.rickandmortywiki.data.remote.dto.EpisodeResult
import com.example.rickandmortywiki.data.remote.dto.LocationResult

fun EpisodeResult.toEpisodeEntity(): EpisodeEntity {
    return EpisodeEntity(
        id = null,
        airDate,
        characters,
        episode,
        name
    )
}

fun CharacterResult.toCharacterEntity(): CharacterEntity {
    return CharacterEntity(
        id = null,
        episode,
        gender,
        image,
        name,
        origin?.name,
        species,
        status
    )
}

fun LocationResult.toLocationEntity(): LocationEntity {
    return LocationEntity(
        null,
        dimension,
        name,
        residents,
        type
    )
}