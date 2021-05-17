package com.kurantsov.moviesapp.entity

data class MoviesList(
    val id: Int,
    val description: String,
    val posterUrl: String?,
    val movies: List<Movie>
)