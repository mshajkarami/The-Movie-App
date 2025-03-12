package ir.hajkarami.themovieapp.model
import android.widget.ImageView
import androidx.databinding.BaseObservable
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Movie : BaseObservable() {

    @SerializedName("id")
    @Expose
    var id: Int? = null
        set(value) {
            field = value
        }

    @SerializedName("title")
    @Expose
    var title: String? = null
        set(value) {
            field = value
        }

    @SerializedName("poster_path")
    @Expose
    var posterPath: String? = null
        set(value) {
            field = value
        }

    @SerializedName("release_date")
    @Expose
    var releaseDate: String? = null
        set(value) {
            field = value
        }

    @SerializedName("overview")
    @Expose
    var overview: String? = null
        set(value) {
            field = value
        }

    @SerializedName("vote_average")
    @Expose
    var voteAverage: Double? = null
        set(value) {
            field = value
        }

    companion object {
        @JvmStatic
        @BindingAdapter("posterPath")
        fun loadImage(imageView: ImageView, imageUrl: String?) {
            val imagePath = "https://image.tmdb.org/t/p/w500/$imageUrl"
            Glide.with(imageView.context)
                .load(imagePath)
                .into(imageView)
        }
    }
}
