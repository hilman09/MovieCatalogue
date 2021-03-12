package com.submission.architecturecomponent.ui.movies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.submission.architecturecomponent.databinding.FragmentMoviesBinding
import com.submission.architecturecomponent.viewmodel.ViewModelFactory

class MoviesFragment : Fragment() {

    private lateinit var moviesFragmentBinding: FragmentMoviesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        moviesFragmentBinding = FragmentMoviesBinding.inflate(layoutInflater,container,false)
        return moviesFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(activity != null){

            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[MoviesViewModel::class.java]


            val moviesAdapter = MoviesAdapter()

            moviesFragmentBinding.progressBar.visibility = View.VISIBLE
            viewModel.getMovies().observe(this, { movies ->
                moviesFragmentBinding.progressBar.visibility = View.GONE
                moviesAdapter.setMovies(movies)
                moviesAdapter.notifyDataSetChanged()
            })

            with(moviesFragmentBinding.rvAcademy){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = moviesAdapter
            }
        }
    }

}