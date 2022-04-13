package com.example.movieguide.domain.usecase

import com.example.movieguide.data.repository.MoviesFakeRepository
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetSimilarMoviesUseCaseTest {

    private val moviesRepository = MoviesFakeRepository()
    private lateinit var getSimilarMoviesUseCase: GetSimilarMoviesUseCase

    @Before
    fun setUp() {
        getSimilarMoviesUseCase = GetSimilarMoviesUseCase(moviesRepository)
    }

    @Test
    fun getSimilarMovies() {
        runBlocking {
            val actual = getSimilarMoviesUseCase(1)
            Assert.assertEquals(1, actual.body()?.page)
            assert(actual.isSuccessful)
        }
    }

}