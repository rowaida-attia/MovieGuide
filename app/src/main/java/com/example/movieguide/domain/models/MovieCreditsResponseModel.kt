package com.example.movieguide.domain.models

import com.example.movieguide.domain.models.Cast
import com.example.movieguide.domain.models.Crew
import com.google.gson.annotations.SerializedName

data class MovieCreditsResponseModel(
    @SerializedName("id") var id: Int?,
    @SerializedName("cast") var cast: MutableList<Cast>?,
    @SerializedName("crew") var crew: MutableList<Crew>?
)
