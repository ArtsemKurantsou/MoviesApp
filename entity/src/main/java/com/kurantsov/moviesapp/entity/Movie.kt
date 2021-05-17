package com.kurantsov.moviesapp.entity

import java.util.*

data class Movie(
    val id: String,
    val title: String,
    val overview: String,
    val releaseDate: Date,
    val posterUrl: String?,
    val averageVote: Float
)