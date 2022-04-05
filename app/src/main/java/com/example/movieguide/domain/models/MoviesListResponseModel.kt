package com.example.movieguide.domain.models

import com.google.gson.annotations.SerializedName

data class MoviesListResponseModel(
    @SerializedName("page") var page: Int?,
    @SerializedName("results") var results: MutableList<Results>?,
    @SerializedName("total_pages") var totalPages: Int?,
    @SerializedName("total_results") var totalResults: Int?
)
