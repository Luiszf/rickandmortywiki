package com.example.rickandmortywiki.data.mapper

import com.example.rickandmortywiki.data.local.entities.CharacterEntity
import com.example.rickandmortywiki.data.local.entities.EpisodeEntity
import com.example.rickandmortywiki.data.local.entities.LocationEntity
import com.example.rickandmortywiki.domain.model.Character
import com.example.rickandmortywiki.domain.model.Episode
import com.example.rickandmortywiki.domain.model.Location

fun EpisodeEntity.toEpisode(): Episode {
    return Episode(
        airDate,
        characters,
        episode,
        name,
        notes,
        favorite
    )
}

fun CharacterEntity.toCharacter(): Character {
    return Character(
        episode,
        gender,
        image,
        name,
        origin,
        species,
        status,
        notes,
        favorite
    )
}

fun LocationEntity.toLocation(): Location {
    return Location(
        dimension,
        name,
        residents,
        type,
        notes,
        favorite
    )
}

fun Episode.toEpisodeEntity(): EpisodeEntity {
    return EpisodeEntity(
        id = null,
        airDate,
        characters,
        episode,
        name,
        notes,
        favorite
    )
}

fun Character.toCharacterEntity(): CharacterEntity {
    return CharacterEntity(
        id = null,
        episode,
        gender,
        image,
        name,
        origin,
        species,
        status,
        notes,
        favorite
    )
}

fun Location.toLocationEntity(): LocationEntity {
    return LocationEntity(
        id = null,
        dimension,
        name,
        residents,
        type,
        notes,
        favorite
    )
}