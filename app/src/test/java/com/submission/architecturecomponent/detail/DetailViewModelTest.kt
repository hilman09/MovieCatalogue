package com.submission.architecturecomponent.detail

import com.submission.architecturecomponent.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailViewModelTest {
    private lateinit var detailViewModel: DetailViewModel
    private val movie = DataDummy.generateDummyMovies()[0]
    private val tvshow = DataDummy.generateDummyTvShow()[0]
    private val titleMovies = movie.title
    private val titleTvshow = tvshow.title

    @Before
    fun setUp(){
        detailViewModel = DetailViewModel()
        detailViewModel.setSelectedMovies(titleMovies)
        detailViewModel.setSelectedTvShow(titleTvshow)
    }

    @Test
    fun getMovies() {
        detailViewModel.setSelectedMovies(movie.title)
        val moviesEntity = detailViewModel.getMovies()
        assertNotNull(moviesEntity)
        assertEquals(movie.title, moviesEntity?.title)
        assertEquals(movie.deskription, moviesEntity?.deskription)
        assertEquals(movie.imgMovies, moviesEntity?.imgMovies)
        detailViewModel
    }

    @Test
    fun getTvShow() {
        detailViewModel.setSelectedTvShow(tvshow.title)
        val tvShowsEntity = detailViewModel.getTvShow()
        assertNotNull(tvShowsEntity)
        assertEquals(tvshow.title, tvShowsEntity?.title)
        assertEquals(tvshow.deskription, tvShowsEntity?.deskription)
        assertEquals(tvshow.imgTvShow, tvShowsEntity?.imgTvShow)
    }
}