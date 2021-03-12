package com.submission.architecturecomponent.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.submission.architecturecomponent.data.local.entity.MoviesEntity
import com.submission.architecturecomponent.data.local.entity.TvShowsEntity
import com.submission.architecturecomponent.databinding.ActivityDetailFilmBinding
import com.submission.architecturecomponent.databinding.ContentDetailFilmBinding
import com.submission.architecturecomponent.viewmodel.ViewModelFactory

@Suppress("CAST_NEVER_SUCCEEDS")
class DetailFilmActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_DATA = "extra_data"
        const val EXTRA_TV = "extra_tv"
    }
    private lateinit var detailFilmBinding: ContentDetailFilmBinding
    private lateinit var activityDetailFilmBinding: ActivityDetailFilmBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityDetailFilmBinding = ActivityDetailFilmBinding.inflate(layoutInflater)
        detailFilmBinding = activityDetailFilmBinding.detailContent
        setContentView(activityDetailFilmBinding.root)

        setSupportActionBar(activityDetailFilmBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this,factory)[DetailViewModel::class.java]

        val extrasMovie = intent.extras
        if(extrasMovie != null){
            val movies = extrasMovie.getString(EXTRA_DATA)

            if( movies != null) {
                activityDetailFilmBinding.progressBar.visibility = View.VISIBLE
                activityDetailFilmBinding.content.visibility = View.INVISIBLE
                viewModel.setSelectedMovies(movies)
                viewModel.getMovies().observe(this, {
                    activityDetailFilmBinding.progressBar.visibility = View.GONE
                    activityDetailFilmBinding.content.visibility = View.VISIBLE
                    getMovie(it)
                })
            }
        }
        val extras = intent.extras
        if(extras != null){
            val tvshow = extras.getString(EXTRA_TV)

            if (tvshow != null){
                activityDetailFilmBinding.progressBar.visibility = View.VISIBLE
                activityDetailFilmBinding.content.visibility = View.INVISIBLE
                viewModel.setSelectedTvShow(tvshow)
                viewModel.getTvShow().observe(this, {
                    activityDetailFilmBinding.progressBar.visibility = View.GONE
                    activityDetailFilmBinding.content.visibility = View.VISIBLE
                    getTvShow(it)
                })
            }
        }
    }

    private fun getMovie(movies: MoviesEntity){
        detailFilmBinding.dtlTitle.text = movies.title
        detailFilmBinding.dtlDeksription.text = movies.deskription
        Glide.with(this)
                .load(movies.imgMovies)
                .into(detailFilmBinding.dtlImg)
    }

    private fun getTvShow(tvShowsEntity: TvShowsEntity){
        detailFilmBinding.dtlTitle.text = tvShowsEntity.title
        detailFilmBinding.dtlDeksription.text = tvShowsEntity.deskription
        Glide.with(this)
                .load(tvShowsEntity.imgTvshow)
                .into(detailFilmBinding.dtlImg)
    }
}