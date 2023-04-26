package com.example.designactivity.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.designactivity.fragment.*


class AllScreenViewPagerAdapter(
    fm: FragmentManager,
    var appName: String?
) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null

        if (appName == "WhatsApp") {
            fragment = WhatsappFragment()
        }
        if (appName == "WA Business") {
            fragment = WhatsappFragment()
        }
        if (appName == "Twitter") {
            fragment = TwitterFragment()
        }
        if (appName == "Josh") {
            fragment = JoshFragment()
        }
        if (appName == "Chingari") {
            fragment = ChingariFragment()
        }
        if (appName == "Vimeo") {
            fragment = VimeoFragment()
        }
        if (appName == "Rizzle") {
            fragment = RizzleFragment()
        }
        if (appName == "Imgur") {
            fragment = ImgurFragment()
        }
        if (appName == "Tiki") {
            fragment = TikiFragment()
        }



        return fragment!!
    }

    override fun getCount(): Int {
        return 1
    }

    override fun getPageTitle(position: Int): CharSequence? {
//        var title: String? = null
//        if (position == 0) {
//            title = "Images"
//        } else if (position == 1) {
//            title =
//                "Videos"
//        }
        return null
    }
}