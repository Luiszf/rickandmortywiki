package com.example.rickandmortywiki.domain.model

data class Location(
    val dimension: String?,
    val name: String?,
    val residents: List<String?>?,
    val type: String?,
    val notes: String? = "",
    val favorite: Boolean = false
)
