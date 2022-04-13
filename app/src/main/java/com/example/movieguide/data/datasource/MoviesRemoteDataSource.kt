package com.example.movieguide.data.datasource

import com.example.movieguide.domain.models.MovieCreditsResponseModel
import com.example.movieguide.domain.models.MovieDetailsResponseModel
import com.example.movieguide.domain.models.MoviesListResponseModel
import retrofit2.Response

interface MoviesRemoteDataSource {

    suspend fun getPopularMovies(): Response<MoviesListResponseModel>

    suspend fun searchMovies(query: String): Response<MoviesListResponseModel>

    suspend fun getMovieDetails(movieID: Int): Response<MovieDetailsResponseModel>

    suspend fun getSimilarMovies(movieID: Int): Response<MoviesListResponseModel>

    suspend fun getMovieCredits(movieID: Int): Response<MovieCreditsResponseModel>
}