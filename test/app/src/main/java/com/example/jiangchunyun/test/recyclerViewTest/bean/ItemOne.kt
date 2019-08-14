package com.example.jiangchunyun.test.recyclerViewTest.bean

class ItemOne(name:String) : Item() {
    val name:String = name
    override fun getItemType(): Int {
        return 1
    }

}