package ir.hajkarami.themovieapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Movie(
    val id: Int,
    val title: String,
    @SerializedName("poster_path")
    @Expose
    val posterPath: String?,
    @SerializedName("overview")
    @Expose
    val overview: String,
    @SerializedName("release_date")
    @Expose
    val releaseDate: String?,
    @SerializedName("vote_average")
    @Expose
    val voteAverage: Float,
    @Expose
    val popularity: Float,
    val adult: Boolean
)