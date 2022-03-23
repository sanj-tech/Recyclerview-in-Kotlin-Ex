package com.jsstech.recyclerviewdemo.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jsstech.recyclerviewdemo.Model.FruitsModel
import com.jsstech.recyclerviewdemo.R

class FruitListAdapter(var context: Context,var fruitList:MutableList<FruitsModel>): RecyclerView.Adapter<FruitListAdapter.FruitListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitListViewHolder {
       var view=LayoutInflater.from(context).inflate(R.layout.custom_fruit_list,parent,false)
        return FruitListViewHolder(view)
    }

    override fun onBindViewHolder(holder: FruitListViewHolder, position: Int) {
       holder.frName.text=fruitList[position].fruitsName
        holder.frColor.text=fruitList[position].fruitsColor
        holder.frTest.text=fruitList[position].fruitsTest
    }

    override fun getItemCount(): Int {
       return fruitList.size
    }

    class FruitListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var frName=itemView.findViewById<TextView>(R.id.txtV_fruitName)
        var frColor=itemView.findViewById<TextView>(R.id.txtV_fruitColor)
        var frTest=itemView.findViewById<TextView>(R.id.txtV_fruitTest)

    }

}