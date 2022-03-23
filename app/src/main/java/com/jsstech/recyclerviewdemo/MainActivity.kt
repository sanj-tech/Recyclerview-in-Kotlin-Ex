package com.jsstech.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.jsstech.recyclerviewdemo.Adapters.FruitListAdapter
import com.jsstech.recyclerviewdemo.Model.FruitsModel

class MainActivity : AppCompatActivity() {
    lateinit var fruitsRecv: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        fruitsRecv = findViewById(R.id.rcv)
        var fruitList = mutableListOf<FruitsModel>()
        fruitList.add(FruitsModel("Apple", "Red", "Sweet"))
        fruitList.add(FruitsModel("Mango", "Yellow", "Sweet"))
        fruitList.add(FruitsModel("Grapes", "Green", "Sour"))
        fruitList.add(FruitsModel("WaterMelon", "Red", "Sweet"))
        fruitList.add(FruitsModel("Orange", "Orange", "Sour"))
        fruitList.add(FruitsModel("Papaya", "Yellow", "Sweet"))
        fruitList.add(FruitsModel("Papaya", "Yellow", "Sweet"))
        fruitList.add(FruitsModel("Papaya", "Yellow", "Sweet"))
        fruitList.add(FruitsModel("Papaya", "Yellow", "Sweet"))
        fruitList.add(FruitsModel("Papaya", "Yellow", "Sweet"))
        fruitList.add(FruitsModel("Papaya", "Yellow", "Sweet"))
        fruitList.add(FruitsModel("Papaya", "Yellow", "Sweet"))
        fruitList.add(FruitsModel("Papaya", "Yellow", "Sweet"))
        fruitList.add(FruitsModel("Papaya", "Yellow", "Sweet"))


        var fruitListAdapter = FruitListAdapter(this, fruitList)

        //for LinearLayout
       // fruitsRecv.layoutManager = LinearLayoutManager(this)

        //forStaggered Layout
        fruitsRecv.layoutManager =
            StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)

        fruitsRecv.adapter = fruitListAdapter

    }
}