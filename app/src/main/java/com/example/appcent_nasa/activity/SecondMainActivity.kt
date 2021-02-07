package com.example.appcent_nasa.activity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.appcent_nasa.R
import com.example.appcent_nasa.model.DataModel
import com.example.appcent_nasa.retrofit.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SecondMainActivity : AppCompatActivity() {
    var dataList = ArrayList<DataModel>()

    private lateinit var getToData: DataModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_data)

        var titleTextView: TextView;
        var titleTextView1: TextView;
         var titleTextView2: TextView;
            titleTextView=findViewById(R.id.textView2)
            titleTextView1=findViewById(R.id.textView3)
            titleTextView2=findViewById(R.id.textView4)

        getToData = intent.getSerializableExtra("sendToData")as DataModel
        titleTextView.setText(getToData.id)
        titleTextView1.setText(getToData.title)
        titleTextView2.setText(getToData.body)
    }

}
