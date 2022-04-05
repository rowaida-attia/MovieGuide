package com.example.movieguide.data.repository

import com.example.movieguide.domain.gateway.MoviesGateway
import com.example.movieguide.domain.models.MovieCreditsResponseModel
import com.example.movieguide.domain.models.MovieDetailsResponseModel
import com.example.movieguide.domain.models.MoviesListResponseModel
import retrofit2.Call

class MoviesRepository: MoviesGateway {
    override fun getPopularMovies(): Call<MoviesListResponseModel> {
        TODO("Not yet implemented")
    }

    override fun searchMovie(query: String): Call<MoviesListResponseModel> {
        TODO("Not yet implemented")
    }

    override fun getMovieDetails(movieID: Int): Call<MovieDetailsResponseModel> {
        TODO("Not yet implemented")
    }

    override fun getSimilarMovies(movieID: Int): Call<MoviesListResponseModel> {
        TODO("Not yet implemented")
    }

    override fun getMovieCredits(movieID: Int): Call<MovieCreditsResponseModel> {
        TODO("Not yet implemented")
    }

}
