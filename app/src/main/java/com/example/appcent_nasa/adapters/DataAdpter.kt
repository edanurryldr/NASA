package com.example.appcent_nasa.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appcent_nasa.R
import com.example.appcent_nasa.model.DataModel

class DataAdpter(private var dataList: List<DataModel>, private val context: Context) : RecyclerView.Adapter<DataAdpter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_home, parent, false))
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataModel=dataList.get(position)

        holder.titleTextView.text=dataModel.title
        holder.titleTextView1.text=dataModel.id
        holder.titleTextView2.text=dataModel.body
    }

    class ViewHolder(itemLayoutView: View) : RecyclerView.ViewHolder(itemLayoutView) {
        lateinit var titleTextView: TextView;
        lateinit var titleTextView1: TextView;
        lateinit var titleTextView2: TextView;
        init {
            titleTextView=itemLayoutView.findViewById(R.id.title)
            titleTextView1=itemLayoutView.findViewById(R.id.url)
            titleTextView2=itemLayoutView.findViewById(R.id.url_txt)
        itemView.setOnClickListener{}
        }

    }

}