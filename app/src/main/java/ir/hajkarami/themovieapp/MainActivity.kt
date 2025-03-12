package ir.hajkarami.themovieapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import ir.hajkarami.themovieapp.databinding.ActivityMainBinding
import ir.hajkarami.themovieapp.model.Movie
import ir.hajkarami.themovieapp.view.MovieAdapter
import ir.hajkarami.themovieapp.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private var movies: ArrayList<Movie> = ArrayList()
    private lateinit var movieAdapter: MovieAdapter
    private lateinit var swipeRefreshLayout: SwipeRefreshLayout
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]

        movieAdapter = MovieAdapter(this, movies)
        binding.recyclerview.apply {
            itemAnimator = DefaultItemAnimator()
            adapter = movieAdapter
            layoutManager = GridLayoutManager(this@MainActivity, 2)
        }

        swipeRefreshLayout = binding.swipeLayout
        swipeRefreshLayout.setColorSchemeResources(R.color.black)
        swipeRefreshLayout.setOnRefreshListener {
            getPopularMovies()
        }

        getPopularMovies()
    }

    private fun getPopularMovies() {
        viewModel.getAllMovies().observe(this, Observer { moviesFromLiveData ->
            movies.clear()
            movies.addAll(moviesFromLiveData)
            movieAdapter.notifyDataSetChanged()
            swipeRefreshLayout.isRefreshing = false
        })
    }
}
