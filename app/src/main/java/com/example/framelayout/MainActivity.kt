package com.example.framelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageSet = Datas(this).getImage()
        val digitSet = Datas(this).getDigit()

        val recycleView = findViewById<RecyclerView>(R.id.rcView)
        recycleView.layoutManager = GridLayoutManager(this, 2)
        recycleView.adapter = Adapter(imageSet, digitSet)

    }
}