package com.example.movieguide.domain.usecase

import com.example.movieguide.data.repository.MoviesFakeRepository
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetMovieCreditsUseCaseTest {

    private val moviesRepository = MoviesFakeRepository()
    private lateinit var getMovieCreditsUseCase: GetMovieCreditsUseCase

    @Before
    fun setUp() {
        getMovieCreditsUseCase = GetMovieCreditsUseCase(moviesRepository)
    }

    @Test
    fun getMovieCredits() {
        runBlocking {
            val actual = getMovieCreditsUseCase(1)
            Assert.assertEquals(1, actual.body()?.id)
            assert(actual.isSuccessful)
        }
    }

}