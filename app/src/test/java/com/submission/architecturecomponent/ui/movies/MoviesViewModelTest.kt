package com.submission.architecturecomponent.ui.movies

import com.submission.architecturecomponent.repository.MovieRepository
import com.submission.architecturecomponent.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MoviesViewModelTest {
    private lateinit var moviesViewModel: MoviesViewModel

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Before
    fun setUp(){
        moviesViewModel = MoviesViewModel(movieRepository)
    }

    @Test
    fun getMovies() {
        `when`(movieRepository.getAllFilmMovies()).thenReturn(DataDummy.generateDummyMovies())
        val moviesEntity = moviesViewModel.getMovies()
        verify(movieRepository).getAllFilmMovies()
        assertNotNull(moviesEntity)
        assertEquals(10,moviesEntity.size)

    }
}