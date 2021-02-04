package com.example.appcent_nasa.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class DataModel(

    @SerializedName("userId")
    var userId: kotlin.Int,
    @SerializedName("id")
    var id: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("body")
    val body: String
)