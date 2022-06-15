package com.example.rickandmortywiki.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CharacterEntity(
    @PrimaryKey val id: Int? = null,
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
