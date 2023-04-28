package com.bazuma.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.bazuma.movieapp.screens.details.DetailsScreen
import com.bazuma.movieapp.screens.home.HomeScreen

@Composable
fun MovieNavigation(){
    //Central Api of Navigation Components
    //It help everything to happen
    val navController = rememberNavController()

    //Host everything on the graph by able to swap out each
    //destination/composable
    NavHost(navController =navController ,
        startDestination = MovieScreens.HomeScreen.name){

        //Building Nav Graph
        composable(MovieScreens.HomeScreen.name){
            //here we pass where this should lead us to
          HomeScreen(navController=navController)
        }

        composable(MovieScreens.DetailsScreen.name+"/{movie}",
                arguments = listOf(navArgument(name = "movie"){type=NavType.StringType}))
            {
                backStackEntry ->
              DetailsScreen(navController=navController,backStackEntry.arguments?.getString("movie"))
           }
      }
}