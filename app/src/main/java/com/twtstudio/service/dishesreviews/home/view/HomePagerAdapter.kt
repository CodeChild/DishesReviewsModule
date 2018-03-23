package com.twtstudio.service.dishesreviews.home.view

import android.arch.lifecycle.LifecycleOwner
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.twtstudio.service.dishesreviews.R
import com.twtstudio.service.dishesreviews.base.BaseItemViewHolder
import com.twtstudio.service.dishesreviews.base.BaseListAdapter
import kotlinx.android.synthetic.main.dishes_reviews_activity_main.view.*

/**
 * Created by zhangyulong on 18-3-22.
 */
class HomePagerAdapter(list: List<Any>, context: Context, owner: LifecycleOwner) : BaseListAdapter(list, context, owner) {
    companion object {
        const val BANNER = 1
        const val DINNING_HALL = 2
        const val AD = 3
        const val REVIEWS = 4
    }
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }
}