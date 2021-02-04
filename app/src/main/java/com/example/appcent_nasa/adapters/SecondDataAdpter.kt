package com.example.appcent_nasa.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appcent_nasa.R
import com.example.appcent_nasa.model.DataModel

class SecondDataAdpter(private var dataList: List<DataModel>,private val context: Context) : RecyclerView.Adapter<SecondDataAdpter.ViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_data, parent, false)
        )
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
            titleTextView=itemLayoutView.findViewById(R.id.textView2)
            titleTextView1=itemLayoutView.findViewById(R.id.textView3)
            titleTextView2=itemLayoutView.findViewById(R.id.textView4)

        }

    }

}

