package com.example.andres_viera_taller.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddScreens(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Magenta
                ),
                title = { Text("VIDEO JUEGOS", color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft,
                            contentDescription = "Go Back",
                            tint = Color.White
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
//1
        Column(
            modifier = Modifier.padding(paddingValues)
        ) {
            ItemContact("Tyrannosaurus Rex", "Carnivoro")
            ItemContact("Triceratops", "Herbivoro")
            ItemContact("Velociraptor", "Carnivoro")
            ItemContact("Brachiosaurus", "Herbivoro")
            ItemContact("Stegosaurus", "Herbivoro")
            ItemContact("Ankylosaurus", "Herbivoro")
            ItemContact("Spinosaurus", "Carnivoro")
            ItemContact("Iguanodon", "Herbivoro")
            ItemContact("Allosaurus", "Carnivoro")
            ItemContact("Diplodocus", "Herbivoro")
        }
    }
}