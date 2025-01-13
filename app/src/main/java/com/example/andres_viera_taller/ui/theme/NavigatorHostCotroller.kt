package com.example.andres_viera_taller.ui.theme

import androidx.compose.animation.AnimatedContentTransitionScope

import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import screen.HomeScreen
import screen.addScreen

@Composable
fun NavigatorHostController() {
    val navController = rememberNavController() // Cambiado a 'val' ya que no se modifica

    NavHost(
        navController = navController,
        startDestination = "home",
        enterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(700)
            )
        },
        exitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(700)
            )
        },
        popEnterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(700)
            )
        },
        popExitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(700)
            )
        } // Cerrando correctamente el bloque de popExitTransition
    ) {
        composable(route = "home") { HomeScreen(navController) } // Pasando 'navController' a HomeScreen
        composable(route = "add") { addScreen(navController) } // Pasando 'navController' a addScreen
    }
}
