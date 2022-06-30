package com.example.framelayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val array: Array<Int>, val digits: Array<Int>) :
    RecyclerView.Adapter<Adapter.Holder>() {

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imView: ImageView = itemView.findViewById(R.id.imView)
        val dView: TextView = itemView.findViewById(R.id.tView)

        fun bind(number: Int, digit: Int) {
            imView.setImageResource(number)
            dView.text = digit.toString()
        }
    }

    //1.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.itemview, parent, false)
        return Holder(view)
    }


    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(array[position], digits[position])
    }

    override fun getItemCount(): Int {
        return array.size
    }

}