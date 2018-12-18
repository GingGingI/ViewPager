package com.ginggingi.viewpager

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.ginggingi.viewpager.adapter.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var vP: ViewPager
    private lateinit var  adapter: PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        vP = Pager
        adapter = PagerAdapter(supportFragmentManager)
        vP.adapter = adapter
    }

}
