package com.example.designactivity.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class ViewPagerAdapter(supportFragmentManager: FragmentManager) : FragmentPagerAdapter(
    supportFragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {

    private val mFragment = ArrayList<Fragment>()
    private val mTitleList = ArrayList<String>()

    override fun getCount(): Int {
        return mFragment.size
    }

    override fun getItem(position: Int): Fragment {
        return mFragment[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mTitleList[position]
    }

    fun addFragment(fragment: Fragment, title: String) {
        mFragment.add(fragment)
        mTitleList.add(title)
    }

}


//    override fun getItem(position: Int): Fragment {
//        var fragment: Fragment? = null
//        if (position == 0) fragment = ImagesFragment() else if (position == 1) fragment =
//            VideosFragment()
//        return fragment!!
//    }
//
//
//    override fun getCount(): Int {
//        return 2
//    }
//
//    override fun getPageTitle(position: Int): CharSequence? {
//        var title: String? = null
//        var icon: Int? = null
//
//        if (position == 0) {
//            title = "Images"
//            icon = icon.
//        } else if (position == 1) {
//            title = "Videos"
//        }
//        return title
//    }