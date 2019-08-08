package com.example.jiangchunyun.test.recyclerViewTest

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.jiangchunyun.test.R

class RecyclerViewListClickAdapter: RecyclerView.Adapter<RecyclerViewListClickAdapter.ViewHolder> {
    private var list: ArrayList<String>?=null
    private var context: Context?=null
    private var itemClickListener: ItemClickListener?=null
    constructor(mContext:Context, list: ArrayList<String>?)
    {
        this.context=mContext
        this.list=list
    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        var view=LayoutInflater.from(context).inflate(R.layout.item_recycler_view_list_click,p0,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list?.size!!
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0?.text?.text=list!![p1]
        p0.itemView.setOnClickListener{
            itemClickListener!!.onItemClickListener(p1)
        }
    }

    fun setOnItemClickListener(itemClickListener: ItemClickListener){
        this.itemClickListener=itemClickListener
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var text: TextView = itemView!!.findViewById(R.id.tv_recycler)
    }

    interface ItemClickListener{
        fun onItemClickListener(position: Int)
    }
}
