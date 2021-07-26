@file:Suppress("DEPRECATION")

package com.example.mygallery

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import java.util.*

class MyPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val items = ArrayList<Fragment>()//뷰페이저가 표시할 프래그먼트 목록

    //position위치의 프래그먼트
    override fun getItem(position: Int): Fragment {
        return items[position]
    }

    //프래그먼트의 갯수
    override fun getCount(): Int {
        return items.size
    }

    fun updateFragments(items:List<Fragment>){ //아이템(프래그먼트) 갱신
        this.items.addAll(items)
    }


}