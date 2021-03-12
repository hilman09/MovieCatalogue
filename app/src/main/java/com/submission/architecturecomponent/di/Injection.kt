package com.submission.architecturecomponent.di

import android.content.Context
import com.submission.architecturecomponent.repository.MovieRepository
import com.submission.architecturecomponent.data.local.RemoteDataSource
import com.submission.architecturecomponent.utils.DataDummy

object Injection {
    fun provideRepository(context: Context): MovieRepository {
        val remoteDataSource = RemoteDataSource.getInstance(DataDummy(context))
        return MovieRepository.getInstance(remoteDataSource)
    }


}