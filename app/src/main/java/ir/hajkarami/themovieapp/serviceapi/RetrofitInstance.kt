package ir.hajkarami.themovieapp.serviceapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {

    companion object {
        private var retrofit: Retrofit? = null
        private val BASE_URL: String? = "https://www.themoviedb.org/3/"
    }

    fun getService(): MovieApiService {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!.create(MovieApiService::class.java)
    }
}