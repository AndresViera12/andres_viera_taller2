package com.example.andres_viera_taller.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun HomeScreens(navController: NavHostController) {
    Scaffold(

        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Green
                ),
                title = { Text("HOME", color = Color.White) }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                containerColor = Color.Green,
                onClick = { navController.navigate("add") }
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Go to Add Screen",
                    tint = Color.White
                )
            }
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier.padding(paddingValues)
        ) {
            ItemContact("Carnotaurus", "Carnivoro")
            ItemContact("Parasaurolophus", "Herbivoro")
            ItemContact("Pachycephalosaurus", "Herbivoro")
            ItemContact("Gigantosaurus", "Carnivoro")
            ItemContact("Corythosaurus", "Herbivoro")
            ItemContact("Therizinosaurus", "Herbivoro")
            ItemContact("Compsognathus", "Carnivoro")
            ItemContact("Edmontosaurus", "Herbivoro")
            ItemContact("Kentrosaurus", "Herbivoro")
            ItemContact("Deinonychus", "Carnivoro")
        }

    }
}