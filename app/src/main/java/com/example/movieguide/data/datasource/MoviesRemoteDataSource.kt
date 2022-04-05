package com.example.movieguide.data.datasource

import com.example.movieguide.domain.models.MovieCreditsResponseModel
import com.example.movieguide.domain.models.MovieDetailsResponseModel
import com.example.movieguide.domain.models.MoviesListResponseModel
import retrofit2.Call

interface MoviesRemoteDataSource {

    fun getPopularMovies(): Call<MoviesListResponseModel>

    fun searchMovie(query: String): Call<MoviesListResponseModel>

    fun getMovieDetails(movieID: Int): Call<MovieDetailsResponseModel>

    fun getSimilarMovies(movieID: Int): Call<MoviesListResponseModel>

    fun getMovieCredits(movieID: Int): Call<MovieCreditsResponseModel>
}