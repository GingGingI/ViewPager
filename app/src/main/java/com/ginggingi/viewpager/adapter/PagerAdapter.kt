package com.ginggingi.viewpager.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.ginggingi.viewpager.Fragment.PageFragment

/**
 * Created by GingGingI on 2018-12-16.
 */

class PagerAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return PageFragment.create(position)
    }

    override fun getCount(): Int {
        return 5
    }

}