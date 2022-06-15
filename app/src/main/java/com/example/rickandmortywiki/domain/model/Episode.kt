package com.example.rickandmortywiki.domain.model

data class Episode(
    val airDate: String?,
    val characters: List<String?>?,
    val episode: String?,
    val name: String?,
    val notes: String? = "",
    val favorite: Boolean = false
)