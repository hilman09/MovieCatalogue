package com.submission.architecturecomponent.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.submission.architecturecomponent.repository.MovieRepository
import com.submission.architecturecomponent.detail.DetailViewModel
import com.submission.architecturecomponent.di.Injection
import com.submission.architecturecomponent.ui.movies.MoviesViewModel
import com.submission.architecturecomponent.ui.tvShows.TvShowsViewModel

@Suppress("UNCHECKED_CAST")
class ViewModelFactory private constructor(private val mMovieRepository: MovieRepository): ViewModelProvider.NewInstanceFactory() {
    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
                instance ?: synchronized(this) {
                    instance ?: ViewModelFactory(Injection.provideRepository(context))
                }
    }

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MoviesViewModel::class.java) -> {
                MoviesViewModel(mMovieRepository) as T
            }
            modelClass.isAssignableFrom(TvShowsViewModel::class.java) -> {
                TvShowsViewModel(mMovieRepository) as T
            }
            modelClass.isAssignableFrom(DetailViewModel::class.java) -> {
                DetailViewModel(mMovieRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }
    }
}