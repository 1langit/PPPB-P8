package com.example.pppb8

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter  (activity : AppCompatActivity) : FragmentStateAdapter(activity) {

    val page = arrayOf<Fragment>(HomeFragment(), MaterialFragment(), QuizFragment())

    override fun getItemCount(): Int {
        return page.size
    }

    override fun createFragment(position: Int): Fragment {
        return page[position]
//        return when (position) {
//            0 -> HomeFragment()
//            1 -> MaterialFragment()
//            2 -> QuizFragment()
//            else -> throw IllegalArgumentException("Position out of array")
//        }
    }
}