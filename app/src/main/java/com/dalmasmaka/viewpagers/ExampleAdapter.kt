package com.dalmasmaka.viewpagers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ExampleAdapter (val contentList:MutableList<ImageItem>)
    :RecyclerView.Adapter<ExampleAdapter.ViewHolder>(){
    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val pageImage :ImageView
        init{
            pageImage=view.findViewById(R.id.pageImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.page_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Picasso.get().load(contentList[position].url).into(holder.pageImage)
    }


    override fun getItemCount(): Int =contentList.size

}