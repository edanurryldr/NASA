package com.example.appcent_nasa.model

import java.io.Serializable

data class DataModel
    (var userId:Int,
     var id:String,
     var title:String,
     var body:String): Serializable {
}