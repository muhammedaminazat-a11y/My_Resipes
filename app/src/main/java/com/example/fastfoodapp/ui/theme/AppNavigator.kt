package com.example.fastfoodapp.ui.theme

import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fastfoodapp.BottomBar
import com.example.fastfoodapp.SplashScreen
import com.example.fastfoodapp.ui.theme.Activites.CardFoodsInCategory
import com.example.fastfoodapp.ui.theme.Activites.CardsInCategories
import com.example.fastfoodapp.ui.theme.Activites.CategoryCard
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.milliseconds

@Composable
fun AppNavigation(){
    var navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "splash_screen"
    ) {
        composable(
            "splash_screen",
            exitTransition = { fadeOut(animationSpec = tween(1000)) },
            ) {
                // LaunchedEffect запускается один раз при появлении экрана
                LaunchedEffect(Unit) {
                    delay(1000L) // Ждем 1 секунду

                    // Переходим на главный экран и ДОПОЛНИТЕЛЬНО удаляем splash из истории
                    navController.navigate("main_screen") {
                        popUpTo("splash_screen") { inclusive = true }
                    }
                }
                // Просто отображаем экран сплеша
                SplashScreen()
            }

        composable("main_screen") {
            CategoryCard(
                clicked = {
                    Log.i("!!!", "clicked")
                    navController.navigate("cards_in_categories")
                }
            )
        }
        composable ("cards_in_categories"){
            CardsInCategories(categoryName = "Бургеры")
        }
    }
}
