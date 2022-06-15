package com.example.rickandmortywiki.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LocationEntity(
    @PrimaryKey val id: Int? = null,
    val dimension: String?,
    val name: String?,
    val residents: List<String?>?,
    val type: String?,
    val notes: String? = "",
    val favorite: Boolean = false
)
