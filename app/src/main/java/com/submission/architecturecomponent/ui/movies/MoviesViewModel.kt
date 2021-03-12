package com.submission.architecturecomponent.ui.movies

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.submission.architecturecomponent.repository.MovieRepository
import com.submission.architecturecomponent.data.local.entity.MoviesEntity

class MoviesViewModel(private val movieRepository: MovieRepository): ViewModel() {

    fun getMovies():LiveData<List<MoviesEntity>> = movieRepository.getAllMovies()
}