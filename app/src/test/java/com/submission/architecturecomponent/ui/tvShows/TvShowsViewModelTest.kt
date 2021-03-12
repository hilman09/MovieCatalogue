package com.submission.architecturecomponent.ui.tvShows

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvShowsViewModelTest {
private lateinit var tvShowsViewModel: TvShowsViewModel

    @Before
    fun setUp(){
        tvShowsViewModel = TvShowsViewModel()
    }
    @Test
    fun getTvShows() {
        val tvShowsEntity = tvShowsViewModel.getTvShows()
        assertNotNull(tvShowsEntity)
        assertEquals(10,tvShowsEntity.size)
    }
}