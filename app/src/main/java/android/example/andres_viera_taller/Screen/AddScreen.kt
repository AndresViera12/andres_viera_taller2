package android.example.andres_viera_taller.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Green
                ),
                title = { Text(text = "Add Screen", color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft, // Correcto aquí
                            contentDescription = "Go Back"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.padding(paddingValues).fillMaxSize()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Tyrannosaurus Rex",
                    fontSize = 25.sp,
                    modifier = Modifier.background(Color.Green).padding(16.dp)
                )
                Text(
                    text = "Triceratops",
                    fontSize = 25.sp,
                    modifier = Modifier.background(Color.Green).padding(16.dp)
                )
                Text(
                    text = "Velociraptor",
                    fontSize = 25.sp,
                    modifier = Modifier.background(Color.Green).padding(16.dp)
                )
                Text(
                    text = "Brachiosaurus",
                    fontSize = 25.sp,
                    modifier = Modifier.background(Color.Green).padding(16.dp)
                )
                Text(
                    text = "Stegosaurus",
                    fontSize = 25.sp,
                    modifier = Modifier.background(Color.Green).padding(16.dp)
                )
                Text(
                    text = "Ankylosaurus",
                    fontSize = 25.sp,
                    modifier = Modifier.background(Color.Green).padding(16.dp)
                )
                Text(
                    text = "Spinosaurus",
                    fontSize = 25.sp,
                    modifier = Modifier.background(Color.Green).padding(16.dp)
                )
                Text(
                    text = "Pteranodon",
                    fontSize = 25.sp,
                    modifier = Modifier.background(Color.Green).padding(16.dp)
                )
                Text(
                    text = "Diplodocus",
                    fontSize = 25.sp,
                    modifier = Modifier.background(Color.Green).padding(16.dp)
                )
                Text(
                    text = "Allosaurus",
                    fontSize = 25.sp,
                    modifier = Modifier.background(Color.Green).padding(16.dp)
                )
            }

        }
    }
}