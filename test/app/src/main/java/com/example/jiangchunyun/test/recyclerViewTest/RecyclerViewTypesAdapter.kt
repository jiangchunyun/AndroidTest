package com.example.jiangchunyun.test.recyclerViewTest

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.jiangchunyun.test.R
import com.example.jiangchunyun.test.recyclerViewTest.bean.Item
import com.example.jiangchunyun.test.recyclerViewTest.bean.ItemOne
import com.example.jiangchunyun.test.recyclerViewTest.bean.ItemTwo

class RecyclerViewTypesAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private var list: ArrayList<Item>?=null
    private var context: Context?=null
    constructor(mContext:Context, list: ArrayList<Item>?)
    {
        this.context=mContext
        this.list=list
    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        var view:View
        if(p1==1){
             view=LayoutInflater.from(context).inflate(R.layout.item_recycler_view_type1,p0,false)
             return ViewHolder1(view)
        }else {
             view = LayoutInflater.from(context).inflate(R.layout.item_recycler_view_type2, p0, false)
             return ViewHolder2(view)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return list?.get(position)?.getItemType()!!
    }
    override fun getItemCount(): Int {
        return list?.size!!
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        if(p0 is ViewHolder1){
            p0.name.text=(list?.get(p1) as ItemOne).name
        }else if(p0 is ViewHolder2){
            p0.name.text=(list?.get(p1) as ItemTwo).name
            p0.age.text=(list?.get(p1) as ItemTwo).age
        }
    }



    class ViewHolder1(itemView:View):RecyclerView.ViewHolder(itemView){
        var name: TextView = itemView!!.findViewById(R.id.tv_name)
    }
    class ViewHolder2(itemView:View):RecyclerView.ViewHolder(itemView){
        var name: TextView = itemView!!.findViewById(R.id.tv_name)
        var age: TextView = itemView!!.findViewById(R.id.tv_age)
    }

}
