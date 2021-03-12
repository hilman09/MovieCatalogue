package com.submission.architecturecomponent.ui.movies

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.submission.architecturecomponent.data.local.entity.MoviesEntity
import com.submission.architecturecomponent.databinding.ItemsMoviesBinding
import com.submission.architecturecomponent.detail.DetailFilmActivity

class MoviesAdapter : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>(){
    private val listMovies = ArrayList<MoviesEntity>()

    fun setMovies(movies: List<MoviesEntity>?) {
        if (movies == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): MoviesViewHolder {
        val itemMoviesBinding = ItemsMoviesBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MoviesViewHolder(itemMoviesBinding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
       holder.bind(listMovies[position])
    }

    override fun getItemCount(): Int = listMovies.size

     class MoviesViewHolder(private val moviesBinding: ItemsMoviesBinding) : RecyclerView.ViewHolder(moviesBinding.root) {
        fun bind(movies: MoviesEntity){
            with(moviesBinding){
                moviesBinding.tvItemTitle.text = movies.title
                moviesBinding.tvItemDesktiption.text = movies.deskription
                itemView.setOnClickListener{
                    val intent = Intent(itemView.context, DetailFilmActivity::class.java)
                    intent.putExtra(DetailFilmActivity.EXTRA_DATA,movies.title)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(movies.imgMovies)
                    .into(imgMovies)

            }
        }
    }
}