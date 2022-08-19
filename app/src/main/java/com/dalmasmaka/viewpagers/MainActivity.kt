package com.dalmasmaka.viewpagers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    lateinit var viewpager:ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpager=findViewById(R.id.viewpager)
        val list =
            mutableListOf<ImageItem>(
                ImageItem("https://i.ytimg.com/vi/YjRatEcJuHw/maxresdefault.jpg"),
                ImageItem("https://i.ytimg.com/vi/YjRatEcJuHw/maxresdefault.jpg"),
                ImageItem("https://i.ytimg.com/vi/YjRatEcJuHw/maxresdefault.jpg"),
                ImageItem("https://i.ytimg.com/vi/YjRatEcJuHw/maxresdefault.jpg"),
                ImageItem("https://i.ytimg.com/vi/YjRatEcJuHw/maxresdefault.jpg")
        )
        val adapter = ExampleAdapter(list)
        viewpager.adapter=adapter
        viewpager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                println("on page scroll $position $positionOffset $positionOffsetPixels")
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                println("on page scroll $position")
            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
                println("on page scroll state $state")
            }
        })
    }
}