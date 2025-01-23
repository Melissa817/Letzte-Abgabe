package com.example.myapplication.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

/**
 * Entry Screen of the app with the navigator
 */
@Composable
fun Dashboard() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Dashboard") {
        composable("Dashboard") {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Button(onClick = { navController.navigate("Open_Screen") }) {
                    Text("Open ToDo's", fontSize = 24.sp)
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { navController.navigate("Close_Screen") }) {
                    Text("Close ToDo's", fontSize = 24.sp)
                }
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
        composable("Open_Screen") {
            val context = LocalContext.current
            OpenTasksScreen(
                context = context,
                navController = navController
            )
        }
        composable("Close_Screen") {
            val context = LocalContext.current
            CloseScreenTask(
                context = context,
                navController = navController
            )
        }
    }
}