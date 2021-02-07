package com.example.appcent_nasa.retrofit

import com.example.appcent_nasa.model.DataModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    /*@GET("mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=DEMO_KEY&page=1")
    fun getPhotos(): Call<List<DataModel>>*/

    @GET("posts")
    fun getPhotos(): Call<List<DataModel>>

    @GET("posts/{id}")
    fun getPhotos(@Path("id") postId: Int): Call<List<DataModel>>
}