package com.example.movieguide.domain.usecase

import com.example.movieguide.data.repository.MoviesFakeRepository
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class SearchMoviesUseCaseTest {

    private val moviesRepository = MoviesFakeRepository()
    private lateinit var searchMoviesUseCase: SearchMoviesUseCase

    @Before
    fun setUp() {
        searchMoviesUseCase = SearchMoviesUseCase(moviesRepository)
    }

    @Test
    fun searchMovies() {
        runBlocking {
            val actual = searchMoviesUseCase("1")
            Assert.assertEquals(1, actual.body()?.page)
            assert(actual.isSuccessful)
        }
    }

}