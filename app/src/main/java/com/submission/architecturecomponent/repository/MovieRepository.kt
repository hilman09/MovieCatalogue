package com.submission.architecturecomponent.repository


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.submission.architecturecomponent.data.local.MovieDataSource
import com.submission.architecturecomponent.data.local.entity.MoviesEntity
import com.submission.architecturecomponent.data.local.RemoteDataSource
import com.submission.architecturecomponent.data.local.entity.TvShowsEntity


class MovieRepository private constructor(private val remoteDataSource: RemoteDataSource): MovieDataSource  {

    companion object {
        @Volatile
        private var instance: MovieRepository? = null

        fun getInstance(remoteData: RemoteDataSource): MovieRepository =
                instance ?: synchronized(this) {
                    instance ?: MovieRepository(remoteData)
                }
    }

    override fun getAllMovies(): LiveData<List<MoviesEntity>> {
        val movieResult = MutableLiveData <List<MoviesEntity>>()
        remoteDataSource.getAllFilmMovies(object : RemoteDataSource.LoadMoviesCallback {
            override fun onAllMoviesReceived(moviesEntity: List<MoviesEntity>) {
                val movieList = ArrayList<MoviesEntity>()
                for(response in moviesEntity ){
                    val movie = MoviesEntity(
                        response.title,
                        response.deskription,
                        response.imgMovies )
                    movieList.add(movie)
                }
                movieResult.postValue(movieList)
            }

        })
        return movieResult
    }
    override fun getAllFilmTvShow(): LiveData<List<TvShowsEntity>> {
       val tvShowResult = MutableLiveData<List<TvShowsEntity>>()
        remoteDataSource.getAllFilmTvShow(object : RemoteDataSource.LoadTvshowCallback {
            override fun onAllTvshowReceived(tvShowsEntity: List<TvShowsEntity>) {
                val tvShowList = ArrayList<TvShowsEntity>()
                for(response in tvShowsEntity){
                    val tvshow = TvShowsEntity(
                        response.title,
                        response.deskription,
                        response.imgTvshow )
                    tvShowList.add(tvshow)
            }
                tvShowResult.postValue(tvShowList)
        }

       })
        return tvShowResult
    }

    override fun getDetailMovies(moviesTitle: String): LiveData<MoviesEntity> {
       val detailResult = MutableLiveData<MoviesEntity>()
        remoteDataSource.getAllFilmMovies(object : RemoteDataSource.LoadMoviesCallback {
            override fun onAllMoviesReceived(moviesEntity: List<MoviesEntity>) {
                lateinit var movies : MoviesEntity
                for (response in moviesEntity){
                    if (response.title == moviesTitle ){
                        movies = MoviesEntity(response.title,response.deskription,response.imgMovies)
                    }
                }
                detailResult.postValue(movies)
            }
        })
        return detailResult
    }

    override fun getDetailTvshow(tvShowTitle: String): LiveData<TvShowsEntity> {
        val detailTvResult = MutableLiveData<TvShowsEntity>()
        remoteDataSource.getAllFilmTvShow(object : RemoteDataSource.LoadTvshowCallback{
            override fun onAllTvshowReceived(tvShowsEntity: List<TvShowsEntity>) {
                lateinit var tvshow : TvShowsEntity
                for (response in tvShowsEntity){
                    if (response.title == tvShowTitle ){
                        tvshow = TvShowsEntity(response.title, response.deskription, response.imgTvshow )
                    }
                }
                detailTvResult.postValue(tvshow)
            }
        })

        return detailTvResult
    }



}
