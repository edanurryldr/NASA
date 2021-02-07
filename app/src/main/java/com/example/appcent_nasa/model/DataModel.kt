package com.example.appcent_nasa.model

import java.io.Serializable

data class DataModel
//(var photos:List<SecondDataModel>):Serialiable{}
    (var userId:Int,
     var id:String,
     var title:String,
     var body:String): Serializable {
}