package com.example.speechrecognition.NavDestinations

import android.annotation.SuppressLint
import android.window.SplashScreen
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.experiment.SpeechScreen4
import com.example.speechrecognition.Destinations
import com.example.speechrecognition.speechscreens.SpeechScreen1
import com.example.speechrecognition.speechscreens.SpeechScreen2
import com.example.speechrecognition.speechscreens.SpeechScreen3



@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NavDestinations(){


    val navController = rememberNavController()

    Scaffold {
        NavHost(navController = navController, startDestination =Destinations.speechscreen1){

            composable(Destinations.speechscreen1){
                SpeechScreen1(navController)
            }
            composable(Destinations.speechscreen2){
                SpeechScreen2(navController)
            }
            composable(Destinations.speechscreen3){
                SpeechScreen3(navController)
            }
            composable(Destinations.speechscreen4){
                SpeechScreen4()
            }

        }
    }
}