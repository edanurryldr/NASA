package com.example.appcent_nasa.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appcent_nasa.R
import com.example.appcent_nasa.activity.SecondMainActivity
import com.example.appcent_nasa.model.DataModel


class DataAdpter(private var dataList: ArrayList<DataModel>, private val context: Context) : RecyclerView.Adapter<DataAdpter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_home, parent, false))

    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataModel=dataList.get(position)

        holder.moreBtn.setOnClickListener{
            var intent = Intent(context,SecondMainActivity::class.java)
            intent.putExtra("sendToData",dataModel)
            context.startActivity(intent)
        }
        holder.name.text=dataModel.title
        holder.rating.text=dataModel.id
        holder.released.text=dataModel.id
        holder.releaseds.text=dataModel.body

    }

    class ViewHolder(itemLayoutView: View) : RecyclerView.ViewHolder(itemLayoutView) {
         var name: TextView;
         var rating: TextView;
         var released: TextView;
         var releaseds: TextView;
         var moreBtn: ImageButton;

        init {
            name=itemLayoutView.findViewById(R.id.title)
            rating=itemLayoutView.findViewById(R.id.url)
            released=itemLayoutView.findViewById(R.id.url_txt)
            releaseds=itemLayoutView.findViewById(R.id.urll)
            moreBtn=itemLayoutView.findViewById(R.id.moreBtn)

        }

    }

}