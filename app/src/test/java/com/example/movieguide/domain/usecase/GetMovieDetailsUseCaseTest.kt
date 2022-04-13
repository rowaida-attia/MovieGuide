package com.example.movieguide.domain.usecase

import com.example.movieguide.data.repository.MoviesFakeRepository
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetMovieDetailsUseCaseTest {

    private val moviesRepository = MoviesFakeRepository()
    private lateinit var getMovieDetailsUseCase: GetMovieDetailsUseCase

    @Before
    fun setUp() {
        getMovieDetailsUseCase = GetMovieDetailsUseCase(moviesRepository)
    }

    @Test
    fun getMovieDetails() {
        runBlocking {
            val actual = getMovieDetailsUseCase(1)
            Assert.assertEquals("Title", actual.body()?.title)
            assert(actual.isSuccessful)
        }
    }

}