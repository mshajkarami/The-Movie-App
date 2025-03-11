package ir.hajkarami.themovieapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MovieResult(
    val page: Int,
    @SerializedName("results")
    @Expose
    val movies: List<Movie>,
    @SerializedName("total_pages")
    @Expose
    val totalPages: Int,
    @SerializedName("total_results")
    @Expose
    val totalResults: Int
)