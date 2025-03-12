package ir.hajkarami.themovieapp.model

import android.app.Application
import androidx.lifecycle.MutableLiveData
import ir.hajkarami.themovieapp.R
import ir.hajkarami.themovieapp.service.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieRepository(val application: Application) {
    private var movieList: ArrayList<Movie> = ArrayList()
    private var mutableLiveData: MutableLiveData<List<Movie>> = MutableLiveData()

    fun getMutableLiveData(): MutableLiveData<List<Movie>> {
        val movieApiService = RetrofitInstance.getService()
        val call: Call<MovieResult> = movieApiService.getPopularMovie(
            application.applicationContext.getString(R.string.api_key)
        )

        call.enqueue(object : Callback<MovieResult> {
            override fun onResponse(call: Call<MovieResult>, response: Response<MovieResult>) {
                val result = response.body()
                if (result?.totalResults != null) {
                    movieList = ArrayList(result.totalResults)
                    mutableLiveData.value = movieList
                }
            }

            override fun onFailure(call: Call<MovieResult>, t: Throwable) {
            }
        })
        return mutableLiveData
    }
}