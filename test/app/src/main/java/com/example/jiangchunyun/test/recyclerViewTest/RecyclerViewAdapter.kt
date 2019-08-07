package com.example.jiangchunyun.test.recyclerViewTest

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

class RecyclerViewAdapter(val items : List<String>):RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(TextView(p0.context))
    }

    override fun getItemCount(): Int {
        return items.size;
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.textView.text=items[p1]
    }

    class ViewHolder(val textView: TextView): RecyclerView.ViewHolder(textView)
}