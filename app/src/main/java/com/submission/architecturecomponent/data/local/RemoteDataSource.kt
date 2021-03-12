package com.submission.architecturecomponent.data.local

import com.submission.architecturecomponent.data.local.entity.MoviesEntity
import com.submission.architecturecomponent.data.local.entity.TvShowsEntity
import com.submission.architecturecomponent.utils.DataDummy


@Suppress("DEPRECATION")
class RemoteDataSource private constructor(private val dataDummy: DataDummy) {

    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: DataDummy): RemoteDataSource =
                instance ?: synchronized(this){
                    instance ?: RemoteDataSource(helper)
                }

    }
    fun getAllFilmMovies(callback: LoadMoviesCallback) {
       callback.onAllMoviesReceived(dataDummy.generateDummyMovies())
    }
    fun getAllFilmTvShow(callback: LoadTvshowCallback){
       callback.onAllTvshowReceived(dataDummy.generateDummyTvShow())
    }

    interface LoadMoviesCallback {
        fun onAllMoviesReceived(moviesEntity: List<MoviesEntity>)
    }

    interface LoadTvshowCallback {
        fun onAllTvshowReceived(tvShowsEntity: List<TvShowsEntity>)
    }
}