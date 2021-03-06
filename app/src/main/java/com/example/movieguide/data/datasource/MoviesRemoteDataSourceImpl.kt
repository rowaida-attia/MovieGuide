package com.example.movieguide.data.datasource

import com.example.movieguide.data.api.MoviesAPI
import com.example.movieguide.domain.models.MovieCreditsResponseModel
import com.example.movieguide.domain.models.MovieDetailsResponseModel
import com.example.movieguide.domain.models.MoviesListResponseModel
import retrofit2.Response
import javax.inject.Inject

class MoviesRemoteDataSourceImpl @Inject constructor(private val moviesAPI: MoviesAPI) : MoviesRemoteDataSource {
    override suspend fun getPopularMovies(): Response<MoviesListResponseModel> {
        return moviesAPI.getPopularMovies()
    }

    override suspend fun searchMovies(query: String): Response<MoviesListResponseModel> {
        return moviesAPI.searchMovies(query)
    }

    override suspend fun getMovieDetails(movieID: Int): Response<MovieDetailsResponseModel> {
        return moviesAPI.getMovieDetails(movieID)
    }

    override suspend fun getSimilarMovies(movieID: Int): Response<MoviesListResponseModel> {
        return moviesAPI.getSimilarMovies(movieID)
    }

    override suspend fun getMovieCredits(movieID: Int): Response<MovieCreditsResponseModel> {
        return moviesAPI.getMovieCredits(movieID)
    }
}