package com.example.movieguide.data.repository

import com.example.movieguide.domain.gateway.MoviesGateway
import com.example.movieguide.domain.models.MovieCreditsResponseModel
import com.example.movieguide.domain.models.MovieDetailsResponseModel
import com.example.movieguide.domain.models.MoviesListResponseModel
import retrofit2.Response

class MoviesFakeRepository : MoviesGateway {
    override suspend fun getPopularMovies(): Response<MoviesListResponseModel> {
        return Response.success(
            MoviesListResponseModel(1)
        )
    }

    override suspend fun searchMovies(query: String): Response<MoviesListResponseModel> {
        return Response.success(
            MoviesListResponseModel(1)
        )
    }

    override suspend fun getMovieDetails(movieID: Int): Response<MovieDetailsResponseModel> {
        return Response.success(
            MovieDetailsResponseModel(title = "Title")
        )
    }

    override suspend fun getSimilarMovies(movieID: Int): Response<MoviesListResponseModel> {
        return Response.success(
            MoviesListResponseModel(1)
        )
    }

    override suspend fun getMovieCredits(movieID: Int): Response<MovieCreditsResponseModel> {
        return Response.success(
            MovieCreditsResponseModel(1)
        )
    }

}
