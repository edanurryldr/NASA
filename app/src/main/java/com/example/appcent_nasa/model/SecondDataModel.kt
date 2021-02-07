package com.example.appcent_nasa.model

import java.io.Serializable


data class SecondDataModel (var img_src:String,var earth_date:String,var rover:List<Rover>,var camera:List<Camera>):Serializable{
}