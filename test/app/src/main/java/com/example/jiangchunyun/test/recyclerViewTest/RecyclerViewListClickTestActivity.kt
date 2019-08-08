package com.example.jiangchunyun.test.recyclerViewTest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.example.jiangchunyun.test.R
class RecyclerViewListClickTestActivity : AppCompatActivity() {
    private var list: ArrayList<String> ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDate()
        initView()
    }

    private fun initView() {
        setContentView(R.layout.activity_recylcer_view_list_click_test)
        val mRecyclerView:RecyclerView = findViewById(R.id.recycler_view)
        val layourManager = LinearLayoutManager(this)
        layourManager.orientation=LinearLayoutManager.VERTICAL
        mRecyclerView.layoutManager=layourManager
        val itemDecoration = DividerItemDecoration(this,DividerItemDecoration.VERTICAL)
        mRecyclerView.addItemDecoration(itemDecoration)

        mRecyclerView.itemAnimator=DefaultItemAnimator()

        val adapter = RecyclerViewListClickAdapter(this,list)
        mRecyclerView.adapter=adapter

        adapter!!.setOnItemClickListener(object:RecyclerViewListClickAdapter.ItemClickListener{
            override fun onItemClickListener(position: Int) {
                Toast.makeText(applicationContext,list!![position],Toast.LENGTH_LONG).show()
            }
        })

    }

    private fun initDate(){
        list = ArrayList();
        for(i in 1..20){
            list!!?.add("我是条目"+i.toString())
        }
    }
}
