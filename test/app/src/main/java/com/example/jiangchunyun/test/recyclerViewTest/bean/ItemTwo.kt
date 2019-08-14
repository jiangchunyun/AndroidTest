package com.example.jiangchunyun.test.recyclerViewTest.bean

class ItemTwo(name:String,age:String) : Item() {
    val name:String=name
    val age:String=age
    override fun getItemType(): Int {
        return 2
    }

}