package com.example.movieguide.domain.models

import com.google.gson.annotations.SerializedName

data class Genres(
    @SerializedName("id") var id: Int?,
    @SerializedName("name") var name: String?
)
