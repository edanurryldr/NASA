package com.example.appcent_nasa.activity

import android.app.ProgressDialog
import androidx.appcompat.widget.SearchView
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appcent_nasa.R
import com.example.appcent_nasa.adapters.DataAdpter
import com.example.appcent_nasa.model.DataModel
import com.example.appcent_nasa.retrofit.ApiClient
import com.squareup.picasso.Picasso
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(),SearchView.OnQueryTextListener {

    lateinit var progerssProgressDialog: ProgressDialog

    var dataList = ArrayList<DataModel>()

    var sampleImages = arrayOf(

       R.drawable.image1,
       R.drawable.image3,
       R.drawable.image2,
       R.drawable.image4

    )

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)

        val carouselView = findViewById(R.id.carouselView) as CarouselView
        carouselView.setPageCount(sampleImages.size);
        carouselView.setImageListener(imageListener);

        recyclerView.adapter= DataAdpter(dataList,this)
        recyclerView.layoutManager= LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        progerssProgressDialog=ProgressDialog(this)
        progerssProgressDialog.setTitle("Loading")
        progerssProgressDialog.setCancelable(false)
        progerssProgressDialog.show()
        getDat1a()

    }

    var imageListener: ImageListener = object : ImageListener {

        override fun setImageForPosition(position: Int, imageView: ImageView) {

            Picasso.get().load(sampleImages[position]).into(imageView)
        }
    }
    private fun getDat1a() {

        val call: Call<List<DataModel>> = ApiClient.getClient.getPhotos()
        call.enqueue(object : Callback<List<DataModel>>

        {

            override fun onResponse(call: Call<List<DataModel>>?, response: Response<List<DataModel>>?) {

                progerssProgressDialog.dismiss()
                dataList.addAll(response!!.body()!!)
                recyclerView.adapter?.notifyDataSetChanged()

            }

            override fun onFailure(call: Call<List<DataModel>>?, t: Throwable?) {
                progerssProgressDialog.dismiss()

            }
        })
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        Log.e("Gönderilen Arama Sonuc",query)
       // aramaYap(query)
        return true
    }

    private fun aramaYap(query: String?) {
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        Log.e("Harf Girdikçe Sonuc",newText)
        //aramaYap(newText)
        return true    }
}
