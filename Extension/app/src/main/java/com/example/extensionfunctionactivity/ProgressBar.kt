package com.example.extensionfunctionactivity

import android.view.View
import android.widget.ProgressBar

fun ProgressBar(P: ProgressBar): Int {

    var a = View.VISIBLE.also { P.visibility = it }

    return a

}