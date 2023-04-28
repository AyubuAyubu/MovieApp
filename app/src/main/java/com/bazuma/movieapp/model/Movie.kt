package com.bazuma.movieapp.model

data class Movie(
    val id:String,
    val title:String,
    val year :String,
    val Genre:String,
    val actors:String,
    val plot:String,
    val images:List<String>,
    val rating:String
)

fun getMovie():List<Movie>{
    return listOf(
        Movie(

        )
    )
}