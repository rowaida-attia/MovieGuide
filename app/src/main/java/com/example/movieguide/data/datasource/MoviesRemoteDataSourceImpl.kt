package com.example.movieguide.data.datasource

import com.example.movieguide.data.network.NetworkManager
import com.example.movieguide.domain.models.MovieCreditsResponseModel
import com.example.movieguide.domain.models.MovieDetailsResponseModel
import com.example.movieguide.domain.models.MoviesListResponseModel
import retrofit2.Call

class MoviesRemoteDataSourceImpl : MoviesRemoteDataSource {
    override fun getPopularMovies(): Call<MoviesListResponseModel> {
        return NetworkManager.create().getPopularMovies()
    }

    override fun searchMovie(query: String): Call<MoviesListResponseModel> {
        return NetworkManager.create().searchMovie(query)
    }

    override fun getMovieDetails(movieID: Int): Call<MovieDetailsResponseModel> {
        return NetworkManager.create().getMovieDetails(movieID)
    }

    override fun getSimilarMovies(movieID: Int): Call<MoviesListResponseModel> {
        return NetworkManager.create().getSimilarMovies(movieID)
    }

    override fun getMovieCredits(movieID: Int): Call<MovieCreditsResponseModel> {
        return NetworkManager.create().getMovieCredits(movieID)
    }
}