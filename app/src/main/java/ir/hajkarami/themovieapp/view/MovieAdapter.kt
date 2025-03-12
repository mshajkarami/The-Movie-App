package ir.hajkarami.themovieapp.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import ir.hajkarami.themovieapp.R
import ir.hajkarami.themovieapp.databinding.MovieListItemBinding
import ir.hajkarami.themovieapp.model.Movie

class MovieAdapter(private var movieList: List<Movie>) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding: MovieListItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.movie_list_item, parent, false
        )
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movieList[position])
    }

    override fun getItemCount(): Int = movieList.size

    fun updateData(newMovies: List<Movie>) {
        movieList = newMovies
        notifyDataSetChanged()
    }

    inner class MovieViewHolder(private val binding: MovieListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(movie: Movie) {
            binding.movie = movie
            binding.executePendingBindings()
        }

        init {
            binding.root.setOnClickListener {
            }
        }
    }
}
