package com.example.movieguide.di

import com.example.movieguide.data.api.MoviesAPI
import com.example.movieguide.data.datasource.MoviesRemoteDataSource
import com.example.movieguide.data.datasource.MoviesRemoteDataSourceImpl
import com.example.movieguide.data.repository.MoviesRepository
import com.example.movieguide.domain.gateway.MoviesGateway
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object DataModule {

    @Provides
    fun provideMoviesRemoteDataSource(moviesAPI: MoviesAPI): MoviesRemoteDataSource =
        MoviesRemoteDataSourceImpl(moviesAPI)

    @Provides
    fun provideMoviesRepository(moviesRemoteDataSource: MoviesRemoteDataSource): MoviesGateway =
        MoviesRepository(moviesRemoteDataSource)
}