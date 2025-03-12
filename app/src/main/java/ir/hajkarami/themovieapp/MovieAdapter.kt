package ir.hajkarami.themovieapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import ir.hajkarami.themovieapp.databinding.MovieListItemBinding
import ir.hajkarami.themovieapp.model.Movie

class MovieAdapter(val context: Context, val movieArrayList: ArrayList<Movie>) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieViewHolder {
        val binding: MovieListItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.movie_list_item, parent, false
        )
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: MovieViewHolder,
        position: Int
    ) {
        val movie : Movie = movieArrayList[position]
        holder.movieListItemBinding.movie = movie
    }

    override fun getItemCount(): Int = movieArrayList.size

    inner class MovieViewHolder(val movieListItemBinding: MovieListItemBinding) :
        RecyclerView.ViewHolder(movieListItemBinding.root) {
            init {
                movieListItemBinding.root.setOnClickListener {

                }
            }
    }
}