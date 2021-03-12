package com.submission.architecturecomponent.ui.tvShows

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.submission.architecturecomponent.databinding.FragmentTvShowsBinding
import com.submission.architecturecomponent.viewmodel.ViewModelFactory


class TvShowsFragment : Fragment() {
    private lateinit var tvShowsBinding: FragmentTvShowsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        tvShowsBinding = FragmentTvShowsBinding.inflate(layoutInflater,container,false)
        return tvShowsBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(activity != null){

            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[TvShowsViewModel::class.java]


            val tvShowsAdapter = TvShowsAdapter()

            tvShowsBinding.progressBar.visibility = View.INVISIBLE
            viewModel.getTvShows().observe(this, {tvshow ->
                tvShowsBinding.progressBar.visibility = View.GONE
                tvShowsAdapter.setTvShows(tvshow)
                tvShowsAdapter.notifyDataSetChanged()
            })

            with(tvShowsBinding.rvTvShow){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvShowsAdapter
            }
        }
    }

}