package ir.hajkarami.themovieapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import ir.hajkarami.themovieapp.model.Movie
import ir.hajkarami.themovieapp.model.MovieRepository

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: MovieRepository = MovieRepository(application)
    private val moviesLiveData: LiveData<List<Movie>> = repository.getMutableLiveData()

    fun getAllMovies(): LiveData<List<Movie>> = moviesLiveData
}
