package com.example.rickandmortywiki.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class EpisodeEntity(
    @PrimaryKey val id: Int? = null,
    val airDate: String?,
    val characters: List<String?>?,
    val episode: String?,
    val name: String?,
    val notes: String? = "",
    val favorite: Boolean = false
)
