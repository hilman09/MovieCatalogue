package com.submission.architecturecomponent.data.local

import androidx.lifecycle.LiveData
import com.submission.architecturecomponent.data.local.entity.MoviesEntity
import com.submission.architecturecomponent.data.local.entity.TvShowsEntity

interface MovieDataSource {
    fun getAllMovies(): LiveData<List<MoviesEntity>>
    fun getAllFilmTvShow(): LiveData<List<TvShowsEntity>>
    fun getDetailMovies(moviesTitle: String): LiveData<MoviesEntity>
    fun getDetailTvshow(tvShowTitle: String): LiveData<TvShowsEntity>
}