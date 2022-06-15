package com.example.rickandmortywiki.domain.model

data class Character(
    val episode: List<String?>?,
    val gender: String?,
    val image: String?,
    val name: String?,
    val origin: String?,
    val species: String?,
    val status: String?,
    val notes: String? = "",
    val favorite: Boolean = false
)