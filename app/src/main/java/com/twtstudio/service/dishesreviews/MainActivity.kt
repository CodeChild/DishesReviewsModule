package com.twtstudio.service.dishesreviews

import android.content.res.ColorStateList
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.View


/**
 * Created by zhangyulong on 18-3-11.
 */
class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var viewPager: ViewPager
    private lateinit var viewPagerAdapter: MainPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dishes_reviews_activity_main)
        bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        viewPager = findViewById<ViewPager>(R.id.vp_main)
        viewPagerAdapter = MainPagerAdapter(supportFragmentManager)
        viewPager.adapter = viewPagerAdapter

        bottomNavigationView.apply {
            setOnNavigationItemSelectedListener(
                    object : BottomNavigationView.OnNavigationItemSelectedListener {
                        override fun onNavigationItemSelected(item: MenuItem): Boolean {
                            when (item.getItemId()) {
                                R.id.action_home -> {
                                    viewPager.currentItem = item.order
                                }
                                R.id.action_fast_comment -> {

                                }
                                R.id.action_account -> {
                                    viewPager.currentItem = item.order
                                }
                            }
                            return true
                        }
                    })
            itemIconTintList= null //不设置IconTint
        }


    }
}