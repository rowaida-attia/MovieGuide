package com.example.movieguide.domain.usecase

import com.example.movieguide.domain.gateway.MoviesGateway
import com.example.movieguide.domain.models.MovieDetailsResponseModel
import retrofit2.Response
import javax.inject.Inject

class GetMovieDetailsUseCase @Inject constructor(private val moviesRepository: MoviesGateway) {

    suspend operator fun invoke(movieID: Int): Response<MovieDetailsResponseModel> {
        return moviesRepository.getMovieDetails(movieID)
    }
}