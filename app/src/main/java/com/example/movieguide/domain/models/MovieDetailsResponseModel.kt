package com.example.movieguide.domain.models

import com.google.gson.annotations.SerializedName

data class MovieDetailsResponseModel(
    @SerializedName("adult") var adult: Boolean? = null,
    @SerializedName("backdrop_path") var backdropPath: String? = null,
    @SerializedName("belongs_to_collection") var belongsToCollection: String? = null,
    @SerializedName("budget") var budget: Int? = null,
    @SerializedName("genres") var genres: MutableList<Genres>? = null,
    @SerializedName("homepage") var homepage: String? = null,
    @SerializedName("id") var id: Int? = null,
    @SerializedName("imdb_id") var imdbId: String? = null,
    @SerializedName("original_language") var originalLanguage: String? = null,
    @SerializedName("original_title") var originalTitle: String? = null,
    @SerializedName("overview") var overview: String? = null,
    @SerializedName("popularity") var popularity: Double? = null,
    @SerializedName("poster_path") var posterPath: String? = null,
    @SerializedName("production_companies") var productionCompanies: MutableList<ProductionCompanies>? = null,
    @SerializedName("production_countries") var productionCountries: MutableList<ProductionCountries>? = null,
    @SerializedName("release_date") var releaseDate: String? = null,
    @SerializedName("revenue") var revenue: Int? = null,
    @SerializedName("runtime") var runtime: Int? = null,
    @SerializedName("spoken_languages") var spokenLanguages: MutableList<SpokenLanguages>? = null,
    @SerializedName("status") var status: String? = null,
    @SerializedName("tagline") var tagline: String? = null,
    @SerializedName("title") var title: String? = null,
    @SerializedName("video") var video: Boolean? = null,
    @SerializedName("vote_average") var voteAverage: Double? = null,
    @SerializedName("vote_count") var voteCount: Int? = null
)
