package com.example.jiangchunyun.test.recyclerViewTest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.jiangchunyun.test.R
class RecyclerViewTestActivity : AppCompatActivity() {

    val items = listOf("item1", "item2", "item3", "item4", "item5", "item6", "item7", "item8")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView() {
        setContentView(R.layout.activity_recylcer_view_test)
        val mRecyclerView:RecyclerView = findViewById(R.id.recycler_view)
        mRecyclerView.layoutManager= LinearLayoutManager(this) as RecyclerView.LayoutManager?
        mRecyclerView.adapter=RecyclerViewAdapter(items)
    }

    private fun initDate(){

    }
}
