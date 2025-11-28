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

