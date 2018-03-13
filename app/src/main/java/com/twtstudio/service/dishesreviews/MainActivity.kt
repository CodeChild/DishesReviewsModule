package com.twtstudio.service.dishesreviews

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
    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var viewPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dishes_reviews_activity_main)
        bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        viewPager=findViewById<ViewPager>(R.id.vp_main)
        bottomNavigationView.setOnNavigationItemSelectedListener(
                object : BottomNavigationView.OnNavigationItemSelectedListener {
                    override fun onNavigationItemSelected(item: MenuItem): Boolean {
                        when (item.getItemId()) {
                            R.id.action_home -> {

                            }
                            R.id.action_fast_comment -> {

                            }
                            R.id.action_account -> {

                            }
                        }
                        return true
                    }
                })
    }
}