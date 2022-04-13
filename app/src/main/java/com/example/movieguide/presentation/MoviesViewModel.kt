package com.example.movieguide.presentation

import androidx.lifecycle.ViewModel
import com.example.movieguide.domain.models.MovieCreditsResponseModel
import com.example.movieguide.domain.models.MovieDetailsResponseModel
import com.example.movieguide.domain.models.MoviesListResponseModel
import com.example.movieguide.domain.usecase.*
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class MoviesViewModel @Inject constructor(
    private val getMovieCreditsUseCase: GetMovieCreditsUseCase,
    private val getMovieDetailsUseCase: GetMovieDetailsUseCase,
    private val getPopularMoviesUseCase: GetPopularMoviesUseCase,
    private val getSimilarMoviesUseCase: GetSimilarMoviesUseCase,
    private val searchMoviesUseCase: SearchMoviesUseCase
) : ViewModel() {

    suspend fun getPopularMovies(): Response<MoviesListResponseModel> =
        getPopularMoviesUseCase()

    suspend fun searchMovies(query: String): Response<MoviesListResponseModel> =
        searchMoviesUseCase(query)

    suspend fun getMovieDetails(movieID: Int): Response<MovieDetailsResponseModel> =
        getMovieDetailsUseCase(movieID)

    suspend fun getSimilarMovies(movieID: Int): Response<MoviesListResponseModel> =
        getSimilarMoviesUseCase(movieID)

    suspend fun getMovieCredits(movieID: Int): Response<MovieCreditsResponseModel> =
        getMovieCreditsUseCase(movieID)

}