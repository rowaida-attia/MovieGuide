package com.example.movieguide.domain.models

import com.google.gson.annotations.SerializedName

data class MovieCreditsResponseModel(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("cast") var cast: MutableList<Cast>? = null,
    @SerializedName("crew") var crew: MutableList<Crew>? = null
)
