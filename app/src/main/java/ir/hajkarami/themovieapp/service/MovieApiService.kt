package ir.hajkarami.themovieapp.service

import ir.hajkarami.themovieapp.model.MovieResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiService {
    @GET("movie/popular")
    fun getPopularMovie(@Query("api_key") apiKey: String) : Call<MovieResult>

}