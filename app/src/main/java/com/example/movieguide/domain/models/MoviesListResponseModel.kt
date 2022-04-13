package com.example.movieguide.domain.models

import com.google.gson.annotations.SerializedName

data class MoviesListResponseModel(
    @SerializedName("page") var page: Int? = null,
    @SerializedName("results") var results: MutableList<Results>? = null,
    @SerializedName("total_pages") var totalPages: Int? = null,
    @SerializedName("total_results") var totalResults: Int? = null
)
