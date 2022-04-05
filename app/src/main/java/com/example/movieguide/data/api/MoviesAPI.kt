package com.example.movieguide.data.api

import com.example.movieguide.domain.models.MovieCreditsResponseModel
import com.example.movieguide.domain.models.MovieDetailsResponseModel
import com.example.movieguide.domain.models.MoviesListResponseModel
import retrofit2.Call
import retrofit2.http.*

interface MoviesAPI {

    @GET("/3/movie/popular")
    fun getPopularMovies(@Query("api_key") apiKey: String = "316464419f5dbcce00467d1b21c29439"): Call<MoviesListResponseModel>

    @GET("/search/movie")
    fun searchMovie(@Query("query") query: String): Call<MoviesListResponseModel>

    @GET("/movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") movieID: Int): Call<MovieDetailsResponseModel>

    @GET("/movie/{movie_id}/similar")
    fun getSimilarMovies(@Path("movie_id") movieID: Int): Call<MoviesListResponseModel>

    @GET("/movie/{movie_id}/credits")
    fun getMovieCredits(@Path("movie_id") movieID: Int): Call<MovieCreditsResponseModel>

}