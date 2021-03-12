package com.submission.architecturecomponent.ui.tvShows

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.submission.architecturecomponent.repository.MovieRepository
import com.submission.architecturecomponent.data.local.entity.TvShowsEntity


class TvShowsViewModel(private val movieRepository: MovieRepository) : ViewModel() {
    fun getTvShows():LiveData <List<TvShowsEntity>> = movieRepository.getAllFilmTvShow()
}