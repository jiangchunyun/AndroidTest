package com.example.jiangchunyun.test.recyclerViewTest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.example.jiangchunyun.test.R
import com.example.jiangchunyun.test.recyclerViewTest.bean.Item
import com.example.jiangchunyun.test.recyclerViewTest.bean.ItemOne
import com.example.jiangchunyun.test.recyclerViewTest.bean.ItemTwo

class RecyclerViewTypesActivity : AppCompatActivity() {
    private var list: ArrayList<Item> ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDate()
        initView()
    }

    private fun initView() {
        setContentView(R.layout.activity_recylcer_view_update_test)
        val mRecyclerView:RecyclerView = findViewById(R.id.recycler_view)
        val layourManager = LinearLayoutManager(this)
        layourManager.orientation=LinearLayoutManager.VERTICAL
        mRecyclerView.layoutManager=layourManager
        val itemDecoration = DividerItemDecoration(this,DividerItemDecoration.VERTICAL)
        mRecyclerView.addItemDecoration(itemDecoration)

        mRecyclerView.itemAnimator=DefaultItemAnimator()

        val adapter = RecyclerViewTypesAdapter(this,list)
        mRecyclerView.adapter=adapter

    }

    private fun initDate(){
        list = ArrayList();
        for(i in 1..5){
            list!!?.add(ItemOne("我是条目"+i.toString()))
        }
        for(i in 1..5){
            list!!?.add(ItemTwo("我是条目"+i.toString(),i.toString()))
        }
    }

}
