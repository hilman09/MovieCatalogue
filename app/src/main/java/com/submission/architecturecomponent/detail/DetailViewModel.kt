package com.submission.architecturecomponent.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.submission.architecturecomponent.repository.MovieRepository
import com.submission.architecturecomponent.data.local.entity.MoviesEntity
import com.submission.architecturecomponent.data.local.entity.TvShowsEntity

class DetailViewModel(private val movieRepository: MovieRepository) : ViewModel() {
    private lateinit var moviesTitle: String
    private lateinit var tvShowTitel: String

    fun setSelectedMovies(moviesTitle: String) {
        this.moviesTitle = moviesTitle
    }

    fun setSelectedTvShow(tvShowTitel: String) {
        this.tvShowTitel = tvShowTitel
    }

    fun getMovies():LiveData <MoviesEntity> = movieRepository.getDetailMovies(moviesTitle)


    fun getTvShow(): LiveData <TvShowsEntity> = movieRepository.getDetailTvshow(tvShowTitel)

}