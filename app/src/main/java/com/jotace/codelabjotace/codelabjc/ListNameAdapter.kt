package com.jotace.codelabjotace.codelabjc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_names_row.view.*

class ListNameAdapter(val onClick: (Pair<String, String>) -> Unit): RecyclerView.Adapter<ListNameAdapter.ViewHolder>() {
    var namesList = mutableListOf<Pair<String, String>>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_names_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = namesList.count()


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(namesList[position])
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(pair: Pair<String, String>) {
            with(itemView) {
                list_name.text = pair.first
                list_name_age.text = pair.second
                list_name.setOnClickListener {
                    onClick(pair)
                }

                list_name_age.setOnClickListener{ list_name.callOnClick() }
            }
        }
    }
}