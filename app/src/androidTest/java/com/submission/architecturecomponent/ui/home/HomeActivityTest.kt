package com.submission.architecturecomponent.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeLeft
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.submission.architecturecomponent.R
import com.submission.architecturecomponent.utils.DataDummy
import org.junit.Before
import org.junit.Test

class HomeActivityTest{
    private val dummyMovies = DataDummy.generateDummyMovies()
    private val dummyTvshows = DataDummy.generateDummyTvShow()

    @Before
    fun setUp() {
        ActivityScenario.launch(HomeActivity::class.java)
    }

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_academy)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_academy)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovies.size))

    }
    @Test
    fun loadDetailMovies() {
        onView(withId(R.id.rv_academy)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.dtl_title)).check(matches(isDisplayed()))
        onView(withId(R.id.dtl_title)).check(matches(withText(dummyMovies[0].title)))
        onView(withId(R.id.dtl_deksription)).check(matches(isDisplayed()))
        onView(withId(R.id.dtl_deksription)).check(matches(withText(dummyMovies[0].deskription)))
    }


    @Test
    fun loadTvshow() {
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.rv_tvShow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvShow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvshows.size))

    }


    @Test
    fun loadDetailTvshow() {
        onView(isRoot()).perform(swipeLeft())
        try {
            Thread.sleep(1000)
        }catch (e: InterruptedException) {
            e.printStackTrace()
        }

        onView(withId(R.id.rv_tvShow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.dtl_title)).check(matches(isDisplayed()))
        onView(withId(R.id.dtl_title)).check(matches(withText(dummyTvshows[0].title)))
        onView(withId(R.id.dtl_deksription)).check(matches(isDisplayed()))
        onView(withId(R.id.dtl_deksription)).check(matches(withText(dummyTvshows[0].deskription)))
    }
}