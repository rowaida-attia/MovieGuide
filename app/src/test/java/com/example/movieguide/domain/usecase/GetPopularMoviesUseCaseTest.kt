package com.example.movieguide.domain.usecase

import com.example.movieguide.data.repository.MoviesFakeRepository
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetPopularMoviesUseCaseTest {

    private val moviesRepository = MoviesFakeRepository()
    private lateinit var getPopularMoviesUseCase: GetPopularMoviesUseCase

    @Before
    fun setUp() {
        getPopularMoviesUseCase = GetPopularMoviesUseCase(moviesRepository)
    }

    @Test
    fun getPopularMovies() {
        runBlocking {
            val actual = getPopularMoviesUseCase()
            Assert.assertEquals(1, actual.body()?.page)
            assert(actual.isSuccessful)
        }
    }

}