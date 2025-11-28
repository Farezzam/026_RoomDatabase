package com.example.pertemuan9.view.uicontroller

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan9.view.route.DestinasiEntry
import java.lang.reflect.Modifier

@Composable
fun SiswaApp(navController: NavController= rememberNavController(),
             modifier: Modifier){
    HostNavigasi(navController = navController)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HostNavigasi(
    navController: NavController,
    modifier: Modifier = Modifier
){
    NavHost(navController=navController, startDestination = DestinasiHome.route,
        modifier = Modifier)
    {
        composable(DestinasiHome.route){
            HomeScreen(
                navigateToItemEntry = {navController.navigate(DestinasiEntry.route)},
            )
        }
        composable(DestinasiEntry.route){
            EntrySiswaScreen(navigateBack = {navController.popBackStack()})
        }
    }
}