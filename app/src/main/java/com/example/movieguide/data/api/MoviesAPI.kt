package com.example.movieguide.data.api

import com.example.movieguide.domain.models.MovieCreditsResponseModel
import com.example.movieguide.domain.models.MovieDetailsResponseModel
import com.example.movieguide.domain.models.MoviesListResponseModel
import retrofit2.Response
import retrofit2.http.*

interface MoviesAPI {

    @GET("movie/popular")
    suspend fun getPopularMovies(): Response<MoviesListResponseModel>

    @GET("search/movie")
    suspend fun searchMovies(@Query("query") query: String): Response<MoviesListResponseModel>

    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(@Path("movie_id") movieID: Int): Response<MovieDetailsResponseModel>

    @GET("movie/{movie_id}/similar")
    suspend fun getSimilarMovies(@Path("movie_id") movieID: Int): Response<MoviesListResponseModel>

    @GET("movie/{movie_id}/credits")
    suspend fun getMovieCredits(@Path("movie_id") movieID: Int): Response<MovieCreditsResponseModel>

}