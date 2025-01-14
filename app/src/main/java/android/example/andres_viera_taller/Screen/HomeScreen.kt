package android.example.andres_viera_taller.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier

import androidx.navigation.NavHostController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                containerColor = Color.Red,
                onClick = { navController.navigate("add") }
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Go Back",
                    tint = Color.White
                )
            }
        },
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Red
                ),
                title = { Text(text = "Home", color = Color.White) },
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
        ) {
            ItemContact(name = "Rafael Correa", Icons.Default.Person, navController)
            HorizontalDivider()
            ItemContact(name = "Daniel Noboa",  Icons.Default.Edit, navController)
            HorizontalDivider()
            ItemContact(name = "Luisa Gonzalez", Icons.Default.Edit, navController)
            HorizontalDivider()
            ItemContact(name = "Lucio Gutierrez", Icons.Default.Edit, navController)
            HorizontalDivider()
            ItemContact(name = "Magali Orellana",  Icons.Default.Edit, navController)
            HorizontalDivider()
            ItemContact(name = "Jheymi Calapucha",  Icons.Default.Edit, navController)
            HorizontalDivider()
            ItemContact(name = "Jose Hurtado",  Icons.Default.Edit, navController)
            HorizontalDivider()
            ItemContact(name = "Naisha Ayoyovi",  Icons.Default.Edit, navController)
            }
        }
}