package com.submission.architecturecomponent.ui.tvShows

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.submission.architecturecomponent.data.local.entity.TvShowsEntity
import com.submission.architecturecomponent.databinding.ItemsTvshowsBinding
import com.submission.architecturecomponent.detail.DetailFilmActivity


class TvShowsAdapter : RecyclerView.Adapter<TvShowsAdapter.TvShowViewHolder>() {
    private var listTvShow = ArrayList<TvShowsEntity>()

    fun setTvShows(tvShows: List<TvShowsEntity>?){
        if(tvShows ==  null) return
            this.listTvShow.clear()
            this.listTvShow.addAll(tvShows)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
       val itemsTvshowsBinding = ItemsTvshowsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TvShowViewHolder(itemsTvshowsBinding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) =
        holder.bind(listTvShow[position])


    override fun getItemCount(): Int = listTvShow.size

    class TvShowViewHolder(private val tvShowBinding: ItemsTvshowsBinding): RecyclerView.ViewHolder(tvShowBinding.root) {
        fun bind(tvShowsEntity: TvShowsEntity){
            with(tvShowBinding){
                tvItemTitle.text = tvShowsEntity.title
                tvItemDesktiption.text = tvShowsEntity.deskription

                Glide.with(itemView.context)
                    .load(tvShowsEntity.imgTvshow)
                    .apply(RequestOptions().override(55,55))
                    .into(imgTvshows)

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context,DetailFilmActivity::class.java)
                    intent.putExtra(DetailFilmActivity.EXTRA_TV, tvShowsEntity.title)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}