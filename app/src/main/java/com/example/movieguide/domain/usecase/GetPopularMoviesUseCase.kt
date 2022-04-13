package com.example.movieguide.domain.usecase

import com.example.movieguide.domain.gateway.MoviesGateway
import com.example.movieguide.domain.models.MoviesListResponseModel
import retrofit2.Response
import javax.inject.Inject

class GetPopularMoviesUseCase @Inject constructor(private val moviesRepository: MoviesGateway) {

    suspend operator fun invoke(): Response<MoviesListResponseModel> {
        return moviesRepository.getPopularMovies()
    }
}