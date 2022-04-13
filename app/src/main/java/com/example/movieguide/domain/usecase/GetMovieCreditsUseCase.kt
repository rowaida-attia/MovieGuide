package com.example.movieguide.domain.usecase

import com.example.movieguide.domain.gateway.MoviesGateway
import com.example.movieguide.domain.models.MovieCreditsResponseModel
import retrofit2.Response
import javax.inject.Inject

class GetMovieCreditsUseCase @Inject constructor(private val moviesRepository: MoviesGateway) {

    suspend operator fun invoke(movieID: Int): Response<MovieCreditsResponseModel> {
        return moviesRepository.getMovieCredits(movieID)
    }
}