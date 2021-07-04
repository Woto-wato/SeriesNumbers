package com.example.series

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger
import java.text.FieldPosition

class SeriesAdapter (var numList: List<BigInteger>):RecyclerView.Adapter<NumsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumsViewHolder {
        var numView=LayoutInflater.from(parent.context).inflate(R.layout.numbers_item,parent,false)
        return NumsViewHolder(numView)

    }

    override fun onBindViewHolder(holder: NumsViewHolder, position: Int) {
        holder.tvNumbers.text=numList.get(position).toString()

    }

    override fun getItemCount(): Int {
        return numList.size

    }
}



class NumsViewHolder(var numView:View):RecyclerView.ViewHolder(numView){
    var tvNumbers=numView.findViewById<TextView>(R.id.tvNumbers)



}
