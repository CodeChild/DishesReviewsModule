package com.twtstudio.service.dishesreviews.home

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.twtstudio.service.dishesreviews.R

/**
 * Created by zhangyulong on 18-3-11.
 */
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.dishes_reviews_activity_home)
    }
}