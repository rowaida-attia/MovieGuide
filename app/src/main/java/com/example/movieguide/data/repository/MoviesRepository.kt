package com.example.movieguide.data.repository

import com.example.movieguide.data.datasource.MoviesRemoteDataSource
import com.example.movieguide.domain.gateway.MoviesGateway
import com.example.movieguide.domain.models.MovieCreditsResponseModel
import com.example.movieguide.domain.models.MovieDetailsResponseModel
import com.example.movieguide.domain.models.MoviesListResponseModel
import retrofit2.Response
import javax.inject.Inject

class MoviesRepository @Inject constructor(private val moviesRemoteDataSource: MoviesRemoteDataSource): MoviesGateway {
    override suspend fun getPopularMovies(): Response<MoviesListResponseModel> {
        return moviesRemoteDataSource.getPopularMovies()
    }

    override suspend fun searchMovies(query: String): Response<MoviesListResponseModel> {
        return moviesRemoteDataSource.searchMovies(query)
    }

    override suspend fun getMovieDetails(movieID: Int): Response<MovieDetailsResponseModel> {
        return moviesRemoteDataSource.getMovieDetails(movieID)
    }

    override suspend fun getSimilarMovies(movieID: Int): Response<MoviesListResponseModel> {
        return moviesRemoteDataSource.getSimilarMovies(movieID)
    }

    override suspend fun getMovieCredits(movieID: Int): Response<MovieCreditsResponseModel> {
        return moviesRemoteDataSource.getMovieCredits(movieID)
    }

}
