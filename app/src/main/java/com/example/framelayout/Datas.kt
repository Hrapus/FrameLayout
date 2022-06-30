package com.example.framelayout

import android.content.Context

class Datas(context: Context) {

    fun getImage(): Array<Int> {
        return imageArray
    }

    fun getDigit(): Array<Int>{
        return digitArr
    }

    val digitArr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val imageArray = arrayOf(
        R.drawable.digit_0,
        R.drawable.digit_1,
        R.drawable.digit_2,
        R.drawable.digit_3,
        R.drawable.digit_4,
        R.drawable.digit_5,
        R.drawable.digit_6,
        R.drawable.digit_7,
        R.drawable.digit_8,
        R.drawable.digit_9,
    )
}