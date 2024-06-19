package com.example.game

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NumFib(var fib:List<Int>): RecyclerView.Adapter<IntNumFibHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntNumFibHolder {
      val itemView=LayoutInflater.from(parent.context).inflate(R.layout.intnumfib_list,parent,false)
        return IntNumFibHolder(itemView)
    }

    override fun onBindViewHolder(holder: IntNumFibHolder, position: Int) {
     holder.tvNumbers.text=fib[position].toString()
    }

    override fun getItemCount(): Int {
    return fib.size
    }
}

class IntNumFibHolder(itemView:View):ViewHolder(itemView){
   var  tvNumbers=itemView.findViewById<TextView>(R.id.tvNumbers)

}