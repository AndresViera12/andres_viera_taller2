package android.example.andres_viera_taller.ui.theme

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import android.example.andres_viera_taller.Screen.ContactScreen
import android.example.andres_viera_taller.Screen.HomeScreen
import android.example.andres_viera_taller.Screen.AddScreen

@Composable
fun NavigatorHostController() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "home",
        enterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(durationMillis = 700)
            )
        },
        exitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(durationMillis = 700)
            )
        },
        popEnterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(durationMillis = 700)
            )
        },
        popExitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(durationMillis = 700)
            )
        }
    ) {
        composable(route = "home") { HomeScreen(navController) }
        composable(route = "add") { AddScreen(navController) }
        composable(
            route = "contact/{userName}",
            arguments = listOf(navArgument("userName") { type = NavType.StringType }) // Argumento de tipo String
        ) { stackEntry ->
            val userName = stackEntry.arguments?.getString("userName") // Acceso al parámetro "userName"
            ContactScreen(navController, userName)
            }
        }
}


}
