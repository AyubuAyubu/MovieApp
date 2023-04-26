package com.bazuma.movieapp.navigation

enum class MovieScreens {
    HomeScreen,
    DetailsScreen;

    //If you want to write a function of any member of the class
    //that can be called without having to instatiate the class then use can use
    //companion object -> static keyword
    companion object{
        fun fromRoute(route:String?):MovieScreens
           =when(route?.substringBefore("/")){
               HomeScreen.name -> HomeScreen
               DetailsScreen.name -> DetailsScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognised")
           }
    }
}